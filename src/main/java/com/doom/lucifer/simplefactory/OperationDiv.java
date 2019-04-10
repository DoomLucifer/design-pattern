package com.doom.lucifer.simplefactory;

import java.math.BigDecimal;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class OperationDiv extends Operation {
    @Override
    String getResult() {
        BigDecimal result;
        if (BigDecimal.ZERO.equals(getNumberB())) throw new IllegalArgumentException("除数不能为0");
        result = getNumberA().divide(getNumberB(),2,BigDecimal.ROUND_HALF_UP);
        return result.toPlainString();
    }
}
