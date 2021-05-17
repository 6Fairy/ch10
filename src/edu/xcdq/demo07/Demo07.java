package edu.xcdq.demo07;

import java.io.*;

public class Demo07 {
    public static void main(String[] args)throws IOException ,ClassNotFoundException{
        User u1 =new User("阿伟",18);
        System.out.println(u1);
        //序列化
        ObjectOutputStream oos  =new ObjectOutputStream(new FileOutputStream("tempfile"));
        oos.writeObject(u1);
        //反序列化
        ObjectInputStream  ois  =new ObjectInputStream(new FileInputStream("tempfillie"));
        User u2 =(User) ois.readObject();
        System.out.println(u2);
    }
}
