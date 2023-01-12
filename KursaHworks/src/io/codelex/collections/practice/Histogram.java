package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/main/resources/collections/midtermscores.txt";
    private static final String[] VALUES = {"00-09", "10-09", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", "90-99", "  100",};
    private static final String STAR = "*";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        String[] scoreArr = scores.split(" ");
        int[] parseArr = new int[scoreArr.length];
        for (int i = 0; i < scoreArr.length; i++) {
            int current = Integer.parseInt(scoreArr[i]);
            parseArr[i] = current;
        }
        Map<String, Integer> histo = new HashMap<>();
        for (String value : VALUES) {
            histo.put(value, 0);
        }

        for (int parse : parseArr) {
            if (parse < 10) {
                histo.put(VALUES[0], histo.get(VALUES[0]) + 1);
            } else if (parse < 20) {
                histo.put(VALUES[1], histo.get(VALUES[1]) + 1);
            } else if (parse < 30) {
                histo.put(VALUES[2], histo.get(VALUES[2]) + 1);
            } else if (parse < 40) {
                histo.put(VALUES[3], histo.get(VALUES[3]) + 1);
            } else if (parse < 50) {
                histo.put(VALUES[4], histo.get(VALUES[4]) + 1);
            } else if (parse < 60) {
                histo.put(VALUES[5], histo.get(VALUES[5]) + 1);
            } else if (parse < 70) {
                histo.put(VALUES[6], histo.get(VALUES[6]) + 1);
            } else if (parse < 80) {
                histo.put(VALUES[7], histo.get(VALUES[7]) + 1);
            } else if (parse < 90) {
                histo.put(VALUES[8], histo.get(VALUES[8]) + 1);
            } else if (parse < 100) {
                histo.put(VALUES[9], histo.get(VALUES[9]) + 1);
            } else {
                histo.put(VALUES[10], histo.get(VALUES[10]) + 1);
            }
        }

        for (String value : VALUES) {
            System.out.println(value + ": " + STAR.repeat(histo.get(value)));
        }

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
