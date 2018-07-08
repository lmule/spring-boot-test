package com.xingchengju.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource(value = "classpath:/dev/db.properties")
public class DBHelper {

    @Value("${db.host}")
    private String host;

}
