package io.codelex.test14oct.ex4;

import java.io.*;

public class Reader {
    private static final String PATH_TO_SHARED = "src/main/java/io/codelex/test14oct/";
    private static final String PATH_TO_NEW = "ex4/";


    public static void main(String[] args) throws IOException {
        String readSpecific = "fileHolder/";
        StringBuilder readName = new StringBuilder("Readable");

        String fullRead = PATH_TO_SHARED + readSpecific + readName;
        String fullWrite = PATH_TO_SHARED + PATH_TO_NEW + readName.reverse();

        BufferedReader in = new BufferedReader(new FileReader(fullRead));
        BufferedWriter out = new BufferedWriter(new FileWriter(fullWrite));

        String line;
        while ((line = in.readLine()) != null) {
            StringBuilder reverse = new StringBuilder(line).reverse();
            out.write(reverse.toString());
            out.newLine();
        }

        in.close();
        out.close();

    }
}
