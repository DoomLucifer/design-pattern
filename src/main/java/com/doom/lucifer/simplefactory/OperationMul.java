package com.doom.lucifer.simplefactory;

import java.math.BigDecimal;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class OperationMul extends Operation {
    @Override
    String getResult() {
        BigDecimal result = getNumberA().multiply(getNumberB());
        return result.toPlainString();
    }
}
