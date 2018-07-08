package com.xingchengju.common.interceptor;

//import com.xingchengju.common.vo.ResponseVO;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class ResponseInterceptor {
//
//    @Before(value = "com.xingchengju.common.interceptor.ControllerPointCuts.controllers()")
//    public void before(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] before advise");
//    }
//
//    @Around(value = "com.xingchengju.common.interceptor.ControllerPointCuts.controllers()")
//    public Object around(ProceedingJoinPoint pjp) throws  Throwable{
//        ResponseVO vo = new ResponseVO();
//        vo.setCode(0);
//        vo.setData(pjp.proceed());
//        vo.setMessage("");
//        return vo;
//    }

//    @AfterReturning(value = "com.xingchengju.hello.PointCuts.aopDemo()")
//    public void afterReturning(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] afterReturning advise");
//    }

//    @AfterThrowing(value = "com.xingchengju.common.interceptor.ControllerPointCuts.controllers()", throwing = "ex")
//    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
//        writeContent(ex.getMessage());
//    }

//    @After(value = "com.xingchengju.hello.PointCuts.aopDemo()")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] after advise");
//    }

//    private void writeContent(String content) {
//        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//        response.reset();
//        response.setCharacterEncoding("UTF-8");
//        response.setHeader("Content-Type", "application/json;charset=UTF-8");
//        PrintWriter writer = null;
//        try {
//            writer = response.getWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        writer.print(content);
//        writer.flush();
//        writer.close();
//    }

//}
