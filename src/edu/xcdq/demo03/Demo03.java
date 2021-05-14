package edu.xcdq.demo03;

import java.io.*;


public class Demo03 {
    public static void main(String[] args)throws  Exception {

        //1 准备输入输出管道，指向对应的位置
         FileInputStream fi =  new FileInputStream(new File("D:\\CloudMusic"));
         FileOutputStream  fo = new FileOutputStream (new File("C:\\Users\\17839106963\\Music"));
            //2准备缓冲区
         byte[]  buffer =new byte[1024];
         int len= 0;
         //  3循环拷贝文件
         while(  (len =fi.read(buffer))  !=-1){
            fo.write(buffer,0,len);

         }
         // 4拷贝完成  关闭资源
         fi.close();
         fo.close();


    }
}
