public class CaesarCipher {
    public static String Encrypt(String text, int positions) {
        StringBuilder toEncrypt = new StringBuilder();
        StringBuilder result = new StringBuilder();
        //format the text to be encrypted
        for (int i = 0; i < text.length(); i++) {
            //remove space characters
           if (text.charAt(i) == ' ')
           {
               toEncrypt.append(" ");
           }
            else {
                //if the character is lowercase, make it uppercase
                if (Character.isLowerCase(text.charAt(i)))
                     toEncrypt.append(Character.toUpperCase
                             (text.charAt(i)));
                 //otherwise keep the uppercase character
                 else
                 toEncrypt.append(text.charAt(i));
                 }
             }
         for (int i = 0; i < toEncrypt.length(); i++) {
             //shift the current letter of the message with given positions to right
             if (toEncrypt.charAt(i) == ' ') continue;
            char shiftedLetter = (char) (toEncrypt.charAt(i) +
                    positions);

            //if the ASCII code exceeds Z, then bring it back in the interval A to Z
             if (shiftedLetter > 'Z')
                 shiftedLetter = (char) (shiftedLetter +
                    'A' - 'Z' - 1);

             result.append(shiftedLetter);
             }

         return result.toString();
         }

    public static String Decrypt(String text, int positions) {
         //the encrypted code is already uppercase,
         //therefore there is no need of formatting
         StringBuilder result = new StringBuilder();

         for (int i = 0; i < text.length(); i++) {

             if (text.charAt(i) == ' ') {
                 result.append(" ");
                 continue;
             }
             //shift the current letter of the message with given positions to left
            char shiftedLetter = (char) (text.charAt(i) -
                    positions);

            //if the ASCII code exceeds A, then bring it back in the interval A to Z
            if (shiftedLetter < 'A')
                shiftedLetter = (char) (shiftedLetter -
                    'A' + 'Z' + 1);

            result.append(shiftedLetter);

             }

         return result.toString();
         }
}
