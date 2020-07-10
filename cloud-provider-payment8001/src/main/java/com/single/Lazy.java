package com.single;

//public static synchronized Lazy getInstance() 线程安全，但效率很低
public class Lazy {
    private static Lazy instance;
    private Lazy(){

    }

    public static Lazy getInstance() {
        if(instance==null){
            instance=new Lazy();
        }
        return instance;
    }
}
