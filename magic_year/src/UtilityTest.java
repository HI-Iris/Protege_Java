import junit.framework.TestCase;

public class UtilityTest extends TestCase {
    public void testIsNum(){
        String str1 = "sdfsa";
        String str2 = "12321";
        String str3 = "123fdasdfs";
        Utility testUtility = new Utility();
        boolean str1Test = testUtility.isNum(str1);
        boolean str2Test = testUtility.isNum(str2);
        boolean str3Test = testUtility.isNum(str3);
        assertTrue(str1Test==false);
        assertTrue(str2Test==true);
        assertTrue(str3Test==false);
    }
}