package autoBean;

import autowaired.SubTool2;
import config.ConfigClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration 相当于定于一个xml(beans)
//@ComponentScan默认扫描当前包下的@Component

@Configuration
//@ComponentScan({"autoBean","config"})
@ComponentScan(basePackageClasses = {SubTool0.class, SubTool1.class, ConfigClass.class, SubTool2.class})
public class UseToolConfig {
}
