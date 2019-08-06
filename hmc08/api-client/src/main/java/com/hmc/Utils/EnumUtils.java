package com.hmc.Utils;

/**
 * Author:meice Huang
 * Time: 2019-08-06 10:36
 */
public class EnumUtils {

    public static <T extends Enum<T>> T noErrorValueOf(Class<T> enumType, String name) {

        try {
            return Enum.valueOf(enumType, name);
        } catch (Exception e) {
            try {
                String className = Thread.currentThread().getStackTrace()[1].getClassName();
                String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
                int lineNum = Thread.currentThread().getStackTrace()[1].getLineNumber();
                System.out.println("error conversion, " + name + " is not type of " + enumType.getName() + " in class =" + className + ",method " + methodName + ",line = " + lineNum);
            } catch (Exception ex) {
                System.out.println("获取调用工具失败");
            }
            return null;
        }
    }

}