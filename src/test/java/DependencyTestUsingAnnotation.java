import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
    // test case 1
    @Test(dependsOnMethods = {"testCase2"})
    public void testCase1() { System.out.println("in test case 1"); }

    // test case 2
    @Test(dependsOnMethods = {"testCase3"})
    public void testCase2() { System.out.println("in test case 2"); }

    // test case 3
    @Test(dependsOnMethods = {"testCase4"})
    public void testCase3() { System.out.println("in test case 3"); }

    // test case 4
    @Test(dependsOnMethods = {"testCase5"})
    public void testCase4() { System.out.println("in test case 4"); }

    // test case 5
    @Test(dependsOnMethods = {"testCase6"})
    public void testCase5() { System.out.println("in test case 5"); }

    // test case 6
    @Test
    public void testCase6() { System.out.println("in test case 6"); }
}
