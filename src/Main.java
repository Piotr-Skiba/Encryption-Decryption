
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> parametrers = new HashMap<>();
        for (int i = 0; i < args.length - 1; i++) {
            parametrers.put(args[i],args[i+1]);
        }


        if (parametrers.getOrDefault("-mode","enc").equals("enc")) {
            System.out.println(encrypt(parametrers.getOrDefault("-data",""),Integer.parseInt(parametrers.getOrDefault("-key","0"))));
        }
        if (parametrers.getOrDefault("-mode","enc").equals("dec")) {
            System.out.println(decrypt(parametrers.getOrDefault("-data",""),Integer.parseInt(parametrers.getOrDefault("-key","0"))));
        }
    }
    static String encrypt(String data, int key) {
        ArrayList<Character> charList = new ArrayList<>();



        for (char c: data.toCharArray()
        ) {
                c = (char)(c + key);
                charList.add(c);
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

        for (char c: message.toCharArray()
        ) {
                c = (char)(c - key);
                charList.add(c);
        }
        StringBuilder decrypted = new StringBuilder();
        for (char c: charList
        ) {
            decrypted.append(c);
        }
        return decrypted.toString();
    }

}
