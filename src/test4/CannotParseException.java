package test4;

/**
 * Created by dell on 2018/6/12.
 */
public class CannotParseException extends RuntimeException {
    private String message;
    CannotParseException(String message){
        super();
        this.message=message;
    }
    CannotParseException(){
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
