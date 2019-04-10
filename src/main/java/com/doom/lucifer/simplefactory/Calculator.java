package com.doom.lucifer.simplefactory;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Calculator {

    //简单封装
    private static String simple(){
        String result = "";
        try {
            System.out.println("请输入数字A:");
            Scanner scanner = new Scanner(System.in);
            BigDecimal numberA = scanner.nextBigDecimal();
            System.out.println("请输入运算符(+,-,*,/):");
            String operator = scanner.next();
            System.out.println("请输入数字B:");
            BigDecimal numberB = scanner.nextBigDecimal();
            result = Operation.getResult(numberA,numberB,operator);
            System.out.println("运算结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //简单工厂版
    private static void simpleFactory(){
        String result = "";
        try {
            Operation operation = OperationFactory.createOperation("/");
            operation.setNumberA(BigDecimal.valueOf(10));
            operation.setNumberB(BigDecimal.valueOf(0));
            result = operation.getResult();
            System.out.println("运算结果：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        simpleFactory();
    }
}
