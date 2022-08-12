package aop;

public class Log {

    private Print print;

    public Log(Print print) {
        this.print = print;
    }

    public void runBefore() {
        print.prints("Before");
    }

    public void runAfter() {
        print.prints("After");
    }

}
