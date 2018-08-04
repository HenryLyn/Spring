package top.linhuarui.spring.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;

/**
* @author LHR
* @date 2018/7/16
* @desc test OneInterface
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc xml path configuration
    */
    public TestOneInterface () {
        super("classpath*:spring-ioc.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test OneInterface with ioc. - using xml configuration
    * @params []
    * @returns void
    */
    @Test
    public void testHello () {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.printf(oneInterface.hello("my input string."));
    }
    
}
