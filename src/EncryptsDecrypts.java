import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class EncryptsDecrypts {

    private EncryptDecrypt encryptDecryptMethod;
    private Parameters parameters;

    EncryptsDecrypts(EncryptDecrypt encryptDecryptMethod, Parameters parameters) {
        this.encryptDecryptMethod = encryptDecryptMethod;
        this.parameters = parameters;
    }
    // TODO remove redundancy in file managing code
    void encryptData(){

        if (parameters.getMode().equals("enc")) {
            String output = this.encryptDecryptMethod.encrypt(parameters.getData(), parameters.getKey());

            if (this.parameters.getOut() != null) {
                try {
                    File file = new File(parameters.getOut());
                    FileWriter fw = new FileWriter(file);
                    fw.write(output);
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            } else {
                System.out.println(output);
            }
        }
        if (parameters.getMode().equals("dec")) {
            String output = this.encryptDecryptMethod.decrypt(parameters.getData(), parameters.getKey());
            if (this.parameters.getOut() != null) {
                try {
                    File file = new File(parameters.getOut());
                    FileWriter fw = new FileWriter(file);
                    fw.write(output);
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            } else {
                System.out.println(output);
            }
        }

    }

}
