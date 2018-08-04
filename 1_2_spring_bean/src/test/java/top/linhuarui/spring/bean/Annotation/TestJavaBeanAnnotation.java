package top.linhuarui.spring.bean.Annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.annotation.bean.Store;
import top.linhuarui.spring.bean.annotation.bean.impl.MyDriverManager;

/**
* @author LHR
* @date 2018/7/16
* @desc test java bean annotation
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaBeanAnnotation extends UnitTestBase {

    public TestJavaBeanAnnotation () {
        super("classpath:spring-beanannotation.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc get bean
    * @params []
    * @returns void
    */
    @Test
    public void testGetBean () {
        Store store = super.getBean("stringStore");
        System.out.println("class name: " + store.getClass().getName());
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test MyDriverManager
    * @params []
    * @returns void
    */
    @Test
    public void testMyDriverManager () {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
        System.out.println("myDriverManager: " + myDriverManager.getClass().getName());
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc Test bean scope
    * @params []
    * @returns void
    */
    @Test
    public void testBeanScope () {
        Store store = super.getBean("stringStore");
        System.out.println("class name: " + store.hashCode());

        Store store2 = super.getBean("stringStore");
        System.out.println("class name: " + store2.hashCode());
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test generic
    * @params []
    * @returns void
    */
    @Test
    public void testG () {
        Store store = super.getBean("stringStoreTest");
    }

}
