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
            c = (char)(c + key);
            charList.add(c);
        }
        StringBuilder encrypted = new StringBuilder();
        for (char c: charList
        ) {
            encrypted.append(c);
        }
        return encrypted.toString() + "ebebebebebe"/*.toLowerCase()*/;
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
        return decrypted.toString() + "ebebebebebe";
    }
}
