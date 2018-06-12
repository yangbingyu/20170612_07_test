package test1;

/**
 * Created by dell on 2018/6/12.
 */
public class Test1 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Computer computer=new Computer();
        try {
            teacher.teach(computer);
        } catch (StopException e) {
            System.out.println("换台电脑吧！！");
        }
    }
}
