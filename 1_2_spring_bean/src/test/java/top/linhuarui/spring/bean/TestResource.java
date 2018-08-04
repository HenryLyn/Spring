package top.linhuarui.spring.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.resource.SelfResource;

import java.io.IOException;

/**
* @author LHR
* @date 2018/7/16
* @desc test resource
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {

    public TestResource () {
        super("classpath:spring-resource.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test resource method.
    * @params []
    * @returns void
    */
    @Test
    public void testResource () {
        SelfResource selfResource = super.getBean("selfResource");
        try {
            selfResource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
