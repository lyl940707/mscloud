package com.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查
public class LazyStaticClient {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazyStatic instance=LazyStatic.getInstance();
//        LazyStatic instance2=LazyStatic.getInstance();
//        System.out.println(instance==instance2);
        //静态内部类反射攻击
        LazyStatic instance=LazyStatic.getInstance();
        Constructor<? extends LazyStatic> declaredConstructor = instance.getClass().getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazyStatic instance1 = declaredConstructor.newInstance();
        System.out.println(instance==instance1);
    }
}
