import java.util.Scanner;

public class Main {
    public static void main( String[] args) {


        System.out.println("CAESAR CIPHER\n");

         Scanner sc = new Scanner(System.in);

        // Reading the input: plain message and the secret key
        System.out.print("Type the message: ");
        String message = sc.nextLine();
        System.out.print("Type the key: ");
        int key = sc.nextInt();
        sc.close();

        // Encrypting the plain message
        System.out.println("\nEncrypting...");
        String encryptedMessage = CaesarCipher.Encrypt(message, key);

        System.out.println("The encrypted message is: " +encryptedMessage);

        // Decrypting the encrypted message
        System.out.println("\nDecrypting...");
        String recoveredMessage = CaesarCipher.Decrypt(encryptedMessage, key);
        System.out.println("The decrypted message is: " +recoveredMessage);

        }

}