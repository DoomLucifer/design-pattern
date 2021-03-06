package com.doom.lucifer.create;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
