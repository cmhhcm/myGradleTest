package myReflect;

import java.lang.reflect.Method;

/**
 * Author:meice Huang
 * Time: 2019-08-18 14:09
 */
public class Main_03 {
    public static void main(String[] args) {
        Example_03 example = new Example_03();
        Class<? extends Example_03> exampleC = example.getClass();
        Method[] declaredMethods = exampleC.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method method = declaredMethods[i];
            System.out.println("名称为：" + method.getName());
            System.out.println("是否允许带有可变数量的参数:" + method.isVarArgs());
            System.out.println("入口参数类型依次为：");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println(" " + parameterTypes[j]);
            }
            //获得方法返回值类型
            System.out.println("返回值类型为：" + method.getReturnType());
            System.out.println("可能抛出的异常类型有：");
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(exceptionTypes[j]);
            }

            boolean isTrun = true;
            while (isTrun) {
                try {
                    isTrun = false;
                    if ("staticMethod".equals(method.getName())) {
                        method.invoke(example);
                    } else if ("publicMethod".equals(method.getName())) {
                        System.out.println("返回值为：" + method.invoke(example, 168));
                    } else if ("protextedMethod".equals(method.getName())) {
                        System.out.println("返回值为：" + method.invoke(example, "7", "5"));
                    } else if ("privateMethod".equals(method.getName())) {
                        Object[] parameters = new Object[]{new String[]{"M", "W", "Q"}};
                        System.out.println("返回值为：" + method.invoke(example, parameters));
                    } else {
                        isTrun = false;
                    }

                } catch (Exception e) {
                    System.out.println("在执行方法时抛出异常, 下面执行setAccessible()方法");
                    method.setAccessible(true);
                    isTrun = true;
                }
            }

        }
    }
}
