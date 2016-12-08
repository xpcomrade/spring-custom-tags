package com.xpcomrade.study.spring.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xpcomrade on 2016/10/27.
 * Copyright (c) 2016, xpcomrade@gmail.com All Rights Reserved.
 * Description: TODO(这里用一句话描述这个类的作用). <br/>
 */
public class JobScanTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
