package com.softserve.edu14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
       // System.out.println(currentTime);
        LocalDate future = LocalDate.now().plusWeeks(3)
            .plus(3, ChronoUnit.CENTURIES);
      //  System.out.println(future);

        var zones = ZoneId.getAvailableZoneIds();
       // System.out.println(zones);
        var zone = ZoneId.of("Europe/Kiev");

        System.out.println(zone.getRules());
        System.out.println(zones.size());
    }
}
