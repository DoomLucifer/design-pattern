package com.doom.lucifer.observer;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("X",subject));
        subject.attach(new ConcreteObserver("Y",subject));
        subject.attach(new ConcreteObserver("Z",subject));

        subject.setSubjectState("ABC");
        subject.notifyObservers();
    }
}
