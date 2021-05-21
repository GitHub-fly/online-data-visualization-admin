package com.gene.annotation;

import java.lang.annotation.*;

/**
 * @author online-data
 * @Description TODO
 * @Date 2021/5/21
 * @Version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {

    /**
     * 调用的接口名称
     */
    String name();

    /**
     * 该日志是否需要持久化存储*
     *
     * @return boolean
     */
    boolean isSaved() default false;

}

