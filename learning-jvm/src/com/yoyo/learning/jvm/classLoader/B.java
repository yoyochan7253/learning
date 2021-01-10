package com.yoyo.learning.jvm.classLoader;

/**
 * 测试类B类
 *
 * @ClassName: B
 * @author: yoyochen
 * @since: 2020/12/23 15:10
 */
public class B {

    static {
        System.out.println("load class B");
    }

    public B(){
        System.out.println("init class B");

        System.out.println(this.getClass().getClassLoader());

        // 引用类虽然入口是appClassLoader, 但是由于双亲委派机制，依然由bootstrap引导类加载器加载
        StringBuffer c = new StringBuffer().append("test");
        System.out.println("c value:" + c + ";loader of c:" + c.getClass().getClassLoader());
    }

    public static void testB(){
        System.out.println("test method B of the other class B");
    }
}
