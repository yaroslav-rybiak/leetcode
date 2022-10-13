import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void testValidParentheses() {

        Assert.assertTrue(ValidParentheses.isValid("()"));
        Assert.assertTrue(ValidParentheses.isValid("()[]{}"));
        Assert.assertTrue(ValidParentheses.isValid("([]{})"));
        Assert.assertTrue(ValidParentheses.isValid("([{{}}])[()]{([])}"));

        Assert.assertFalse(ValidParentheses.isValid("("));
        Assert.assertFalse(ValidParentheses.isValid("(]"));
        Assert.assertFalse(ValidParentheses.isValid("([)]"));
        Assert.assertFalse(ValidParentheses.isValid("))"));
        Assert.assertFalse(ValidParentheses.isValid("(("));
    }
}
