package beanSet;


import aop.Log;

//容器类
public class ResourClassBean {

    //耦合类,接口引用
    private SubInterFaceBean subInterFaceBean;

    private Log log;

    //构造器注入,可传入SubResourClass0类或其子类
    public ResourClassBean(SubInterFaceBean subResourClass1Bean, Log log) {
        this.subInterFaceBean = subResourClass1Bean;
    }
    public void run(){
        log.runBefore();
        System.out.println("调用注入的bean");
        subInterFaceBean.run();
        log.runAfter();
    }

}
