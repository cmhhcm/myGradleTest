package com.hmc.IOTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author:meice Huang
 * Time: 2019-08-11 07:45
 */
public class BufferStudent {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"好久不见", "最近好吗", "常联系"};
        File file = new File("word.txt");

        try {
            FileWriter fw = new FileWriter(file);
            //创建BufferedWriter对象
            BufferedWriter bufw = new BufferedWriter(fw);
            for (int k = 0; k < content.length; k++) {
                bufw.write(content[k]);
                bufw.newLine();//将数组中的单个元素以单行方式写入文件
            }
            bufw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            //创建BufferedReader对象
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            //如果文件的文本行数不为NUll，则进入循环
            while ((s = bufr.readLine()) != null) {
                i++;
                System.out.println("第" + i + "行，:" + s);
            }
            bufr.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 总结：
     * 1、并不能体会buffer的作用？缓冲效果怎么体现？
     *
     */
}
