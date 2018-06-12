package test1;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/12.
 */
public class Computer {
//    Scanner scanner=new Scanner(System.in);
//    int state=scanner.nextInt();
    private static Logger logger= Logger.getLogger(Computer.class);
    public void reset(){
//        state=1;
        System.out.println("电脑重启中~");
        logger.warn("电脑重启了");
    }
    public void run()throws LanpingException, MaoyanException {
        int status=(int)(Math.random()*6);
        if (status==0){
            logger.error("电脑蓝屏了");
            throw new LanpingException("电脑蓝屏啦！");
        }else if (status==1){
            logger.fatal("电脑冒烟了");
            throw new MaoyanException("电脑冒烟啦！");
        }else{
            logger.info("电脑正常运行");
            System.out.println("电脑正在运行~");
        }
    }
}
