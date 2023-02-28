package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @Author:
 * @createTime: 2023/02/24 09:27:24
 * @version:
 * @Description: bean容器
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
