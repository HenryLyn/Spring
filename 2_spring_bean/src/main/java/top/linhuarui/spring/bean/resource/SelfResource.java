package top.linhuarui.spring.bean.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class SelfResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource () throws IOException {

//        Resource resource = applicationContext.getResource("classpath:config.txt"); // this for classpath
//        Resource resource = applicationContext.getResource("file:C:\\D\\0-GitHub\\Spring\\2_spring_bean\\src\\main\\resources\\config.txt"); // this for file system
//        Resource resource = applicationContext.getResource("url:https://github.com/HenryLyn/Spring/blob/master/README.txt"); // this for url
        Resource resource = applicationContext.getResource("config.txt"); // this rely on application context
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }

}
