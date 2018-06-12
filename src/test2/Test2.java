package test2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by dell on 2018/6/12.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入职员年龄");
        int age=scanner.nextInt();
        Emp emp=new Emp();
        try {
            emp.setAge(age);
        } catch (AgeException e) {
            e.printStackTrace();
        }catch (InputMismatchException e){
            try {
                throw new InputerrorException("只能输入数字");
            } catch (InputerrorException e1) {
                e1.printStackTrace();
            }
        }
    }

}
