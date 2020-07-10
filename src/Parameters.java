import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.HashMap;

class Parameters {

    private int key;
    private String data;
    private String mode;
    private String in;
    private String out;
    private String alg;

    Parameters(String[] args) {

        HashMap<String, String> parametrers = new HashMap<>();

        for (int i = 0; i < args.length - 1; i++) {
            parametrers.put(args[i], args[i + 1]);
            i++;
        }
        try {
            this.key = Integer.parseInt(parametrers.getOrDefault("-key", "0"));
            this.data = parametrers.getOrDefault("-data", parametrers.getOrDefault("-in", ""));
            this.mode = parametrers.getOrDefault("-mode", "enc");
            this.in = parametrers.get("-in");
            this.out = parametrers.get("-out");
            this.alg = parametrers.getOrDefault("-alg", "shift");


            if (parametrers.keySet().contains("-in") && !parametrers.keySet().contains("-data")) {
                data = readFileAsString(parametrers.get("-in"));
            }
            /*parametrers.entrySet().forEach(entry->{
                System.out.println(entry.getKey() + " " + entry.getValue());
            });*/
        } catch (IOException | NumberFormatException | NullPointerException e) {
            System.out.println("Error");
        }
    }

    int getKey() {
        return key;
    }

    String getData() {
        return data;
    }

    String getMode() {
        return mode;
    }

    String getIn() {
        return in;
    }

    String getOut() {
        return out;
    }

    String getAlg() {
        return alg;
    }

    private static String readFileAsString (String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}