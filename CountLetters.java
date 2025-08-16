//Function was Collected from SERG-Delft/mooc-software-testing and then tested, bug detected and solved.
//Problem: we should count the number of words in a sentence that end with "s" or "r".
//And we consider a new word to start when there's a non letter character in the middle.
//For example, "cat" has 0 words, "cats" has 1 word, "cats!dogs" has 2 words, "cats!dog" has 1 word, etc.
// Solution: words before non letter will be checked inside for loop,
//           words after non letter will be checked outside for loop.
package tudelft.countletters;

public class CountLetters {

    public int count(String str) {
        int words = 0;
        char last = ' ';
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i)) &&
                    (last == 'r' || last == 's')) {
                words++;
            }

            last = str.charAt(i);
        }

        // Bug Detected - requirement was for 'r', and 's', not for 'x'.
        //if(last == 'x' || last == 's')
        if(last == 'r' || last == 's')
            words++;

        return words;
    }

}
