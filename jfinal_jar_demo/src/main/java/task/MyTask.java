package task;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:38 2018/8/10
 * @modified By:
 */

public class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Another minute ticked away...");
    }

}
