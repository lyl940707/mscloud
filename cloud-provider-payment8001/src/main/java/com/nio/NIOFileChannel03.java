package com.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//拷贝文件，通过read和write
public class NIOFileChannel03 {
    public static void main(String[] args) throws Exception {
        File file = new File("G:\\test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel01 = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream("G:\\test2.txt");
        FileChannel channel02 = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        while (true) {
//            public final Buffer clear() {
//                position = 0;
//                limit = capacity;
//                mark = -1;
//                return this;
//            }
            byteBuffer.clear();//清空buffer，如果不清空read一直等于0
            int read = channel01.read(byteBuffer);
            System.out.println("read:"+read);
            if(read == -1){
                break;
            }
            byteBuffer.flip();
            channel02.write(byteBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
