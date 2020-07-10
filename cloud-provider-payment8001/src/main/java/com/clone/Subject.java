package com.clone;

public class Subject implements Cloneable{
    public int b=5;
    private int a=10;
    public String c="c";
    public properties properties=new properties();
    public final properties properties2=new properties();
    public void request(){
        System.out.println("do request");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class properties{
    public int age=1;
    public String name="aaa";
}

