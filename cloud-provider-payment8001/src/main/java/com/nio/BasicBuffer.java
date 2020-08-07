package com.nio;

import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {
        //创建一个buffer 容量为5 可以存放int类型
        IntBuffer intBuffer = IntBuffer.allocate(5);
        for (int i=0;i<intBuffer.capacity();i++){
            intBuffer.put(i*2);
        }
        //buffer的读写转换
        intBuffer.flip();

        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }
    }
}
