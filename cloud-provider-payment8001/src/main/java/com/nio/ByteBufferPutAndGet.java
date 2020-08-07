package com.nio;
import java.nio.ByteBuffer;

//bytebuffer支持类型的put和get  put什么类型，get就应该什么类型，不然可能发生异常
public class ByteBufferPutAndGet {
    public static void main(String[] args){
        ByteBuffer byteBuffer = ByteBuffer.allocate(128);
        byteBuffer.putInt(129);
        byteBuffer.putShort((short) 6);
        byteBuffer.putChar('李');
        byteBuffer.putLong(10000);

        byteBuffer.flip();

        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getShort());
        //System.out.println(byteBuffer.getLong());
        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getLong());
    }
}
