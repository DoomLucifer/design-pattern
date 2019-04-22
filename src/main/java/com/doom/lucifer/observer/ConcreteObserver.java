package com.doom.lucifer.observer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
@Data
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        this.observerState = subject.getSubjectState();
        System.out.println("观察者" + name + "的新状态是" + this.observerState);
    }
}
