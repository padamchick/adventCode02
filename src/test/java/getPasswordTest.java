import adventcode.Code;
import org.junit.Assert;
import org.junit.Test;

public class getPasswordTest {
    @Test
    public void testSampleInput() {
        String input = "input2.txt";
        String result = Code.decode(input).printPassword();
        String expected = "1985";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testIsStartingFromLastPosition() {
        String input = "input3.txt";
        String result = Code.decode(input).printPassword();
        String expected = "47";
        Assert.assertEquals(expected, result);
    }


}
