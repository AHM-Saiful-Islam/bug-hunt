// Code is collected from github.com/SERG-Delft/mooc-software-testing for learning purpose

package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                // Bug Detected
                // if (i >= 0 && str.charAt(i-1) == 'g') { continue; } // i>=0 and i-1 indicate index -1, created error
                if (i >0 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
