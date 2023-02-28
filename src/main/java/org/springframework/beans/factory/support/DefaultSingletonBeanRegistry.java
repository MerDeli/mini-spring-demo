package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:
 * @createTime: 2023/02/28 13:18:59
 * @version:
 * @Description:
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String,Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }


    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }
}
