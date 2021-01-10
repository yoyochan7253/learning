package com.yoyo.learning.jvm.classLoader;

/**
 * 动态类加载
 *
 * @ClassName: DynamicLoadClass
 * @author: yoyochen
 * @since: 2020/12/23 15:05
 */
public class DynamicLoadClass {

    static {
        System.out.println("load DynamicLoadClass");
    }

    public DynamicLoadClass(){
        System.out.println("init DynamicLoadClass");
    }

    public static void main(String[] args) {
        A a = new A();
        // B b = null;
        B b = new B();
        B.testB();
    }
}
