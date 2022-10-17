import org.junit.Assert;
import org.junit.Test;

public class PolishNameTest {

    @Test
    public void testSolution() {
        Assert.assertEquals("male", PolishName.determineGender("Mariusz"));
        Assert.assertEquals("male", PolishName.determineGender("Michal"));
        Assert.assertEquals("female", PolishName.determineGender("Monika"));
        Assert.assertEquals("female", PolishName.determineGender("Anna"));
        Assert.assertEquals("female", PolishName.determineGender("Maria"));
    }
}
