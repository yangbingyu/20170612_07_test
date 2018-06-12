package test4;

/**
 * Created by dell on 2018/6/12.
 */
public class NumberNotEnoughException extends RuntimeException {
    private String message;
    NumberNotEnoughException(String message){
        super();
        this.message=message;
    }
    NumberNotEnoughException(){
        super();
    }

    public String toString(){
        return "程序发生异常，异常原因是:"+message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
