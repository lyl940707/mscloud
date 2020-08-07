package com.chain;

public class HandleTwo extends Handle {

    @Override
    public void request(int i) {
        if(i==2){
            System.out.println("是two处理的");
        }else {
            if(getNextHandle()!=null){
                getNextHandle().request(i);
            }else {
                System.out.println("nobody to do");
            }
        }
    }
}
