package com.hmc.HookMethodTest;

/**
 * Author:meice Huang
 * Time: 2019-08-03 05:57
 */
public abstract class AbstractParent {

    /**
     * 骨架方法
     */
    public void skeleton() {
        concreteMethod();
        hookMethod();
        abstractMethod();
    }

    /**
     * 概念方法
     */
    public void concreteMethod() {
        System.out.println("Here comes the concrete method");
    }

    /**
     * 钩子方法
     */
    public void hookMethod() {
    }

    /**
     * 抽象方法
     */
    public abstract void abstractMethod();

}
