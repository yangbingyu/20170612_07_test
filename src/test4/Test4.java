package test4;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/12.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入5个整数，用逗号隔开");
        String string=scanner.next();
        String[] ints=string.split(",");
        if(ints==null||ints.length<5){
//            try {
                throw new NumberNotEnoughException("需要5个数字");
//            } catch (NumberNotEnoughException e) {
//                e.printStackTrace();
//            }
        }
        int[] is=new int[5];
        for (int i=0;i<5;i++) {
            try{
                int int1 = Integer.parseInt(ints[i]);
            }catch (NumberNotEnoughException e){
                throw new CannotParseException("不能将这个转化成数字");
            }
        }
    }
}
