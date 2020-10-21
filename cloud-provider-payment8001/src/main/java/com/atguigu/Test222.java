package com.atguigu;

import com.alibaba.druid.support.json.JSONUtils;
import io.micrometer.core.instrument.util.JsonUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Test222 {
    public static void main(String[] args) {
        Map<String,String> a=new HashMap<>();
        a.put("id","1");
        String prop="{\"001\":\"5\",\"002\":\"5\",\"003\":\"5\",\"004\":\"5\"}";
        a.put("prop",prop);
        Map<String,String> b=new HashMap<>();
        b.put("id","2");
        String prop1="{\"001\":\"1\",\"002\":\"4\",\"003\":\"6\",\"004\":\"8\"}";
        b.put("prop",prop1);
        Map<String,String> c=new HashMap<>();
        c.put("id","3");
        String prop3="{\"001\":\"8\",\"002\":\"6\",\"003\":\"4\",\"004\":\"1\"}";
        c.put("prop",prop3);
        List<Map<String,String>> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println( list.stream().map(e1-> (Map<String,String>)JSONUtils.parse(e1.get("prop"))).sorted((h1,h2)->h1.get("002").compareTo(h2.get("002"))).collect(Collectors.toList()));
        //System.out.println(list.stream().map(e-> JSONUtils.parse(e.get("prop"))).collect(Collectors.toList()));
        Map<String,String> d=new HashMap<>();
        d.put("id","1");
        d.put("name","2");
        d.put("sex","3");
        System.out.println(d);
    }
}
