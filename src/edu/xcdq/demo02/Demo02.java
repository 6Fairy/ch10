package edu.xcdq.demo02;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        File file = new  File("d:/demo");//创建文件对象
        printTree(file , 1);
    }

    public static void printTree(File file ,int  leval) {
        //缩进
        for (int i=0 ; i<leval; i++){
            System.out.println("\t");

        }
        System.out.println(file.getAbsolutePath());//打印未文件路径
        ///继续判断内部的文件夹
        if (file.isDirectory()){
            leval++;
            File[]files =file.listFiles();
            for (File f: files){
                printTree(f,leval+1);//自己调用自己   叫做  递归
            }
        }
    }
}
