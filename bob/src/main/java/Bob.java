public class Bob {

    public Bob() {}

    public String hey(String phrase) {
        if (phrase == null || phrase.isEmpty() || phrase.trim().isEmpty()) {
            return "Fine. Be that way!";
        } else if (phrase.toUpperCase().equals(phrase) && phrase.matches(".*[a-zA-Z].*")) {
            return "Whoa, chill out!";
        } else if (phrase.endsWith("?")) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

}
