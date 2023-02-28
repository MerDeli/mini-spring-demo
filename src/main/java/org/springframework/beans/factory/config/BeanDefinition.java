package org.springframework.beans.factory.config;

/**
 * @Author:
 * @createTime: 2023/02/28 13:11:52
 * @version:
 * @Description:
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){ this.beanClass = beanClass;}

    public Class getBeanClass(){
        return beanClass;
    }

    public void setBeanClass(Class beanClass){ this.beanClass = beanClass;}
}
