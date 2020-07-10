package com.single;

//枚举类单例模式
public class  LazyEnum {
    private LazyEnum(){};
    private static enum SingleLazyEnum{
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private LazyEnum lazyEnum;
        private SingleLazyEnum(){
            lazyEnum=new LazyEnum();
        }
        public LazyEnum getInstnce(){
            return lazyEnum;
        }
    }

    public static LazyEnum getInstance(){
        return SingleLazyEnum.INSTANCE.lazyEnum;
    }
}
