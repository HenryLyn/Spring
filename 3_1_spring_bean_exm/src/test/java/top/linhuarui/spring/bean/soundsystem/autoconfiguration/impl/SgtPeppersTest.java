package top.linhuarui.spring.bean.soundsystem.autoconfiguration.impl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.linhuarui.spring.bean.soundsystem.autoconfiguration.config.CDPlayerConfig;
import top.linhuarui.spring.bean.soundsystem.autoconfiguration.CompactDisc;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class SgtPeppersTest {

    @Rule
    public final SystemOutRule log  = new SystemOutRule().enableLog();

    @Autowired(required = false)
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull () {
        assertNotNull(cd);
    }

    @Test
    public void play () {
        cd.play();
        assertEquals("Playting Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLogWithNormalizedLineSeparator());

    }
}