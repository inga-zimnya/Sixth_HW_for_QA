import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Date> dates = new LinkedList<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();

        d1.setYear(2023);
        d1.setMonth(Calendar.MARCH);
        d1.setDate(1);

        d2.setYear(2024);
        d2.setMonth(Calendar.SEPTEMBER);
        d2.setDate(2);

        d3.setYear(2020);
        d3.setMonth(Calendar.APRIL);
        d3.setDate(6);

        dates.add(d1);
        dates.add(d2);
        dates.add(d3);

        Instant now = Instant.now();
        System.out.println(now);

        String str = now.toString();
        int indY = str.indexOf('-');

        String year = str.substring(0, indY);
        String afterYear = str.substring(indY + 1);

        indY = afterYear.indexOf('-');
        String month = afterYear.substring(0, indY);
        String afterMonth = afterYear.substring(indY + 1);

        indY = afterMonth.indexOf('T');
        String day = afterMonth.substring(0, indY);
        String afterDay = afterMonth.substring(indY + 1);

        indY = afterDay.indexOf(':');
        String hours = afterDay.substring(0, indY);
        String afterHours = afterDay.substring(indY + 1);

        indY = afterHours.indexOf(':');
        String minutes = afterHours.substring(0, indY);
        String afterMinutes = afterHours.substring(indY + 1);

        indY = afterMinutes.indexOf('.');
        String seconds = afterMinutes.substring(0, indY);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}