import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {



        EncryptDecrypt method;
        Parameters parameters = new Parameters(args);

        if (parameters.getAlg().equals("unicode")) {
            method = new EncryptDecryptUnicode();
        } else if (parameters.getAlg().equals("shift")){
            method = new EncryptDecryptShift();
        } else {
            method = new EncryptDecryptUnicode();
        }

        EncryptsDecrypts encryptsDecrypts = new EncryptsDecrypts(method,parameters);
        encryptsDecrypts.encryptData();


    }
}
