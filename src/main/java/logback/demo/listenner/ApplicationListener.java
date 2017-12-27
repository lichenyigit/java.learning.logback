package logback.demo.listenner;


import logback.demo.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {
    Logger logger = LoggerFactory.getLogger(ApplicationListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        logger.info("初始化完成");
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.trace(DateUtil.dateFormart4ymdHMS());
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
