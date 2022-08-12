package autowaired;
import autoBean.ToolInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@component （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）,
        //必须与@Configuration和@ComponentScan实现注入（自动装配）,通过@Autowired或者@Resource使用，与@Bean类似
//@Component,@Service,@Controller,@Repository注解的类，并把这些类纳入进spring容器中管理。

@Component("sub2")
public class SubTool2 implements ToolInterface {
    private SubTool2Param subTool2Param;

    private SubTool2SetParam subTool2SetParam;

    @Autowired
    public SubTool2(SubTool2Param subTool2Param) {
        this.subTool2Param = subTool2Param;
    }
    //实现注入
    @Autowired
    public void setParam(SubTool2SetParam subTool2SetParam){
        this.subTool2SetParam = subTool2SetParam;
    }

    @Override
    public void play() {
        System.out.println("------------------Autowired构造函数和set------------------------");
        subTool2Param.play();
        subTool2SetParam.play();
    }
}
