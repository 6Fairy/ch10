package edu.xcdq.demo06;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class Demo06 {
    public static void main(String[] args)throws  Exception {
        //使用输入输出流对项目的配置文件进行读取和写入的操作
       BufferedInputStream bis =  new BufferedInputStream(new FileInputStream("a.properties"));
        Properties pro  =new Properties();
        pro.load(bis);//将读取流加载到内容
        bis.close();//关闭读取流
        for (Map.Entry<Object,Object>p:pro.entrySet()){
            System.out.println(p.getKey()+":"+p.getValue());
        }

        //往配置文件中写出数据
        FileOutputStream fos =new FileOutputStream("a.properties",true);
        pro.setProperty("location","beijing");
        pro.store(fos,"这是注释");
        fos.close();

    }
}
