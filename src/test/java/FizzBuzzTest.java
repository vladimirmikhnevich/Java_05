import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    //1 Positive testing Happy path
    // if (start <= end)
    // return array;

    // start  < end
    @Test
    public void testStartLessThanEnd_HappyPath() {
        ///AAA
        //arange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // start == ned
    @Test
    public void testStartEqualsEnd_HappyPath() {
        ///AAA
        //arange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // start  < end
//    @Ignore
    @Test
    public void testStartLessOfThanEnd_StartEnAreNegative_HappyPath() {
        ///AAA
        //arange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11", "Buzz", "Fizz", "-8",
                "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1",};
//"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
//                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2 Negative testing
    // if (start > end)
    // return new String[0];
    @Test
    public void testStartGreaterThanEnd_Negative() {
        ///AAA
        //arange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
//git remote add origin https://github.com/vladimirmikhnevich/Java_05.git
//        'It is super puper commit! I\'ve fixed everything in the world!'
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

//        int[] intArray = new int[20]; // combining both statements in one

        //youtube 3.15.46
    }
}
