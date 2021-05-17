package edu.xcdq.demo05;

import java.io.*;

public class Demo {
    public static void main(String[] args)throws   IOException {
        Demo.stringCopy("d:/1.txt","c:/111.txt");

    }
    public static void stringCopy(String scorce,String  target)throws IOException {
        BufferedReader br  =new BufferedReader(new FileReader(scorce));
        BufferedWriter  bw  =  new BufferedWriter(new FileWriter(target));

        String  str =br.readLine();
        while (null !=str){
            bw.write(str+"\n");
            str =br.readLine();
        }
        br.close();
        bw.close();

    }
}
