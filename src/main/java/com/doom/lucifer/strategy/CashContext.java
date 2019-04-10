package com.doom.lucifer.strategy;

/**
 * 策略模式与简单工厂模式的结合
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class CashContext {
    private CashSuper cashSuper = null;

    public CashContext(String type){
        switch (type){
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "rebate":
                //折扣
                cashSuper = new CashRebate(0.8);
                break;
            case "return":
                //满300减100
                cashSuper = new CashReturn(300,100);
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
