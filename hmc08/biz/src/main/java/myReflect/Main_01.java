package myReflect;

import java.lang.reflect.Constructor;

/**
 * Author:meice Huang
 * Time: 2019-08-18 09:39
 */
public class Main_01 {
    public static void main(String[] args) {
        Example_01 example = new Example_01("10", "20", "30");
        Class<? extends Example_01> exampleC = example.getClass();
        //获取所有构造方法
        Constructor<?>[] declaredConstructors = exampleC.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor<?> constructor = declaredConstructors[i];
            System.out.println("查看是否允许带有可变数量的参数" + constructor.isVarArgs());
            System.out.println("该构造方法的入口参数类型依次为：");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println(parameterTypes[j]);
            }
            System.out.println("该构造方法可能抛出的异常类型为：");
            //获得所有可能抛出的异常信息类型
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(" " + exceptionTypes[j]);
            }

            Example_01 example2 = null;
            while (example2 == null) {
                try {
                    if (i == 2) {//默认无参构造方法构建对象
                        example2 = (Example_01) constructor.newInstance();
                    } else if (i == 1) {
                        example2 = (Example_01) constructor.newInstance("7", 5);
                    } else {
                        Object[] parameters = new Object[]{new String[]{"100", "200", "300"}};
                        example2 = (Example_01) constructor.newInstance(parameters);
                    }
                } catch (Exception e) {
                    System.out.println("创建对象抛出异常，因为无参构造方法是私有的:");
                    constructor.setAccessible(true);
                }
            }
            if (example2 != null) {
                example2.print();
                System.out.println();
            }

        }
    }
}
