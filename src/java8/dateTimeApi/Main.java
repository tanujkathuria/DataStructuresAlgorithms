package java8.dateTimeApi;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        // represents current date
        LocalDate localDate= LocalDate.now();
        // represents local time
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate);
        System.out.println(localTime);

        //to get day month year
        int day = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yy = localDate.getYear();
        System.out.println(day);
        System.out.println(mm);
        System.out.println(yy);
        System.out.printf("%d-%d-%d",day,mm,yy);
        int hh= localTime.getHour();
        int min= localTime.getMinute();
        int sec= localTime.getSecond();
        int nano= localTime.getNano();
        System.out.print(" ");
        System.out.printf("%d:%d:%d:%d",hh,min,sec,nano);
        System.out.println();
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime.now());

        LocalDateTime localDateTime1 = LocalDateTime.of(2020,10,04,12,00,00);
        System.out.println(localDateTime1);

        // to print date after 6 months
        System.out.println(localDateTime1.plusMonths(6));
        // to print date  6 months before
        System.out.println(localDateTime1.minusMonths(6));

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId zoneLA = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneLA);
        System.out.println(zonedDateTime);




    }

}
