package com.hmc.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * Author:meice Huang
 * Time: 2019-08-11 09:11
 */
public class Decompressing {
    public static void main(String[] args) {
        File file = new File("word.zip");
        ZipInputStream zin;
        try {
            ZipFile zipFile = new ZipFile(file);
            zin = new ZipInputStream(new FileInputStream(file));
            ZipEntry entry = zin.getNextEntry();
            while ((entry = zin.getNextEntry()) != null && !entry.isDirectory()) {
                File tmp = new File(entry.getName());
                if (!tmp.exists()) {
                    tmp.getParentFile().mkdirs();
                    OutputStream os = new FileOutputStream(tmp);
                    InputStream in = zipFile.getInputStream(entry);
                    int count = 0;
                    while ((count = in.read()) != -1) {
                        os.write(count);
                    }
                    os.close();
                    in.close();
                }
                zin.closeEntry();
                System.out.println("解压成功！");
            }
            zin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
