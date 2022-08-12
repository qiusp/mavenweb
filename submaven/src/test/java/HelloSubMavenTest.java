import org.junit.Test;

public class HelloSubMavenTest {

    @Test
    public void message() {
        HelloSubMaven helloSubMaven = new HelloSubMaven();
        helloSubMaven.message();
    }

    @Test
    public void testXmlBean() {
        HelloSubMaven helloSubMaven = new HelloSubMaven();
        helloSubMaven.testXmlBean();
    }

    @Test
    public void tastAnnotation() {
        HelloSubMaven helloSubMaven = new HelloSubMaven();
        helloSubMaven.tastAnnotation();
    }



}
