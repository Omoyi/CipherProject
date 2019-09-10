package Cipher;
public class Decryption {
    public String Decryption(String message,int number){
        char theText;
        StringBuilder decryptedMessage = new StringBuilder();
        for (int j = 0; j < message.length(); ++j) {
            theText = message.charAt(j);

            if (theText >= 'a' && theText <= 'z') {
                theText = (char) (theText - number);

                if (theText < 'a') {
                    theText = (char) (theText + 'z' - 'a' + 1);
                }

                decryptedMessage.append(theText);
            } else if (theText >= 'A' && theText <= 'Z') {
                theText = (char) (theText - number);

                if (theText < 'A') {
                    theText = (char) (theText + 'Z' - 'A' + 1);
                }

                decryptedMessage.append(theText);
            } else {
                decryptedMessage.append(theText);
            }
        }
        String theTextInString=new String(decryptedMessage);
        return  theTextInString;
    }
}
