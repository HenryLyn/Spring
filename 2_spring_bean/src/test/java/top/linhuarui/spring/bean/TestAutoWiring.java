package top.linhuarui.spring.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.autowiring.AutoWiringService;

/**
* @author LHR
* @date 2018/7/16
* @desc Test auto wiring.
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {

    public TestAutoWiring () {
        super("classpath:spring-autowiring.xml");
    }
    
    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test auto wiring
    * @params []
    * @returns void
    */
    @Test
    public void testAutoWiring () {
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("Testing");
    }
}
