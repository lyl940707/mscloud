package com.cloneSerialze;

import org.springframework.beans.BeanUtils;
import org.springframework.util.SerializationUtils;

public class Client {
    public static void main(String[] args) {
        Subject subject=new Subject();
        Subject subject1=CloneUtils.clone(subject);
        subject.age=1;
        subject.name="xxn";
        System.out.println(subject.age);
        System.out.println(subject.name);
        System.out.println(subject1.age);
        System.out.println(subject1.name);
        //需要有get/set方法
//        BeanUtils.copyProperties(subject,subject1);
//        System.out.println(subject1.age);
//        System.out.println(subject1.name);
    }
}
