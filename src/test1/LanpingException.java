package test1;

/**
 * Created by dell on 2018/6/12.
 */
public class LanpingException extends Exception{
    private String message;
    LanpingException(String message){
        super();
        this.message=message;
    }
    LanpingException(){
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
