package com.doom.lucifer.observer.delegate;

import lombok.Data;

/**
 * 通知者抽象类
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
@Data
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    //增加观察者
    public abstract void addListener(Object object,String methodName,Object... args);

    //通知观察者
    public abstract void notifyX();
}
