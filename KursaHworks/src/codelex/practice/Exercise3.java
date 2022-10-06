package codelex.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {

    public static void cat(File file) {
        //     TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
