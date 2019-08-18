package myReflect.myAnnotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author:meice Huang
 * Time: 2019-08-18 17:09
 */
public class VisitAnnotations {
    @Test
    public void testVisitConstructorAnnotations(){
        Record record = new Record();
        Class<? extends Record> recordC = record.getClass();
        Constructor<?>[] declaredConstructors = recordC.getDeclaredConstructors();
        for(int i=0;i<declaredConstructors.length;i++){
            Constructor<?> constructor = declaredConstructors[i];
            //查看是否具有指定类型的注释
            if(constructor.isAnnotationPresent(Constructor_Annotation.class)){
                Constructor_Annotation ca = constructor.getAnnotation(Constructor_Annotation.class);
                System.out.println(ca.value());//获得注释信息
            }

            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();//获得参数的注释
            for(int j = 0;j<parameterAnnotations.length;j++){
                int length = parameterAnnotations[j].length;
                if(length == 0){
                    System.out.println("未添加Annotation的参数");

                }else{
                    for(int k=0;k<length;k++){
                        //获得参数的注释
                        Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation) parameterAnnotations[j][k];
                        System.out.println("  "+pa.describe());
                        System.out.println("  "+pa.type());
                    }
                }
            }
            System.out.println();
        }
    }

    @Test
    public void testVisitFieldAnnotations(){
        Record record = new Record();
        Class<? extends Record> recordC = record.getClass();
        Field[] declaredFields = recordC.getDeclaredFields();
        for(int i=0;i<declaredFields.length;i++){
            Field field = declaredFields[i];
            if(field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)){
                //获得指定类型的注释
                Field_Method_Parameter_Annotation fa = field.getAnnotation(Field_Method_Parameter_Annotation.class);
                System.out.println(fa.describe());
                System.out.println(fa.type());
            }

        }
    }

    @Test
    public void testVisitMethodAnnotations(){
       Record record = new Record();
        Class<? extends Record> recordC = record.getClass();
        Method[] methods = recordC.getDeclaredMethods();
        for(int i=0;i<methods.length;i++){
            Method method = methods[i];
            if(method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)){
                Field_Method_Parameter_Annotation fa = method.getAnnotation(Field_Method_Parameter_Annotation.class);
                System.out.println(fa.describe());
                System.out.println(fa.type());
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            for(int j = 0;j<parameterAnnotations.length;j++){
                int length = parameterAnnotations[j].length;
                if(length == 0){//表示没有为该参数添加注释
                    System.out.println(" 未添加Annotation注释");
                }else{
                    for(int k =0;k<length;k++){
                        Field_Method_Parameter_Annotation fa = (Field_Method_Parameter_Annotation) parameterAnnotations[j][k];
                        System.out.println(fa.describe());
                        System.out.println(fa.type());
                    }
                }
            }
        }
    }
}
