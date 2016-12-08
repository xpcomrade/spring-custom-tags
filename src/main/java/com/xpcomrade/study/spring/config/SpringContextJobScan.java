package com.xpcomrade.study.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by xpcomrade on 2016/10/27.
 * Copyright (c) 2016, xpcomrade@gmail.com All Rights Reserved.
 * Description: TODO(这里用一句话描述这个类的作用). <br/>
 */
public class SpringContextJobScan implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private String basePackage;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void init () {
        System.out.println("Here is do nothing, but you can....");
    }
}
