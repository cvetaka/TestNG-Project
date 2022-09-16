import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {

    @Test(dataProvider = "Test1")
    public void parameterTest1(String myName){
        System.out.println("Parameterized Value: is " + myName);
    }

    @DataProvider(name="Test1")
    public static Object[] names(){
        return new Object[]{
                "Ivan" , "Dimitar" , "Stefan"
        };
    }
}
