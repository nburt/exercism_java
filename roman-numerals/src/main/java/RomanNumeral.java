import java.util.TreeMap;

public class RomanNumeral {

    private static final TreeMap<Integer, String> romanNumeralLookup = new TreeMap<>();

    static {
        romanNumeralLookup.put(1000, "M");
        romanNumeralLookup.put(900, "CM");
        romanNumeralLookup.put(500, "D");
        romanNumeralLookup.put(400, "CD");
        romanNumeralLookup.put(100, "C");
        romanNumeralLookup.put(90, "XC");
        romanNumeralLookup.put(50, "L");
        romanNumeralLookup.put(40, "XL");
        romanNumeralLookup.put(10, "X");
        romanNumeralLookup.put(9, "IX");
        romanNumeralLookup.put(5, "V");
        romanNumeralLookup.put(4, "IV");
        romanNumeralLookup.put(1, "I");
    }

    private final Integer number;

    public RomanNumeral(Integer inputNumber) {
        number = inputNumber;
    }

    public String getRomanNumeral() {
        if (number == 0) {
            return "";
        } else {
            return getRomanNumeral(number);
        }
    }

    public String getRomanNumeral(int num) {
        int key = romanNumeralLookup.floorKey(num);
        if (num == key) {
            return romanNumeralLookup.get(num);
        }
        return romanNumeralLookup.get(key) + getRomanNumeral(num - key);
    }
}
