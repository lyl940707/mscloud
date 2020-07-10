package com.single;

//静态内部类，还存在反射攻击或者反序列化攻击
public class LazyStatic {
    private LazyStatic(){};
    private static class singleton{
        private static final LazyStatic instance=new LazyStatic();
    }
    public static LazyStatic getInstance(){
        return  singleton.instance;
    }
}
