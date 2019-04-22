package com.doom.lucifer.observer.delegate;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * 事件对象的封装类
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
@Data
public class Event {
    //要执行方法的对象
    private Object object;
    //要执行的方法名称
    private String methodName;
    //要执行的方法参数
    private Object[] params;
    //要执行方法的参数类型
    private Class[] paramTypes;

    public Event() {
    }

    public Event(Object object, String methodName, Object[] params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(this.params);
    }

    /**
     * 根据参数数组生成参数类型数组
     *
     * @param params
     */
    private void contractParamTypes(Object[] params){
        this.paramTypes = new Class[params.length];
        for (int i=0;i<params.length;i++){
            this.paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * 根据该对象的方法名，方法参数，利用反射机制，执行该方法
     * @throws Exception
     */
    public void invoke() throws Exception{
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);

        if (method == null) return;
        method.invoke(object,this.params);
    }
}
