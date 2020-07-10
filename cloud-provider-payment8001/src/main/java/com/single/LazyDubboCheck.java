package com.single;

//双重检查，volatile关键字来修饰singleton，其最关键的作用是防止指令重排
public class LazyDubboCheck {
    private static volatile LazyDubboCheck instance;
    private LazyDubboCheck(){};
    public static LazyDubboCheck getInstance(){
        if(instance==null){
            synchronized (LazyDubboCheck.class) {
                if (instance == null) {
                    instance = new LazyDubboCheck();
                }
            }
        }
        return instance;
    }
}
