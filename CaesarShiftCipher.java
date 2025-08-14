//Function was Collected from SERG-Delft/mooc-software-testing and then tested, bug detected and solved.

// problem statement: A Caesar Cipher is a simple way to encrypt messages.
// There are two inputs: A message and a shift. The message can be any string containing lower case letters
// and spaces, any other characters will return 'invalid' The shift can be any positive or negative integer.
// Each letter of the message is then shifted by the specified amount
// (if shift is '3' then 'abc' becomes 'def' and 'xyz' becomes 'abc').

// 2 Bug Detected
// 1 Space is also considered as invalid input in the program
// but in requirement space was allowed input
// it's not solved here.

// Bug 2 detected
//sb.append(currentChar); this append adds input as it is.
// it's solved


package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift % 26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);

            // Bug detected
            //sb.append(currentChar); this append adds input as it is.
            if (currentChar > 'z' || currentChar < 'a') {
                return "invalid";
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);
            }
            sb.append((char) (currentChar + shift));
        }

        return sb.toString();
    }
}
