package top.linhuarui.spring.bean.soundsystem.autoconfiguration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.linhuarui.spring.bean.soundsystem.autoconfiguration.impl.CDComponents;

@Configuration
@ComponentScan(basePackageClasses = {
        CDComponents.class
})
public class CDPlayerConfig {
}
