package com.hmc.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Author:meice Huang
 * Time: 2019-08-11 08:54
 */
public class MyZip {
    private void zip(String zipFileName, File inputFile) throws IOException {
        ZipOutputStream out  = new ZipOutputStream(new FileOutputStream(zipFileName));
        zip(out,inputFile,"");
        System.out.println("压缩中...");
        out.close();
    }

    private void zip(ZipOutputStream out,File f,String base) throws IOException {
        if(f.isDirectory()){
            File[] files = f.listFiles();
            if(base.length() != 0){
                out.putNextEntry(new ZipEntry(base+"/"));
            }
            for(int i=0;i<files.length;i++) {
                zip(out,files[i],base+files[i]);
            }
        }else{
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in  = new FileInputStream(f);
            int b;
            System.out.println(base);
            while((b = in.read()) != -1){
                out.write(b);
            }
            in.close();
        }
    }

    public static void main(String[] args) throws IOException {
        MyZip book = new MyZip();
        book.zip("word.txt",new File("word.txt"));
        System.out.println("压缩完成");
    }
}



