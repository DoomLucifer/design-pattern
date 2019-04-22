package com.doom.lucifer.create;

/**
 * 指挥者，告诉建造者以我规定的模式进行创建，不允许私自创建，相当与一个构建模版
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
