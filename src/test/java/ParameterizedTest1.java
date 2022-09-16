import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {

    @Test
    @Parameters("myName")
    public void parameterTest1(String myName){
        System.out.println("Parameterized Value: " + myName);
    }
}
