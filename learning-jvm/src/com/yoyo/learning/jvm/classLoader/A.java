package com.yoyo.learning.jvm.classLoader;

/**
 * 测试用A类
 *
 * @ClassName: A
 * @author: yoyochen
 * @since: 2020/12/23 15:06
 */
public class A {
    static {
        System.out.println("load class A");
    }

    public A(){
        System.out.println("init class A");
    }
}
