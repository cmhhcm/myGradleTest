package com.hmc.BigDecimalTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Author:meice Huang
 * Time: 2019-08-02 14:40
 */
public class BigDecimalTest {

    public static void main(String[] args) {

        /**
         * 1、Why？
         */
        System.out.println(1.01 + 2.02);//结果并不是3.03 而是：3.0300000000000002 想象这是钱，意味着
        System.out.println("3.0300000000000002".length()-2);

        double a = 1.01;
        double b = 2.02;

        System.out.println(a + b);
        /**
         * 结论：double可以处理16位有效数
         */
        double c = 1111.1234567891011122314151617181920;
        System.out.println(c);
        /**
         * 结论：确实只可以处理16位，从11-20的都没处理了。
         */

        BigDecimal bd = new BigDecimal(1);
        System.out.println(bd.divide(new BigDecimal(3),0, RoundingMode.HALF_UP));

        /**
         * 1-构造方法
         */
        BigDecimal bg = new BigDecimal(0.1);
        System.out.println(bg);//0.1000000000000000055511151231257827021181583404541015625
        /**
         * 原因：看源码
         *
         * The results of this constructor can be somewhat unpredictable.
         * One might assume that writing {@code new BigDecimal(0.1)} in
         * Java creates a {@code BigDecimal} which is exactly equal to
         * 0.1 (an unscaled value of 1, with a scale of 1), but it is
         * actually equal to
         * 0.1000000000000000055511151231257827021181583404541015625.
         * This is because 0.1 cannot be represented exactly as a
         * {@code double} (or, for that matter, as a binary fraction of
         * any finite length).  Thus, the value that is being passed
         * <i>in</i> to the constructor is not exactly equal to 0.1,
         * appearances notwithstanding.
         *
         *
         *
         */
        BigDecimal bg2 = BigDecimal.valueOf(0.1);
        System.out.println(bg2);

        /**
         *结论：构造方法尽量不要用Bigdecimal(double b)
         * 那么用什么？
         * 1、Bigdecimal b = new Bigdecimal(Double.soString());
         * 2、Bigdecimal b1 = Bigdecimal.valueOf(doube b);
         */
        /**
         * 2、计算
         */
        BigDecimal bd001 = new BigDecimal(2);
        BigDecimal bd002 = new BigDecimal(3);
        System.out.println(bd001.add(bd002));
        System.out.println(bd001.subtract(bd002));
        System.out.println(bd001.multiply(bd002));
        System.out.println(bd001.divide(bd002,RoundingMode.HALF_UP));

        /**
         * 3、小数位
         */
        System.out.println("==============");
        BigDecimal bd100 = new BigDecimal("123.12");

        BigDecimal bd101 = new BigDecimal("123.1234");
        BigDecimal bd102 = new BigDecimal("123");
        BigDecimal bd103 = new BigDecimal("123.00");
        System.out.println(bd100.scale());
        System.out.println(bd101.scale());
        System.out.println(bd102.scale());
        System.out.println(bd103.scale());

        /**
         * 4、比较
         */
        System.out.println("========");
        BigDecimal bda = new BigDecimal(2.0);
        BigDecimal bdb = new BigDecimal(2.00);
        BigDecimal bdc = new BigDecimal(2.00);
        BigDecimal bdd = new BigDecimal(2.33);
        BigDecimal bde = new BigDecimal(2.3300);

        System.out.println(bda.equals(bdb));
        System.out.println(bda.compareTo(bdb));
        System.out.println(bda.compareTo(bdb));
        System.out.println(bdb.compareTo(bdc));
        System.out.println(bdd.equals(bde));
        /**
         * 源码中说了compareTo只是
         * Two {@code BigDecimal} objects that are
         *      * equal in value but have a different scale (like 2.0 and 2.00)
         *      * are considered equal by this method.
         *
         * equals不仅比较的是值，还比较了scale，奇怪的是，这里的equals输出的借结果跟预期不符？
         */

        /**
         * 5、Rounding Module
         */

      BigDecimal bi = new BigDecimal("12.6445");
        BigDecimal b2 = new BigDecimal("-12.6445");

        BigDecimal bigDecimal = bi.setScale(0, RoundingMode.UP);
        System.out.println("整数：UP  "+bigDecimal);
        BigDecimal bigDecimal1 = bi.setScale(0, RoundingMode.CEILING);
        System.out.println("整数: CEILING "+bigDecimal1);
        System.out.println("负数：UP  "+b2.setScale(0,RoundingMode.UP));//期待结果:
        System.out.println("负数：CEILING  "+b2.setScale(0,RoundingMode.CEILING)); //期待结果// ：
//        System.out.println(bi.setScale(0,RoundingMode.UNNECESSARY));
        System.out.println("整数：HALF_UP   "+bi.setScale(0,RoundingMode.HALF_UP));
        System.out.println("整数:HALF_DOWN  "+bi.setScale(0,RoundingMode.HALF_DOWN));
        System.out.println("负数：HALF_UP "+b2.setScale(0,RoundingMode.HALF_UP));
        System.out.println("负数：HALF_DOWN "+b2.setScale(0,RoundingMode.HALF_DOWN));

        /**
         * 结论：
         * 1、UP表示只要有小数，统统进位；CEILING表示往大值上靠拢，对于整数自然越大，对于负数，自然越小；
         *
         */

    }




}
