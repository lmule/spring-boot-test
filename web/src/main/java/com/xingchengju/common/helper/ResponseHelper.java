package com.xingchengju.common.helper;

import com.xingchengju.common.vo.ResponseVO;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.regex.Pattern;

/**
 * 统一响应输出（包括正常返回和异常返回）
 */
@RestControllerAdvice
public class ResponseHelper implements ResponseBodyAdvice {

    @Override
    public Object beforeBodyWrite(Object returnValue,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class clazz,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        if (returnValue instanceof Exception) {
            return ExceptionHelper.handle((Exception) returnValue);
        }
        return new ResponseVO(returnValue);
    }

    @Override
    public boolean supports(MethodParameter methodParameter, Class clas) {
        String controllerName = methodParameter.getExecutable().getDeclaringClass().getName();
        String methodName = methodParameter.getMethod().getName();
        // 如果是controller或者exceptionHandler返回的异常，才允许走beforeBodyWrite这个逻辑
        return Pattern.matches("com.xingchengju.controller.*", controllerName) || methodName.equals("exceptionHandler");
    }

    @ExceptionHandler(value = { Exception.class })
    public Exception exceptionHandler(Exception ex) {
        return ex;
    }

}
