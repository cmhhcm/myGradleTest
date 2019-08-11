package com.hmc.IOTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Author:meice Huang
 * Time: 2019-08-11 08:01
 */
public class DataInputTest {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("word.txt");
            //创建DataOutputSteam对象
            DataOutputStream ds = new DataOutputStream(out);
            ds.writeUTF("使用writeUFT()方法写入数据\n");
            ds.writeChars("使用 writeChars()方法写入数据\n");
            ds.writeBytes("使用writeBytes()方法写入数据\n");
            ds.close();

            FileInputStream in = new FileInputStream("word.txt");
            DataInputStream dIn = new DataInputStream(in);
            System.out.println(dIn.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
