package myReflect;

import java.awt.geom.QuadCurve2D;
import java.lang.reflect.Field;

/**
 * Author:meice Huang
 * Time: 2019-08-18 11:27
 */
public class Main_02 {
    public static void main(String[] args) {
        Example_02 example = new Example_02();
        Class<? extends Example_02> exampleC = example.getClass();
        //获得所有成员变量
        Field[] declaredFields = exampleC.getDeclaredFields();
        for(int i=0;i<declaredFields.length;i++) {
            Field field = declaredFields[i];
            //获得成员变量名称
            System.out.println("名称为："+field.getName());
            Class<?> fieldType = field.getType();
            System.out.println("类型为："+fieldType);
            boolean isTrun = true;
            while(isTrun){
                try {
                    //如果该成员变量的访问权限是private则抛出异常，不允许访问
                    isTrun = false;
                    //获得成员变量的值
                    System.out.println("修改前的值是:"+field.get(example));
                    if(fieldType.equals(int.class)){
                        System.out.println("利用方法setInt()修改成员变量的值");
                        field.setInt(example,168);
                    }else if(fieldType.equals(float.class)){
                        System.out.println("利用方法setFloat()修改成员变量的值");
                        field.setFloat(example,99.9f);
                    }else if(fieldType.equals(boolean.class)){
                        System.out.println("利用方法setBoolean()修改成员变量的值");
                        field.setBoolean(example,true);
                    }else {
                        System.out.println("利用方法set()修改成员变量的值");
                        field.set(example,"MW");
                    }
                    System.out.println("修改后的值是："+field.get(example));

                } catch (Exception e) {
                    System.out.println("在设置成员变量值时抛出异常,下面执行setAccessible()方法");
                    field.setAccessible(true);
                    isTrun  = true;
                }
            }
        }
        System.out.println();
    }
    /**
     * 结论：
     * 1、反射可以访问私有成员变量的名称、类型，不可以直接访问值，非要访问的需要设置setAccessibale()
     * 2、
     */
}
