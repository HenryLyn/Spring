package top.linhuarui.spring.bean.soundsystem.autoconfiguration.impl;

import org.springframework.stereotype.Component;
import top.linhuarui.spring.bean.soundsystem.autoconfiguration.CompactDisc;

/**
* @author LHR
* @date 2018/8/4
* @desc sgt peppers, which is a compact disc implementation.
*/
@Component(value = "sgtPeppers")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playting " + title + " by " + artist);
    }
}
