package com.doom.lucifer.strategy;

import java.util.Scanner;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入单价：");
        double price = scanner.nextDouble();
        System.out.println("请输入数量：");
        double number = scanner.nextDouble();
        CashContext context = new CashContext("return");
        double result = context.getResult(price * number);
        System.out.println("合计：" + result);
    }
}
