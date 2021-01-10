package com.yoyo.learning.jvm.classLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自定义加载器
 *
 * @ClassName: MyClassLoader
 * @author: yoyochen
 * @since: 2020/12/27 10:56
 */
public class MyClassLoader extends ClassLoader {
    private String classPath;

    public MyClassLoader (String filePath) {
        this.classPath = filePath;
    }

    @Override
    public Class<?> loadClass(String name)
        throws ClassNotFoundException {

        Class<?> c = null;
        // First, check if the class has already been loaded
        if (name.equals("com.yoyo.learning.jvm.classLoader.B")) {
            c = findClass(name);
        } else {
            c = this.getParent().loadClass(name);
        }
        return c;
    }

    @Override
    public Class<?> findClass(final String name)
    {
        byte[] data = loadClassFile(name);
        return defineClass(name, data, 0, data.length);
    }

    /**
     * 根据文件名读取文件
     * @param name
     * @return
     */
    public byte [] loadClassFile(String name){
        int lastIndex = name.lastIndexOf(".");
        String filePath = name.substring(0, lastIndex).replaceAll("\\.", "/");
        filePath = classPath.concat(filePath).concat("/" + name.substring(lastIndex + 1) + ".class");
        try {
            FileInputStream fis = new FileInputStream(filePath);
            int len = fis.available();

            if (len > 0){
                byte [] data = new byte[len];
                fis.read(data);
                fis.close();

                return data;
            }
            return new byte[0];
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader(
            "D:/private/source/a_self_practice/learning/learning/learning-jvm/testMyClassLoader/");

        try {
            Class b = myClassLoader.loadClass("com.yoyo.learning.jvm.classLoader.B");
            System.out.println(b.getClassLoader());

            // 生成类实例
            Object object = b.newInstance();
            // 调用testB方法
            Method m = b.getMethod("testB", null);
            m.invoke(object, null);

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        MyClassLoader myClassLoader1 = new MyClassLoader(
            "D:/private/source/a_self_practice/learning/learning/learning-jvm/testMyClassLoader1/");

        try {
            Class b1 = myClassLoader1.loadClass("com.yoyo.learning.jvm.classLoader.B");
            System.out.println(b1.getClassLoader());

            // 生成类实例
            Object object = b1.newInstance();
            // 调用testB方法
            Method m = b1.getMethod("testB", null);
            m.invoke(object, null);

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
