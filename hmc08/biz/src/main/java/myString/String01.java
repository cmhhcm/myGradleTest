package myString;

import org.junit.Test;

/**
 * Author:meice Huang
 * Time: 2019-08-27 06:25
 */
public class String01 {
    public static void main(String[] args) {
        int a, b, c, d;
        String s;
//        System.out.println(a);
//        System.out.println(s);
        System.out.println("I like " +
                "java");
        String str = "We are flower";
        System.out.println(str.lastIndexOf(""));
        System.out.println(str.length());
        String str1 = "  We are flower      ";
        System.out.println(str1.trim());
        System.out.println("未截取之前的长度是：" + str1.length() + "\t截取之后的长度是：" + str1.trim().length());
    }

    @Test
    public void testStringBuilder() {
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("String消耗时间：" + time);

        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {
            sb.append(j);
        }
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("StringBuilder消耗时间:" + time);

    }
}
