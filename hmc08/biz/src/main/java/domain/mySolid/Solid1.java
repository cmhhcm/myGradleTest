package domain.mySolid;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Author:meice Huang
 * Time: 2019-09-01 15:11
 */
public class Solid1 {
    public static void main(String[] args) throws IOException {
        System.out.println(2.34/0);
        System.out.println(15/7);

//        System.out.println(15/0);
        int m = 7;
        int n = 7;
        int a = 2 * m ++;
        int b = 2 * ++n;
        System.out.println("a: \t"+a+"  m:"+m);
        System.out.println("b: \t"+b+"  n:"+n);
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年龄：");
//        int age = in.nextInt();
        System.out.println("你输入的年龄是："+a);
        Console c = System.console();
        System.out.println("请输入姓名:");
//        String name = c.readLine();
//        System.out.println("你的姓名是："+name);
        System.out.printf(System.getProperty("user.dir"));
        Scanner scanner = new Scanner(Paths.get("word.txt"),"UTF-8");
        System.out.println();
        System.out.println(scanner.next());

        PrintWriter pw = new PrintWriter("word2.txt","UTF-8");
        pw.write("每当我找不到存在的意义...");


    }
}
