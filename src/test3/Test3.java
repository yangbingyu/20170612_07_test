package test3;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/12.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入取款金额：");
        double money=scanner.nextDouble();
        Bank bank=new Bank(1000);
        try {
            bank.withDrawal(money);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
