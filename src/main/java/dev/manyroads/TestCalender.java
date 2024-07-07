package dev.manyroads;

import java.util.Calendar;

public class TestCalender {

    static int month = Calendar.APRIL;

    public static void main(String[] args) {
        System.out.println(month);
        int conception = (month + 9) % 12;
        System.out.println(conception);

    }

}
