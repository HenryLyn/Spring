package top.linhuarui.spring.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
* @author LHR
* @date 2018/7/18
* @desc Mybatis utils.
*/
public class MybatisUtils {
    
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Class CLASS_LOCK = MybatisUtils.class;

    /**
    * @author LHR
    * @date 2018/7/18
    * @desc init SqlSessionFactory.
    * @params []
    * @returns org.apache.ibatis.session.SqlSessionFactory
    */
    public static SqlSessionFactory initSqlSessionFactory () {
        InputStream is = null;
        try {
            // load configuration xml.
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // add a synchronized lock for initializing sqlSessionFactory.
        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            }
        }

        return sqlSessionFactory;
    }

    /**
    * @author LHR
    * @date 2018/7/18
    * @desc open SqlSession
    * @params []
    * @returns org.apache.ibatis.session.SqlSession
    */
    public static SqlSession openSqlSession () {
        if (sqlSessionFactory == null) {
            initSqlSessionFactory();
        }

        return sqlSessionFactory.openSession();
    }

}
