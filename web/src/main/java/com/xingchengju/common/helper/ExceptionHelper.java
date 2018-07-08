package com.xingchengju.common.helper;

import com.xingchengju.common.vo.ResponseVO;

/**
 * 异常处理
 */
public class ExceptionHelper {

    /**
     * 异常处理的统一入口
     * @param exception
     * @return
     */
    public static ResponseVO handle(Exception exception) {
        return new ResponseVO(-1, "", exception.getMessage());
    }

}
