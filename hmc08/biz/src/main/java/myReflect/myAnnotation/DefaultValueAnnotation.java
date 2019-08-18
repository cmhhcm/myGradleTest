package myReflect.myAnnotation;

/**
 * Author:meice Huang
 * Time: 2019-08-18 16:31
 */
public @interface DefaultValueAnnotation {
    String describe() default  "满脸胡渣，喜欢上安静的滋味";
    Class type();
}
