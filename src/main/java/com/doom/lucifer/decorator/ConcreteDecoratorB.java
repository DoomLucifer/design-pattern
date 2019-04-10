package com.doom.lucifer.decorator;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior(){
        System.out.println("ConcreteDecoratorB:装饰B");
    }
}
