import java.util.Map;
import java.util.HashMap;

public class WordCount {
    public Map phrase(String phrase) {
        Map<String, Integer> wordCounts = new HashMap<>();

        String normalizedPhrase = normalizePhrase(phrase);
        String[] words = normalizedPhrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (wordCounts.containsKey(words[i])) {
                wordCounts.put(words[i], wordCounts.get(words[i]) + 1);
            } else {
                wordCounts.put(words[i], 1);
            }
        }
        return wordCounts;
    }

    private String normalizePhrase(String phrase) {
        return phrase.toLowerCase().replaceAll("\\p{Punct}+", "").replaceAll("  ", " ");
    }
}
