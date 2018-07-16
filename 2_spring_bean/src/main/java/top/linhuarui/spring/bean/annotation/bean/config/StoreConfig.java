package top.linhuarui.spring.bean.annotation.bean.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import top.linhuarui.spring.bean.annotation.bean.Store;
import top.linhuarui.spring.bean.annotation.bean.impl.IntergerStore;
import top.linhuarui.spring.bean.annotation.bean.impl.MyDriverManager;
import top.linhuarui.spring.bean.annotation.bean.impl.StringStore;

/**
* @author LHR
* @date 2018/7/16
* @desc store config
*/
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean
//    public MyDriverManager myDriverManager () {
//        return new MyDriverManager(url, username, password);
//    }

//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//    //@Scope(value = "prototype")
//    public Store stringStore() {
//        return new StringStore();
//    }

    // below for generic

    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore () {
        return new StringStore();
    }

    @Bean
    public IntergerStore integerStore () {
        return new IntergerStore();
    }

    @Bean(name = "stringStoreTest")
    public Store stringStoreTest () {
        System.out.println("s1 class name: " + s1.getClass().getName());
        System.out.println("s2 class name: " + s2.getClass().getName());
        return new StringStore();
    }
}
