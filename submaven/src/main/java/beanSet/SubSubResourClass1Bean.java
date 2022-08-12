package beanSet;

import beanConstruter.SubResourClass1;
import beanConstruter.SubSubResourClass1Param;

/**
 * 被注入的子类
 */
public class SubSubResourClass1Bean extends SubResourClass1 {

    public SubSubResourClass1Bean() {
    }

    public void run(){
        System.out.println("SubSubResourClass1");
    }
}
