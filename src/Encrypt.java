import java.util.ArrayList;

class EncryptDecryptUnicode implements EncryptDecrypt {



    @Override
    public String encrypt(String data, int key) {
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

    @Override
    public String decrypt(String data, int key) {
        ArrayList<Character> charList = new ArrayList<>();

        for (char c: data.toCharArray()
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

class EncryptDecryptShift implements EncryptDecrypt {


    @Override
    public String encrypt(String data, int key) {
        ArrayList<Character> charList = new ArrayList<>();

        for (char c: data.toCharArray()
        ) {
            if (Character.isUpperCase(c)) {
                c = (char)(((int)c + key - 65) % 26 + 65);
                charList.add(c);
            } else if (Character.isLowerCase(c)) {
                c = (char)(((int)c + key - 97) % 26 + 97);
                charList.add(c);
            } else if (c == ' ') {
                charList.add(' ');
            } else {
                charList.add(c);
            }
        }

        StringBuilder encrypted = new StringBuilder();
        for (char c: charList
        ) {
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String data, int key) {
        ArrayList<Character> charList = new ArrayList<>();
         key = 26 - key;

        for (char c: data.toCharArray()
        ) {
            if (Character.isUpperCase(c)) {
                c = (char)(((int)c + key - 65) % 26 + 65);
                charList.add(c);
            } else if (Character.isLowerCase(c)) {
                c = (char)(((int)c + key - 97) % 26 + 97);
                charList.add(c);
            } else if (c == ' ') {
                charList.add(' ');
            } else {
                charList.add(c);
            }
        }

        StringBuilder decrypted = new StringBuilder();
        for (char c: charList
        ) {
            decrypted.append(c);
        }
        return decrypted.toString();
    }
}
