
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mode = scanner.nextLine();

        if (mode.equals("enc")) {
            System.out.println(encrypt(scanner.nextLine(),Integer.parseInt(scanner.nextLine())));
        }
        if (mode.equals("dec")) {
            System.out.println(decrypt(scanner.nextLine(),Integer.parseInt(scanner.nextLine())));
        }
    }
    static String encrypt(String data, int key) {
        ArrayList<Character> charList = new ArrayList<>();

        //String lowerCaseMessage = data.toLowerCase();

        for (char c: data/*lowerCaseMessage*/.toCharArray()
        ) {
            /*if (c == ' ') {
                charList.add(' ');
            } else {*/
                c = (char)(c + key);
                charList.add(c);
            /*} *//*else if (c < 'a' || c > 'z') {
                charList.add(c);
            } else {
                c = (char) ('a' + (((c - 'a') + key) % 26));
                charList.add(c);
            }*/
        }
        StringBuilder encrypted = new StringBuilder();
        for (char c: charList
        ) {
            encrypted.append(c);
        }
        return encrypted.toString()/*.toLowerCase()*/;
    }

    static String decrypt(String message, int key) {
        ArrayList<Character> charList = new ArrayList<>();

       // String lowerCaseMessage = message.toLowerCase();

        for (char c: message/*lowerCaseMessage*/.toCharArray()
        ) {
            /*if (c == ' ') {
                charList.add(' ');
            } else {*/
                c = (char)(c - key);
                charList.add(c);
            /*}*/ /*else if (c < 'a' || c > 'z') {
                charList.add(c);
            } else {
                c = (char) ('z' - ((('z' - c) + key) % 26));
                charList.add(c);
            }*/
        }
        StringBuilder decrypted = new StringBuilder();
        for (char c: charList
        ) {
            decrypted.append(c);
        }
        return decrypted.toString()/*.toLowerCase()*/;
    }
}
