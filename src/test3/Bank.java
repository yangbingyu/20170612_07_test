package test3;

/**
 * Created by dell on 2018/6/12.
 */
public class Bank {
    private double balence;
    public Bank(double balence){
        this.balence=balence;
    }

    public double withDrawal(double dAmount) throws Exception {
        if (dAmount>balence){
            throw  new Exception("取款金额大于余额，取款失败");
        }else if (dAmount<0){
            throw  new Exception("取款金额必须大于0");
        }else{
            balence-=dAmount;
        }
        return dAmount;
    }
}
