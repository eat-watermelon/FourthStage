package com.wangwei.single;

/**
 * @Author: wangwei
 * @Date: 2018/3/21 21:59
 * @Description: You might think you can read the code below.But you don't understand. Trust me.
 */

public class SingleTon {

    private SingleTon(){}

    //实例化放在静态代码块里可提高程序的执行效率，但也可能更占用空间

    private final static SingleTon instance = new SingleTon();

    public static SingleTon getInstance(){
        return instance;
    }

}
