import java.util.Random;

public class Robot {

    private String name;

    public Robot() {
        generateName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        generateName();
    }

    private void generateName() {
        name = randomCapitalLetter() + randomCapitalLetter() + randomNumber() + randomNumber() + randomNumber();
    }

    private String randomCapitalLetter() {
        Random random = new Random();
        return Character.toString((char)(random.nextInt(26) + 'a')).toUpperCase();
    }

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

}