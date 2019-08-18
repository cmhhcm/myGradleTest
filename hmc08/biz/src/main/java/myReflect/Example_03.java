package myReflect;


import java.text.NumberFormat;

/**
 * Author:meice Huang
 * Time: 2019-08-18 14:02
 */
public class Example_03 {
    static void staticMethod(){
        System.out.println("执行staticMethod()方法");
    }

    public int publicMethod(int i){
        System.out.println("执行publicMethod()方法");
        return  i*100;
    }
    protected int proctedMethod(String s,int i) throws NumberFormatException {
        System.out.println("执行proctedMethod()方法");
        return Integer.valueOf(s)+i;
    }

    private String privateMethod(String... strings){
        System.out.println("执行privateMethod()方法");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<strings.length;i++){
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
