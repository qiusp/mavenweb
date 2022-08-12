package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstBeans {

    @Bean(name = "testbean")
    public Bean0 bean0(){
        Bean0 bean0 = new Bean0();
        bean0.setName("第一个bean");
        return bean0;
    }
}
