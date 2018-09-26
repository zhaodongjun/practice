package com.light.springboot.web.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhaodongjun on 2018/8/3 0003.
 */
public class TestNIO {

    public static void main(String[] args) throws IOException {
        String srcFileName = "F:\\1123.doc";
        String dstFileName = "D:\\222.doc";
        copyFile(srcFileName,dstFileName);
    }


    private static void copyFile(String srcFileName,String dstFileName) throws IOException {
        FileInputStream fis = new FileInputStream(srcFileName);
        FileOutputStream fos = new FileOutputStream(dstFileName);

        FileChannel readChannel = fis.getChannel();
        FileChannel writeChannel = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true){
            buffer.clear();
            if(readChannel.read(buffer) == -1){//从channel中读取数据到buffer中
                break;
            }
            buffer.flip();//将缓存区游标置于0
            writeChannel.write(buffer);//将缓存区数据写入输出channel
        }

        fis.close();
        fos.close();
    }
}
