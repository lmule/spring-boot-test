package com.xingchengju.controller;

import com.xingchengju.common.controller.BaseController;
import com.xingchengju.domain.User;
import com.xingchengju.domain.UserService;
import com.xingchengju.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public Object test(@RequestParam boolean throwException) throws BizException {
        User a = userService.findByName("a");
        if (throwException) {
            System.out.println("throw an exception");
            throw new BizException("mock a server exception");
        }

        return 1;
    }

}
