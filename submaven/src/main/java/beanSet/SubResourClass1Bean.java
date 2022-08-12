package beanSet;


//被注入的父类
public class SubResourClass1Bean implements SubInterFaceBean {

    public void run(){
        System.out.println("调用bean本身的方法:");
        System.out.println("SubResourClass1Bean");
    }
}
