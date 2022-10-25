import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualFirstNegative(){
        int expectedResult = -1;

        int actualResult = new AreNumberEquals().areNumbersEqual(-89, 89);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAreNumbersEqualNegative_HappyPath(){
        int expectedResult = 1;

        int actualResult = new AreNumberEquals().areNumbersEqual(89, -89);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreNumbersEqualBothNegative_Negative(){
        int expectedResult = 0;

        int actualResult = new AreNumberEquals().areNumbersEqual(89, 89);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
