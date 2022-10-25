import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    @Test
    public void testIsPositiveNumber() {
        int number = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testIsPositiveNumberNegative(){
        int number = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
