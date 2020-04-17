package webadv.s17201128.p02;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;


/**
 * 17201128曾祥发
 */
public class AppTest {
 private String INPUT = "123456";
    @Test
    public void testLength() {
        Assert.assertEquals(64, App.sha256hex(INPUT).length());
    }
    @Test
    public void testHex() {
        String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
        Assert.assertEquals(expected, App.sha256hex(INPUT));
    }




    /*
extends TestCase
{


    public AppTest( String testName )
    {
        super( testName );
    }



    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }



    public void testApp()
    {
        assertTrue( true );
    }

*/
}
