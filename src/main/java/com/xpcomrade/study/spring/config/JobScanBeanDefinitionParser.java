package com.xpcomrade.study.spring.config;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Created by xpcomrade on 2016/10/27.
 * Copyright (c) 2016, xpcomrade@gmail.com All Rights Reserved.
 * Description: TODO(这里用一句话描述这个类的作用). <br/>
 */
public class JobScanBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("basePackage", element.getAttribute("base-package"));

        AbstractBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(SpringContextJobScan.class);
        beanDefinition.setPropertyValues(propertyValues);
        beanDefinition.setInitMethodName("init");

        BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinition, parserContext.getRegistry());

        return beanDefinition;
    }
}
