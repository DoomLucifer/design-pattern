package com.doom.lucifer.proxy;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    public void request() {
        System.out.println("代理对象");
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
