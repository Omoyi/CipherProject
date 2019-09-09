package Cipher;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        String message;
        StringBuilder encryptedMessage = new StringBuilder();
        int number;


          Scanner myScn = new Scanner(System.in);


          System.out.println("Enter a message: ");
        message= myScn.nextLine();

          System.out.println("Enter key: ");
   number= myScn.nextInt();
   Encryption encryption=new Encryption();
        String encryptedMsg=encryption.Encryption(message,number);


            System.out.println("Encrypted Message = " +encryptedMsg );
            // Dec

            Scanner scn = new Scanner(System.in);

            System.out.println("Enter a message: ");
            message = scn.nextLine();

            System.out.println("Enter key: ");
            number = scn.nextInt();

        Decryption encryption=new Decryption();
            System.out.println("Decrypted Message = " + decryptedMessage);
        }

    }
