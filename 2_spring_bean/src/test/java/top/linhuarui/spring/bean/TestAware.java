package top.linhuarui.spring.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;

/**
* @author LHR
* @date 2018/7/16
* @desc test aware
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

    public TestAware () {
        super("classpath:spring-aware.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test application context aware.
    * @params []
    * @returns void
    */
    @Test
    public void testApplicationContextAware () {
        System.out.println("testApplicationContextAware: " + super.getBean("applicationContext").hashCode());
    }

    @Test
    public void testBeanNameAware () {
        System.out.println("testBeanNameAware: " + super.getBean("beanName").hashCode());
    }

}
