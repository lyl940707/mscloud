package com.atguigu;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TestInteger {
    private static final String b="111";
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map3=new HashMap<>();
        map2.put("total",1);
        map3.put("aaa",map2);
        map=(Map<String,String> )map3.get("aaa");
        System.out.println(map.get("total"));
//        String a=null;
//        System.out.println(a);
        Map b=new HashMap();
    }

    public void  a(){
        System.out.println(TestInteger.b=="111");
    }
}
