package com.java.advanced.timetypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PizzaWebshopApp {
    public static void main(String[] args) {
        LocalTime openingHours = LocalTime.of(11, 00);
        LocalTime closingHours = LocalTime.of(22, 00);

        System.out.println("The shop is opened from " + openingHours + " to closing hours " + closingHours + " on every day");

        LocalDate orderDate = LocalDate.now().minusDays(3);
        System.out.println("The pizza was ordered on " + orderDate);

        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("I submitted the order " + orderDateTime);

        LocalTime deliveryTime = LocalTime.of(1, 10);
        System.out.println("Delivery Time :" + deliveryTime);

        LocalDateTime estimatedDelivery = orderDateTime.plusHours(deliveryTime.getHour()).plusMinutes(deliveryTime.getMinute());
        System.out.println("The expected delivery time is " + estimatedDelivery);

        LocalDateTime realDeliveryDatetime = orderDateTime.plusMinutes(90);
        System.out.println("The real delivery time was " + realDeliveryDatetime);

        long differenceBetweenEstimatedAndReal = ChronoUnit.MINUTES.between(estimatedDelivery, realDeliveryDatetime);
        System.out.println("The difference " + differenceBetweenEstimatedAndReal + " in mins!");


        if (estimatedDelivery.isBefore(realDeliveryDatetime)) {
            System.out.println("The pizza didnt arrived on time");
        }else{
            System.out.println("The pizza arrived on time");
        }

        HijrahDate hijrahDate=HijrahDate.from(orderDate);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Based on Hijrah calender , I order my pizza on "+ dateTimeFormatter.format(hijrahDate));

        ZonedDateTime myLocalDateTime=orderDateTime.atZone(ZoneId.of("Europe/Budapest"));
        System.out.println("The time I ordered PIZZA was at my local time " + myLocalDateTime + " in Budapest");
        ZonedDateTime tokyoDateTime=myLocalDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("The time I ordered PIZZA was at tokyo time " + tokyoDateTime + " in Tokyo");

        for(String zoneId:ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }
    }
}
