import org.joda.time.DateTime;

import java.util.List;
import java.util.Arrays;

public class Meetup {

    private int month;
    private int year;

    public Meetup(int inputMonth, int inputYear) {
        month = inputMonth;
        year = inputYear;
    }

    public DateTime day(int dayOfWeek, MeetupSchedule meetupScheduleValue) {
        DateTime date = new DateTime(year, month, 1, 0, 0);
        DateTime firstDayOfMonth = new DateTime(year, month, 1, 0, 0);
        int daysInMonth = firstDayOfMonth.dayOfMonth().getMaximumValue();

        for (int i = 0; i < daysInMonth; i++) {
            if (date.getDayOfWeek() == dayOfWeek) {
                if (meetupScheduleValue == MeetupSchedule.TEENTH) {
                    if (teenths().contains(date.getDayOfMonth())) {
                        break;
                    }
                } else if (meetupScheduleValue == MeetupSchedule.LAST) {
                    date = date.dayOfMonth().withMaximumValue().withDayOfWeek(dayOfWeek);
                    if (date.getMonthOfYear() != month) {
                        date = date.minusDays(7);
                    }
                    break;
                } else {
                    if (meetupScheduleValue == MeetupSchedule.FIRST) {
                        break;
                    } else if (meetupScheduleValue == MeetupSchedule.SECOND) {
                        date = date.plusDays(7);
                        break;
                    } else if (meetupScheduleValue == MeetupSchedule.THIRD) {
                        date = date.plusDays(14);
                        break;
                    } else if (meetupScheduleValue == MeetupSchedule.FOURTH) {
                        date = date.plusDays(21);
                        break;
                    }
                }
            }
            date = date.plusDays(1);
        }

        return date;
    }

    private List teenths() {
        return Arrays.asList(13, 14, 15, 16, 17, 18, 19);
    }

}
