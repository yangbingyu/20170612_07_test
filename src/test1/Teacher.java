package test1;


import org.apache.log4j.Logger;

/**
 * Created by dell on 2018/6/12.
 */
public class Teacher {
    private static Logger logger=Logger.getLogger(Teacher.class);
    public void teach(Computer computer) throws StopException{
        try {
            logger.info("尝试运行电脑");
            computer.run();
            logger.info("正常上课");
//            System.out.println("正在讲课");
        }catch (LanpingException e){
//            e.printStackTrace();
            computer.reset();
            logger.info("正常上课");
//            teach(computer);
        }catch (MaoyanException e){
//            e.printStackTrace();
            logger.fatal("电脑冒烟啦!!!这个课没法上了……");
            throw new StopException("电脑冒烟啦!!!这个课没法上了……");
        }
    }
}
