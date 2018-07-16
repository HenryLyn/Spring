package top.linhuarui.spring.bean.Annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.annotation.jsr.JsrService;

/**
* @author LHR
* @date 2018/7/16
* @desc test jsr
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJSR extends UnitTestBase {

    public TestJSR () {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testSave () {
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save();
    }

}
