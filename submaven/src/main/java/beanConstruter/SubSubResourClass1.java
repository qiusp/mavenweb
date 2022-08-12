package beanConstruter;

public class SubSubResourClass1 extends SubResourClass1{

    private SubSubResourClass1Param subSubResourClass1Param;
    public SubSubResourClass1(SubSubResourClass1Param subSubResourClass1Param) {
        this.subSubResourClass1Param = subSubResourClass1Param;
    }

    public void run(){
        System.out.println("SubSubResourClass1");
    }
}
