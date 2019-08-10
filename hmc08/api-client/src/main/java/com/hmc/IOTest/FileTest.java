package com.hmc.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Author:meice Huang
 * Time: 2019-08-09 23:39
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("word.txt");
        if(file.exists()) {
            file.delete();
            System.out.println("文件已删除");
        }else{
           file.createNewFile();
            System.out.println("文件已创建");
        }
        try {
            //创建FileOutputStream对象
            FileOutputStream out = new FileOutputStream(file);
            //创建byte数组
            byte buy[] = "我有一只小毛驴，我从来也不骑".getBytes();
            out.write(buy);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //创建FileInputStream对象
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("文件中的信息是：" + new String(byt, 0, len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
