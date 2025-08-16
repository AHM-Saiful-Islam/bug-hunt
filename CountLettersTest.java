// 100% Line, Statement, Branch, condition Function, and Class --> coverage (True and False entry checked by both branch, inside and outside of 'for' loop).
// blur|goods - r checked inside for loop (True) and s checked outside for loop (True), and
// cat|dog - cat checked inside for loop (False) and s checked outside for loop (False).

package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("blur|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("dogs|rat");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatch() {
        int words = new CountLetters().count("vision|blur");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void bothWordsDoNotMatch() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }
}
