import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {
    private PrimeNumberChecker primeNumberChecker;

    @BeforeMethod
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }
    @DataProvider(name = "Test1")
    public static Object[][] primeNumber(){
        return new Object[][]{{ 2, true} , {6,false} , {19, true} , {22, false} , {23, true}};
        }

        @Test( dataProvider = "Test1")
    public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult){
        System.out.println( inputNumber + " " + expectedResult);
        Assert.assertEquals( expectedResult, PrimeNumberChecker.validate(inputNumber));
    }
}
