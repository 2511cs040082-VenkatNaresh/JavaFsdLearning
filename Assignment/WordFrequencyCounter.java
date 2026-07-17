import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        sc.close();
    }
}