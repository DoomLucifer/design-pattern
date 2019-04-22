package com.doom.lucifer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer:observers){
            //通知观察者进行状态的变更
            observer.update();
        }
    }
}
