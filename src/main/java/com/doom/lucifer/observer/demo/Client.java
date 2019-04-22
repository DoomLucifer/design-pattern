package com.doom.lucifer.observer.demo;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        CartoonObserver cartoonObserver = new CartoonObserver();
        NBAObserver nbaObserver = new NBAObserver();
        subject.addObserver(cartoonObserver);
        subject.addObserver(nbaObserver);

        subject.setSubjectStatus("老师来了");
        subject.notifyAllObservers("你们");
    }
}
