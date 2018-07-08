package com.xingchengju.domain;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface UserService {

    User findByName(String name);

    int insert(String name, Integer age);
}
