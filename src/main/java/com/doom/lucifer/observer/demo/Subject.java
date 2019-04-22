package com.doom.lucifer.observer.demo;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    /**
     * data 是要通知给观察者的数据
     * 因为Object是所有类的父类，可以使用多态，当然 你也可以使用 泛型
     * @param data
     */
    void notifyAllObservers(Object data);

    /**
     * 单独 通知某一个观察者
     * @param observer
     * @param data
     *  data 是要通知给观察者的数据
     * 因为Object是所有类的父类，可以使用多态，当然 你也可以使用 泛型
     */
    void notifyObserver(Observer observer,Object data);

    String getStatus();
}
