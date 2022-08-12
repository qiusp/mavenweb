package beanConstruter;

import org.junit.Test;

public class ResourClassTest {

    @Test
    public void run() {

        //正常实现
        SubResourClass0 subResourClass0 = new SubResourClass0();
        //正常传入
        SubResourClass1 subResourClass1 = new SubResourClass1();
        //传入子类:无论是继承或者实现接口,都可以用最终的父类或接口来引用
        SubSubResourClass1Param subSubResourClass1Param = new SubSubResourClass1Param();
        SubSubResourClass1 subSubResourClass1 = new SubSubResourClass1(subSubResourClass1Param);
        //已经含有subResourClass0对象
        ResourClass resourClass = new ResourClass(subResourClass0);
        resourClass.run();
        ResourClass resourClass1 = new ResourClass(subResourClass1);
        resourClass1.run();
        ResourClass resourClass2 = new ResourClass(subSubResourClass1);
        resourClass2.run();


        //通过配置实现注入

    }
}