package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author:
 * @createTime: 2023/02/28 13:56:04
 * @version:
 * @Description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beandefinition) throws BeansException;


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
