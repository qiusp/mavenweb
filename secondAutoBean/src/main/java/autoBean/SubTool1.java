package autoBean;
import org.springframework.stereotype.Component;

//@component （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）,
        //必须与@Configuration和@ComponentScan实现注入（自动装配）,通过@Autowired或者@Resource使用，与@Bean类似
//@Component,@Service,@Controller,@Repository注解的类，并把这些类纳入进spring容器中管理。

@Component("sub1")
public class SubTool1 implements ToolInterface{
    @Override
    public void play() {
        System.out.println("成功注入SubTool1");
    }
}
