

import java.util.Scanner;
// import static java.En

public class Caesar {
    public static void main(String[] args) {
          String message;
        StringBuilder encryptedMessage = new StringBuilder();
        int number;
          char theText;
          Scanner myScn = new Scanner(System.in);

          System.out.println("Enter a message: ");
          message = myScn.nextLine();

          System.out.println("Enter key: ");
        number = myScn.nextInt();

          for(int i = 0; i < message.length(); ++i){
              theText = message.charAt(i);

          if(theText >= 'a' && theText <= 'z'){
              theText = (char)(theText + number);

             if(theText > 'z'){
                 theText = (char)(theText - 'z' + 'a' - 1);
             }

           encryptedMessage.append(theText);
           }
           else if(theText >= 'A' && theText <= 'Z'){
              theText = (char)(theText + number);

                        if(theText > 'Z'){
                            theText = (char)(theText - 'Z' + 'A' - 1);
                        }

                        encryptedMessage.append(theText);
                    }
                    else {
                        encryptedMessage.append(theText);
                    }
                }

                System.out.println("Encrypted Message = " + encryptedMessage);

          // Decryption


        StringBuilder decryptedMessage = new StringBuilder();

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a message: ");
        message = scn.nextLine();

        System.out.println("Enter key: ");
        number = scn.nextInt();

        for(int i = 0; i < message.length(); ++i){
            theText = message.charAt(i);

            if(theText >= 'a' && theText <= 'z'){
                theText = (char)(theText - number);

                if(theText < 'a'){
                    theText = (char)(theText + 'z' - 'a' + 1);
                }

                decryptedMessage.append(theText);
            }
            else if(theText >= 'A' && theText <= 'Z'){
                theText = (char)(theText - number);

                if(theText < 'A'){
                    theText = (char)(theText + 'Z' - 'A' + 1);
                }

                decryptedMessage.append(theText);
            }
            else {
                decryptedMessage.append(theText);
            }
        }

        System.out.println("Decrypted Message = " + decryptedMessage);
            }

        }