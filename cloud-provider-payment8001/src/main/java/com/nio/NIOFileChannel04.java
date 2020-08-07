package com.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

//拷贝文件
public class NIOFileChannel04 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("G:\\a1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("G:\\a2.png");

        FileChannel channel = fileInputStream.getChannel();
        FileChannel channel1 = fileOutputStream.getChannel();

        channel1.transferFrom(channel,0,channel.size()/2);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
