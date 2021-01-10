package com.yoyo.learning.jvm.classLoader;

import java.net.URL;
import sun.misc.Launcher;
import sun.net.spi.nameservice.dns.DNSNameService;

/**
 * learning class loader
 *
 * @ClassName: LearningLauncher
 * @author: yoyochen
 * @since: 2020/12/23 15:50
 */
public class LearningLauncher {

    public static void testLauncher(){
        // bootstrap c++ object
        System.out.println("String类加载器：" + String.class.getClassLoader());

        // extension
        System.out.println("DNSNameService类父加载器：" + DNSNameService.class.getClassLoader().getParent());
        System.out.println("DNSNameService类加载器：" + DNSNameService.class.getClassLoader());

        // application
        System.out.println("LearningLauncher类父加载器：" + LearningLauncher.class.getClassLoader().getParent());
        System.out.println("LearningLauncher类加载器：" + LearningLauncher.class.getClassLoader());
        System.out.println(LearningLauncher.class.getName());

        // get three classloader
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();

        System.out.println("appClassLoader:" + appClassLoader);
        System.out.println("extClassLoader:" + extClassLoader);
        System.out.println("bootstrapClassLoader:" + bootstrapClassLoader);

        // print bootstrap load urls
        URL[] bootstrapClassLoaderUrls = Launcher.getBootstrapClassPath().getURLs();
        System.out.println("bootstrap classloader loads url:");
        for (URL url : bootstrapClassLoaderUrls){
            System.out.println(url);
        }

        System.out.println();
        // print extension load urls
        String extUrlStr = System.getProperty("java.ext.dirs");
        System.out.println("extension classloader loads url:" + extUrlStr);

        System.out.println();
        // print app load urls
        String appUrlStr = System.getProperty("java.class.path");
        System.out.println("app classloader loads url:" + appUrlStr);

        try {
            System.out.println();
            Class b = Launcher.getLauncher().getClassLoader().loadClass(
                "com.yoyo.learning.jvm.classLoader.B");
            System.out.println("class B:" + b);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LearningLauncher.testLauncher();
    }
}
