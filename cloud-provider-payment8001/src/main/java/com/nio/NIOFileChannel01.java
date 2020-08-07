package com.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel01 {
    public static void main(String[] args) throws Exception {
        String str="hello,world";
        //创建一个输出流-》channel
        FileOutputStream fileOutputStream = new FileOutputStream("G:\\test.txt");

        //通过fileOutputStream获取对应的filechannel
        //这个fileChannel的真实类型是FileChannelImpl
        FileChannel fileChannel = fileOutputStream.getChannel();

        //创建一个缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //将str放入bytefuffer中
        byteBuffer.put(str.getBytes());
        //对bytebuffer进行读写翻转
        byteBuffer.flip();
        //将缓冲区数据写入通道

        fileChannel.write(byteBuffer);
        fileOutputStream.close();
    }
}
