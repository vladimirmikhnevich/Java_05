import org.testng.annotations.Test;

public class RemoveAllSpacesTest {

    @Test

    public void testRemoveAllSpaces(){
        String spaces = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        String actualResult = "    R e d     Ro ve    r Sc   h ool   ";
    }
    @Test

    public void testRemoveAllSpaces1(){
       String spaces1 = "p a     n   d a   ";
       String expectedResult = "panda";
       String actualResult = "p a     n   d a   ";
    }
}
