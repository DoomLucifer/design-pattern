package com.doom.lucifer.observer.demo;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class CartoonObserver implements Observer {
    @Override
    public void update(Subject subject, Object data) {
        System.out.println(" 我是" + this.getClass().getSimpleName() + ",通知者的新状态是"
                + subject.getStatus() + "," + data + "别看漫画了");
    }
}
