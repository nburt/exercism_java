import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Scrabble {
    private String letters = "";
    private static final Map<Character, Integer> LETTER_SCORES = initLetterScores();

    public Scrabble(String inputLetters) {
        letters = inputLetters;
        initLetterScores();
    }

    private static Map initLetterScores() {
        Map<Character, Integer> letterScores = new HashMap<>();
        letterScores.put('a', 1);
        letterScores.put('e', 1);
        letterScores.put('i', 1);
        letterScores.put('o', 1);
        letterScores.put('u', 1);
        letterScores.put('l', 1);
        letterScores.put('n', 1);
        letterScores.put('r', 1);
        letterScores.put('s', 1);
        letterScores.put('t', 1);

        letterScores.put('d', 2);
        letterScores.put('g', 2);

        letterScores.put('b', 3);
        letterScores.put('c', 3);
        letterScores.put('m', 3);
        letterScores.put('p', 3);

        letterScores.put('f', 4);
        letterScores.put('h', 4);
        letterScores.put('v', 4);
        letterScores.put('w', 4);
        letterScores.put('y', 4);

        letterScores.put('k', 5);

        letterScores.put('j', 8);
        letterScores.put('x', 8);

        letterScores.put('q', 10);
        letterScores.put('z', 10);

        return Collections.unmodifiableMap(letterScores);
    }

    public int getScore() {
        if(letters == null || letters.replaceAll("\\s", "").isEmpty()) {
            return 0;
        } else {
            int score = 0;

            for(int i = 0; i < letters.length(); i++) {
                score += LETTER_SCORES.get(Character.toLowerCase(letters.charAt(i)));
            }

            return score;
        }
    }
    
}
