import org.junit.Assert;
import org.junit.Test;

public class RomansToIntegerTest {

    @Test
    public void testRomansToInteger() {
        Assert.assertEquals(94, RomansToInteger.romanToInt("XCIV"));
        Assert.assertEquals(58, RomansToInteger.romanToInt("LVIII"));
        Assert.assertEquals(1994, RomansToInteger.romanToInt("MCMXCIV"));
        Assert.assertEquals(3, RomansToInteger.romanToInt("III"));

    }
}
