package org.springframework.beans;

/**
 * @Author:
 * @createTime: 2023/02/28 13:53:53
 * @version:
 * @Description:
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){ super(msg);}

    public BeansException(String msg, Throwable cause){ super(msg,cause);}
}
