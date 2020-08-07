package com.nio;

import java.nio.ByteBuffer;

//只读buffer
public class ReadOnlyBuffer {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(64);
        for(int i=0;i<byteBuffer.capacity();i++){
            byteBuffer.put((byte) i);
        }

        byteBuffer.flip();
        ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        System.out.println(byteBuffer.getClass());
        System.out.println(readOnlyBuffer.getClass());

        while (readOnlyBuffer.hasRemaining()){
            System.out.println(readOnlyBuffer.get());
        }

        readOnlyBuffer.put((byte) 100);
    }
}
