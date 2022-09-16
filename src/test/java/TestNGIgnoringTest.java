import org.testng.annotations.*;

public class TestNGIgnoringTest {
    // test case 1
    @Test(enabled = false)
    public void testCase1() {
        System.out.println("in test case 1");
    }

    // test case 2
    @Test(enabled = false)
    public void testCase2() {
        System.out.println("in test case 2");
    }

    // test case 3
    @Test
    public void testCase3() { System.out.println("in test case 3"); }

    // test case 4
    @Test
    public void testCase4() { System.out.println("in test case 4"); }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @BeforeClass
    public void beforeClass() { System.out.println("in beforeClass"); }

    @AfterClass
    public void afterClass() { System.out.println("in afterClass"); }

    @BeforeSuite
    public void beforeSuite() { System.out.println("in beforeSuite"); }

    @AfterSuite
    public void afterSuite() { System.out.println("in afterSuite");}

}
