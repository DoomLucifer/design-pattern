package com.doom.lucifer.decorator;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    void operation() {
        addedState = "装饰A";
        System.out.println("ConcreteDecoratorA:" + addedState);
        super.operation();
    }
}
