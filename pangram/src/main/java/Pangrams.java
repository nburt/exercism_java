import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pangrams {

    public static Boolean isPangram(String string) {
        Pattern pattern = Pattern.compile("([a-z])(?!.*\\1)");
        Matcher matcher = pattern.matcher(string.toLowerCase());
        int hits = 0;
        while (matcher.find()) {
            hits++;
        }
        return hits == 26;
    }
}
