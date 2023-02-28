package com.example.demo1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class TinhNgayChuNhat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println(day.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }
}

