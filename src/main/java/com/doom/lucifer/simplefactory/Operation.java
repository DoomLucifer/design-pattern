package com.doom.lucifer.simplefactory;

import lombok.Data;

import java.math.BigDecimal;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
@Data
abstract class Operation {

    private BigDecimal numberA;
    private BigDecimal numberB;

    abstract String getResult();

    //封装
    static String getResult(BigDecimal numberA, BigDecimal numberB, String operator){
        BigDecimal result = BigDecimal.ZERO;
        switch (operator){
            case "+":
                result = numberA.add(numberB);
                break;
            case "-":
                result = numberA.subtract(numberB);
                break;
            case "*":
                result = numberA.multiply(numberB);
                break;
            case "/":
                if (numberB.equals(BigDecimal.ZERO)) throw new IllegalArgumentException("除数为0");
                result = numberA.divide(numberB,2,BigDecimal.ROUND_HALF_UP);
                break;
        }
        return result.toPlainString();
    }
}
