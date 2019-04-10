package com.doom.lucifer.strategy;

import java.math.BigDecimal;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    double acceptCash(double money) {
        return BigDecimal.valueOf(money).multiply(BigDecimal.valueOf(moneyRebate)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
