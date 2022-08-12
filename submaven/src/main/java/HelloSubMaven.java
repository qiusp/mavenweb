import beanConfig.ConfigCLASS;
import beanConstruter.ResourClass;
import beanSet.ResourClassBean;
import beanSet.SubResourClass1Bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class HelloSubMaven {
    public void message(){
        System.out.println("Hello SubMaven: 测试工具");
    }

    public void testXmlBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //注入SubResourClass1Bean
        ResourClassBean resourClassBean = context.getBean(ResourClassBean.class);
        resourClassBean.run();
        System.out.println("------------------------------------------------------------------");
        SubResourClass1Bean subResourClass1Bean = context.getBean(SubResourClass1Bean.class);
        subResourClass1Bean.run();

    }

    public void tastAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigCLASS.class);
        ResourClass configCLASS = context.getBean(ResourClass.class);
        configCLASS.run();
    }
}
