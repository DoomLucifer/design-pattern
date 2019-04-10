package com.doom.lucifer.strategy;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class CashNormal extends CashSuper {
    @Override
    double acceptCash(double money) {
        return money;
    }
}
