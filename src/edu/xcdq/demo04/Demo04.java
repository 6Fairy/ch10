package edu.xcdq.demo04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    //文件的拷贝

    public static void main(String[] args) {
        FileOutputStream fo = null;
        FileInputStream fi = null;
        try {
            //1 准备输入输出管道，指向对应的位置
            fi = new FileInputStream(new File("D:\\CloudMusic"));
            fo = new FileOutputStream(new File("C:\\eclipse2.zip"));
            //2准备缓冲区
            byte[] buffer = new byte[1024];
            int len = 0;
            //  3循环拷贝文件
            long startTime = System.currentTimeMillis();
            while ((len = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, len);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("运行时间" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4拷贝完成  关闭资源
            try {
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fo.close();
            }catch (IOException e){
                e.printStackTrace();


            }
        }
    }
}

