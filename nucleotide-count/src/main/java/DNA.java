import java.util.Map;
import java.util.HashMap;

public class DNA {

    String dna;
    String validDna = "ACGT";

    public DNA(String inputDna) {
        dna = inputDna;
    }

    public int count(Character nucleotide) {
        int count = 0;
        if (validDna.indexOf(nucleotide) < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == nucleotide) count += 1;
        }
        return count;
    }

    public Map nucleotideCounts() {
        Map<Character, Integer> counts = new HashMap<>();
        counts.put('A', count('A'));
        counts.put('C', count('C'));
        counts.put('G', count('G'));
        counts.put('T', count('T'));
        return counts;
    }

}
