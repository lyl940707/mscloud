package com.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Map<String,Object> a=new HashMap();
        System.out.println(a.put("1","1"));
        System.out.println(a.put("1","1"));
//        Scanner scanner=new Scanner(System.in);
//        Integer m=scanner.nextInt();
//        int n=0;
//        boolean flag=true;
//        while (flag){
//            if(Math.pow(2,n)<m && m<=Math.pow(2,n+1)){
//                flag=false;
//            }else{
//                n++;
//            }
//        }
//        m=(int)Math.pow(2,n+1);
//        System.out.println(m);
        System.out.println(Integer.highestOneBit(5)<<1);

    }
}
