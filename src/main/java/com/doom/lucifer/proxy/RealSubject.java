package com.doom.lucifer.proxy;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("真实对象");
    }
}
