package com.chain;

public class HandleOne extends Handle {

    @Override
    public void request(int i) {
        if(i==1){
            System.out.println("是one处理的");
        }else{
            if(getNextHandle()!=null){
                getNextHandle().request(i);
            }else {
                System.out.println("nobody to do");
            }

        }
    }
}
