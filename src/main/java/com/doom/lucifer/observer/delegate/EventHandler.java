package com.doom.lucifer.observer.delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class EventHandler {
    private List<Event> objects;

    public EventHandler() {
        this.objects = new ArrayList<>();
    }

    //添加某个对象要执行的事件，及需要的参数
    public void addEvent(Object object,String methodName,Object... args){
        objects.add(new Event(object,methodName,args));
    }

    //通知所有对象执行指定的事件
    public void nofifyX() throws Exception{
        for (Event event:objects){
            event.invoke();
        }
    }
}
