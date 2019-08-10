package com.hmc.myThread;

import org.junit.Test;

/**
 * Author:meice Huang
 * Time: 2019-08-06 10:01
 */
public class TestCurrentThread {

    @Test
    public void getCurrentClassInfo() {
        System.out.println(Thread.currentThread().getStackTrace());
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[0].getLineNumber());
        System.out.println("======");
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.println("======");
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());

    }

    public static void main(String[] args) {
        StackTraceElement[] stackEles = Thread.currentThread().getStackTrace();
        System.out.println("开始打印当前运行方法信息：" + stackEles.length);
        for (int i = 0; i < stackEles.length; i++) {
            System.out.println("第" + i + "个元素的ClassNameclass是：" + stackEles[i].getClassName());
            System.out.println("第" + i + "个元素的MethodName是：" + stackEles[i].getMethodName());
            System.out.println("第" + i + "个元素的LineNum是：" + stackEles[i].getLineNumber());
        }
        printStackInfo();
    }

    private static void printStackInfo() {
        StackTraceElement[] stackEles = Thread.currentThread().getStackTrace();
        System.out.println("==========开始调用私有方法============");
        for (int i = 0; i < stackEles.length; i++) {
            System.out.println("第" + i + "个元素的ClassNameclass是：" + stackEles[i].getClassName());
            System.out.println("第" + i + "个元素的MethodName是：" + stackEles[i].getMethodName());
            System.out.println("第" + i + "个元素的LineNum是：" + stackEles[i].getLineNumber());
        }

    }

}
/**
 * public StackTraceElement[] getStackTrace()
 * Returns an array of stack trace elements representing the stack dump of this thread.
 * This method will return a zero-length array if this thread has not started,
 * has started but has not yet been scheduled to run by the system, or has terminated.
 * If the returned array is of non-zero length then the first element of the array represents the top of the stack,
 * which is the most recent method invocation in the sequence. The last element of the array represents the bottom of the stack,
 * which is the least recent method invocation in the sequence.
 * <p>
 *    结论：
 *
 * 1、实例方法中获取类名：this.getClass().getName()
 * 2、static的方法中：Thread.currentThread().getStackTrace()[1].getClassName()  .getMethodName() .getLineNumber()
 */

