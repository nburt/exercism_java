public class Acronym {

    public static String generate(String phrase) {
        StringBuilder acronym = new StringBuilder();

        for(int i = 0; i < phrase.length(); i++) {
            char character = phrase.charAt(i);
            if (Character.isUpperCase(character)) {
                acronym.append(character);
                if (phrase.charAt(i + 1) == ':') break;
            } else if (phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-') {
                acronym.append(Character.toUpperCase(character));
            }
        }

        return acronym.toString();
    }
}
