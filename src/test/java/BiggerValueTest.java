import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    @Test
    public void testCheckGreaterNumber_HappyPath(){
        Assert.assertEquals(new BiggerValue().biggerValue(3333, 9999), 9999);
        Assert.assertEquals(new BiggerValue().biggerValue(6, 2), 6);
    }
}
