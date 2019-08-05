package com.hmc.HookMethodTest;

/**
 * Author:meice Huang
 * Time: 2019-08-03 05:12
 */
public class AchieveClass extends AbstractClass{

    /**
     * 这个方法就是钩子方法
     * 1、挂载到了operating()方法上
     * 2、可以干预到operating()的逻辑
     */
    @Override
    public boolean isOpen() {
        return false;
    }

    public static void main(String[] args) {
        AchieveClass ac = new AchieveClass();
        ac.operating();
    }
    /**
     * 总结：
     *
     */
}
