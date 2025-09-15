package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Hello World Java 8 Streams";
        String reversed = reverseWords(sentence);
        System.out.println(reversed);  // Output: olleH dlroW avaJ 8 smaertS
    }

    public static String reverseWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}