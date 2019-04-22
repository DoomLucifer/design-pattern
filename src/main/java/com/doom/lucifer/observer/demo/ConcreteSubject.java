package com.doom.lucifer.observer.demo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
@Data
public class ConcreteSubject implements Subject {
    private String subjectStatus;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (observer == null){
            throw new NullPointerException("observer == null");
        }
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(Object data) {
        for (Observer observer:observers){
            observer.update(this,data);
        }
    }

    @Override
    public void notifyObserver(Observer observer, Object data) {
        if (observer != null){
            observer.update(this,data);
        }
    }

    @Override
    public String getStatus() {
        return getSubjectStatus();
    }
}
