import static org.junit.Assert.*;

public class TestWebTest {

    @org.junit.Test
    public void getMessage() {
        TestWeb testWeb = new TestWeb();
        String s = testWeb.getMessage();
        System.out.println(s);
    }
}