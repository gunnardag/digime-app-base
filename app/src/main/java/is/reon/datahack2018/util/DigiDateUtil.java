package is.reon.datahack2018.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gunnar on 19.7.2018.
 */

public class DigiDateUtil {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    /**
     * Formats a long to a readable Date
     * @param l Long of milliseconds system time millis.
     * @return Date string with the format 'yyyy-MM-dd'
     * example: 1988-03-18
     */
    public static String getDateStringFromLong(long l){
        Date d = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT); //Or whatever format fits best your needs.
        return sdf.format(d);
    }

    /**
     * Formats a long to a prettier readable Date
     * @param l Long of milliseconds system time millis.
     * @return Date string with the format 'd MMM yyyy'
     * example: 18 march 1988
     */
    public static String getReadableDateStringFromLong(long l){
        Date d = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy"); //Or whatever format fits best your needs.
        return sdf.format(d);
    }

    public static long getLongFromDateString(String dateString) throws ParseException {
        Date d = getDateFromString(dateString);
        return d.getTime();
    }

    public static String getShortDayOfYearStringFromLong(long l) {
        Date d = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");
        return sdf.format(d);
    }

    public static Date getDateFromString(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.parse(dateString);
    }

    public static Date getDateFromLong(long l) {
        return new Date(l);
    }

}