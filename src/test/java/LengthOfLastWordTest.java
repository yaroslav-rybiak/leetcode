import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {



    @Test
    public void testLengthOfLastWord(){
        Assert.assertEquals(5, LengthOfLastWord.lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, LengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}
