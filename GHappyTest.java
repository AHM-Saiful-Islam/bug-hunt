package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void singleGAtFirst() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("gxyj");
        Assertions.assertFalse(result);
    }
    @Test
    public void singleGAtMiddle() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("pedgxyj");
        Assertions.assertFalse(result);
    }
    @Test
    public void singleGAtLast() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("htdg");
        Assertions.assertFalse(result);
    }
    @Test
    public void multipleG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xyjgikdsg");
        Assertions.assertFalse(result);
    }

    @Test
    public void twoGAtFirst() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("ggxyj");
        Assertions.assertTrue(result);
    }
    @Test
    public void twoGAtMiddle() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xyjggikds");
        Assertions.assertTrue(result);
    }
    @Test
    public void twoGAtLast() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xyjgg");
        Assertions.assertTrue(result);
    }
    @Test
    public void multipleTwoG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xyggjizgglksgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleGAndTwoG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xyjguzrggswu");
        Assertions.assertFalse(result);
    }
    @Test
    public void singleGAtFirstAndTwoG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("gxyjgguzrggswu");
        Assertions.assertFalse(result);
    }
}
