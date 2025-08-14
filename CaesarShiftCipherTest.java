package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void positiveShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc", 3);
        String expected = "def";
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void negativeShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("def", -3);
        String expected = "abc";
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void zeroShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc", 0);
        String expected = "abc";
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void oneShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc", 1);
        String expected = "bcd";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void messageWithSpace(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("ab c", 1);
        String expected = "bc d";
        Assertions.assertEquals(expected, result);
        // Bug report: it should work according to requirement. But it is not working. Details are in code.
    }

    @Test
    public void invalidMessageWithPositiveShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("ab3c", 3);
        Assertions.assertEquals("invalid", result);
    }
    @Test
    public void invalidMessageWithNegativeShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc%bcd&22", -3);
        Assertions.assertEquals("invalid", result);
    }
    @Test
    public void invalidMessageWithZeroShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc5", 0);
        Assertions.assertEquals("invalid", result);
    }

}
