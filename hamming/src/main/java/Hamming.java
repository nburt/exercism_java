public class Hamming {

    public static int compute(String strand1, String strand2) {
        if (strand1.length() != strand2.length()) {
            throw new IllegalArgumentException();
        }

        char[] strand1Chars = strand1.toCharArray();
        char[] strand2Chars = strand2.toCharArray();

        int hammingDistance = 0;

        for(int i = 0; i < strand1Chars.length; i++) {
            if (strand1Chars[i] != strand2Chars[i]) {
                hammingDistance += 1;
            }
        }

        return hammingDistance;
    }

}
