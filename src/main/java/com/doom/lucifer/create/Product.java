package com.doom.lucifer.create;

import java.util.ArrayList;
import java.util.List;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品 创建....");
        for (String part:parts){
            System.out.println(part);
        }
    }
}
