import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Anagram {

    String word;

    public Anagram(String inputWord) {
        word = inputWord.toLowerCase();
    }

    public List<String> match(List potentialAnagrams) {
        List<String> matches = new ArrayList<>();

        for (int i = 0; i < potentialAnagrams.size(); i++) {
            String potentialAnagram = potentialAnagrams.get(i).toString().toLowerCase();

            char[] potentialAnagramChars = potentialAnagram.toCharArray();
            Arrays.sort(potentialAnagramChars);

            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);

            if (Arrays.equals(wordChars, potentialAnagramChars) && !potentialAnagram.equals(word)) {
                matches.add(potentialAnagrams.get(i).toString());
            }
        }
        return matches;
    }

}
