package Cipher;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        String message,message1;
        StringBuilder encryptedMessage = new StringBuilder();
        int number,number1;
        Boolean program=true;
        while(program){
            Scanner myScn = new Scanner(System.in);

            System.out.println("Encryption , Decryption or Exit " );
            String choice=myScn.nextLine();
            if(choice.equals("Encryption")){

                System.out.println("Enter a message: ");
                message= myScn.nextLine();

                System.out.println("Enter key: ");
                number= myScn.nextInt();
                Encryption encryption=new Encryption();
                String encryptedMsg=encryption.Encryption(message,number);


                System.out.println("Encrypted Message = " +encryptedMsg );
            }

            else if(choice.equals("Decryption"))
            {
                System.out.println("Enter a message: ");
                message1 = myScn.nextLine();

                System.out.println("Enter key: ");
                number1 = myScn.nextInt();

                Decryption decryption=new Decryption();
                String decryptedMessage=decryption.Decryption(message1,number1);
                System.out.println("Decrypted Message = " + decryptedMessage);
            }
            else if(choice.equals("Exit")){
                System.out.println("Thank you!bye");
                program=false;

            }
            else
            {
                System.out.println("invalid input");
            }

        }

        }

    }
