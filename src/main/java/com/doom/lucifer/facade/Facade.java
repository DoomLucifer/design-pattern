package com.doom.lucifer.facade;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Facade {
    private SubSystemOne systemOne;
    private SubSystemTwo systemTwo;
    private SubSystemThree systemThree;
    private SubSystemFour systemFour;

    Facade() {
        this.systemOne = new SubSystemOne();
        this.systemTwo = new SubSystemTwo();
        this.systemThree = new SubSystemThree();
        this.systemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法组A...");
        systemOne.methodOne();
        systemTwo.methodTwo();
        systemFour.methodFour();
    }

    public void methodB(){
        System.out.println("方法组B...");
        systemTwo.methodTwo();
        systemThree.methodThree();
    }
}
