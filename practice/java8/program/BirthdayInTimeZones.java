package practice.java8.program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class BirthdayInTimeZones {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        LocalDateTime birtheday = LocalDateTime.of(1992,02,04,7,30);
      //  ZonedDateTime zonedDateTime = birtheday.atZone(zoneId);

        Set<String> allZones = ZoneId.getAvailableZoneIds();

        for (String zone : allZones){
            ZoneId zoneId1 = ZoneId.of(zone);
            ZonedDateTime zonedDateTime  = birtheday.atZone(zoneId1);
            System.out.println(zonedDateTime);
        }


    }
}
