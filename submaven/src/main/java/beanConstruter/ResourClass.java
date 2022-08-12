package beanConstruter;

public class ResourClass {

    //耦合类,接口引用
    private SubInterFace subInterFace;

    //构造器注入,可传入SubResourClass0类或其子类
    public ResourClass(SubInterFace subInterFace) {
        this.subInterFace = subInterFace;
    }
    public void run(){
        subInterFace.run();
    }

}
