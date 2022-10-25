import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

public class SumArrayTest {
    @Test
    public void testPositiveValues(){
        int[] numArr = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(numArr);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNegativeValues() {
        int[] numArr = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(numArr);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testZeroValues(){
        int[] zeroLenArr = new int[0];

        int expectedResult = 0;

        int actualReslut = new SumArray().sumArray(zeroLenArr);

        Assert.assertEquals(actualReslut,expectedResult);
    }


}
