import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime birthday;
    private static final int SECONDS_PER_GIGASECOND = 1_000_000_000;

    public Gigasecond(LocalDate inputBirthday) {
        birthday = inputBirthday.atStartOfDay();
    }

    public Gigasecond(LocalDateTime inputBirthday) {
        birthday = inputBirthday;
    }

    public LocalDateTime getDate() {
        return birthday.plusSeconds(SECONDS_PER_GIGASECOND);
    }

}
