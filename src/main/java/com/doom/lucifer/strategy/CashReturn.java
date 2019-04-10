package com.doom.lucifer.strategy;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0;
    private double moneyReturn = 0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition){
            result = money - Math.floor(money/moneyCondition) * moneyReturn;
        }
        return result;
    }
}
