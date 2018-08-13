package config;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.template.Engine;
import controller.HelloController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import task.MyTask;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:35 2018/8/10
 * @modified By:
 */

public class AppConfig extends JFinalConfig {

    protected static Logger logger = LoggerFactory.getLogger(AppConfig.class);

    //用于启动JFinal
    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 2018, "/");
    }

    @Override
    public void configConstant(Constants me) {
//        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }

    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {
        System.out.println("run cron4jPlugin");

        Cron4jPlugin cpTask = new Cron4jPlugin();
//        cpTask.addTask("0-59/1 * * * *", new MyTask(
        cpTask.addTask("*/1 * * * *", new MyTask());
        me.add(cpTask);
    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
