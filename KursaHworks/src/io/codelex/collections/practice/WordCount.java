package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/main/resources/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("Lines", 0);
        wordCount.put("Words", 0);
        wordCount.put("Chars", 0);

        for (String line : lines) {
            wordCount.put("Lines", wordCount.get("Lines") + 1);
            wordCount.put("Chars", wordCount.get("Chars") + line.length());
            for (int i = 0; i < line.length() - 1; i++) {
                char current = line.charAt(i);
                if (Character.isLetterOrDigit(current) && !Character.isLetterOrDigit(line.charAt(i + 1))) {
                    wordCount.put("Words", wordCount.get("Words") + 1);
                }
            }
        }

        System.out.println("Lines = " + wordCount.get("Lines"));
        System.out.println("Words = " + wordCount.get("Words"));
        System.out.println("Chars = " + wordCount.get("Chars"));

    }


}
