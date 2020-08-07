package com.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

//Mappedbuffer优点：可以直接在内存（非jvm内存）中修改文件信息
public class MappedBufferTest {
    public static void main(String[] args) throws Exception{
        //不能用FileInputStream,通过FileInputStream获取的channel只是可读
        RandomAccessFile randomAccessFile = new RandomAccessFile ("G:\\test.txt","rw");
        FileChannel channel = randomAccessFile.getChannel();
        /**
         * 第一个参数：读写模式
         * 第二个参数：从0开始可以修改
         * 第三个参数：可以修改5个参数，是大小而不是索引
         * 实际类型是DirectByteBuffer,如果是FileChannel.MapMode.READ_ONLY则类型是DirectByteBufferR
         */
        MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

        mappedByteBuffer.put(0,(byte)'a');
        mappedByteBuffer.put(3,(byte)'b');
       // mappedByteBuffer.put(5,(byte)'c');//java.lang.IndexOutOfBoundsException
        randomAccessFile.close();
    }
}
