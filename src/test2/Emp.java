package test2;


import org.apache.log4j.Logger;

/**
 * Created by dell on 2018/6/12.
 */
public class Emp {
    private static Logger logger=Logger.getLogger(Emp.class);
    private int age;
    Emp(int age){
        this.age=age;
    }
    Emp(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age<0||age>120){
            throw new AgeException("年龄应该在0-120之间");
        }
    }
}
