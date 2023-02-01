package test;

import main.BalancedBrackets;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenBracketsLessThanZero(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenBracketsZeroButNotInOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenStartingWithClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenBracketsGreaterThanZero(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnTrueWhenBracketsIsZero(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnTrueWhenNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenOpeningBracketsRepeat(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenBracketsNested(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenBracketsNestedWithWords(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Hel[[LaunchCode]]lo]]"));
    }

    @Test
    public void hasBalancedBracketsShouldReturnTrueWhenOnlyCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello."));
    }

    @Test
    public void hasBalancedBracketsShouldReturnFalseWhenCodeAsAnd0sAreUsed(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[0[0[0a]a]a]"));
    }
    @Test
    public void hasBalancedBracketsShouldReturnTrueWithStringsInvolved(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello, my name is Adam.][Greetings, I hope this test has 0 errors.]"));
    }

}
