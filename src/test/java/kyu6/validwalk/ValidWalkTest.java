package kyu6.validwalk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidWalkTest {

    ValidWalk TenMinWalk = new ValidWalk();

    @Test
    public void Test() {
        assertEquals(true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}), "Should return true");
        assertEquals(true, TenMinWalk.isValid(new char[] {'n','s','e','w','n','s','w','e','e','w'}), "Should return true");
        assertEquals( false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}), "Should return false");
        assertEquals( false, TenMinWalk.isValid(new char[] {'w'}), "Should return false");
        assertEquals( false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}), "Should return false");
    }
}