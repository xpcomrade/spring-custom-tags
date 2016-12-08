package com.xpcomrade.study.spring.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by xpcomrade on 2016/10/27.
 * Copyright (c) 2016, xpcomrade@gmail.com All Rights Reserved.
 * Description: TODO(这里用一句话描述这个类的作用). <br/>
 */
public class JobScanNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("job-scan", new JobScanBeanDefinitionParser());
    }
}
