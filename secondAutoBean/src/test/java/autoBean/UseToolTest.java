package autoBean;

import config.Bean0;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//https://blog.csdn.net/BADAO_LIUMANG_QIZHI/article/details/85220669
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UseToolConfig.class})
public class UseToolTest {
    @Qualifier("sub0")
    @Autowired
    private ToolInterface sub0;

    @Qualifier("sub1")
    @Autowired
    private ToolInterface sub1;

    @Qualifier("config0")
    @Autowired
    private ToolInterface config;

    @Qualifier("sub2")
    @Autowired
    private ToolInterface sub2;

    @Autowired
    private Bean0 bean0;

    @Test
    public void subTool() {
        sub0.play();
        sub1.play();
        config.play();
        sub2.play();
        bean0.run();
        bean0.getName();
    }

}