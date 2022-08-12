package beanConfig;
import beanConstruter.ResourClass;
import beanConstruter.SubInterFace;
import beanConstruter.SubResourClass0;
import beanConstruter.SubResourClass1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//<dependency>
//<groupId>org.springframework</groupId>
//<artifactId>spring-context</artifactId>
//<version>5.3.21</version>
//</dependency>
@Configuration
public class ConfigCLASS {

    @Bean
    public ResourClass resourClass(){
        return new ResourClass(subResourClass0());
    }

    @Bean
    public SubResourClass0 subResourClass0(){
        return new SubResourClass0();
    }

}
