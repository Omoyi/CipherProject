package Cipher;
public class Encryption{
    public  String Encryption(String message,int number){
        char theText;
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            theText = message.charAt(i);

            if (theText >= 'a' && theText <= 'z') {
                theText = (char) (theText + number);

                if (theText > 'z') {
                    theText = (char) (theText - 'z' + 'a' - 1);
                }

                encryptedMessage.append(theText);
            } else if (theText >= 'A' && theText <= 'Z') {
                theText = (char) (theText + number);

                if (theText > 'Z') {
                    theText = (char) (theText - 'Z' + 'A' - 1);
                }

                encryptedMessage.append(theText);
            } else {
                encryptedMessage.append(theText);
            }
        }
        String theTextInString=new String(encryptedMessage);
        return  theTextInString;

    }
}