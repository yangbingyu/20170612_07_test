package test2;

/**
 * Created by dell on 2018/6/12.
 */
public class InputerrorException extends Exception {
    private String message;
    InputerrorException(String message){
        super();
        this.message=message;
    }
    InputerrorException(){
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
