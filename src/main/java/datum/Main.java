package datum;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        System.out.println(instant1);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(zonedDateTime.getHour());
        System.out.println(zonedDateTime.plusMonths(3));
        System.out.println(zonedDateTime.toInstant());


        System.out.println(instant1.atZone(ZoneId.of("Europe/Berlin")));

        System.out.println(ChronoUnit.MILLIS.between(instant1, Instant.now()));

        System.out.println(ChronoUnit.YEARS.between(ZonedDateTime.now(), ZonedDateTime.parse("1985-10-16T10:15:04.647004+02:00[Europe/Berlin]")));
    }
}
