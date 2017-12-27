package logback.demo.util;

import java.util.Calendar;
import java.util.TimeZone;

public class DateUtil {

    public static String dateFormart4ymdHMS() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", cal.getTime());
    }

}
