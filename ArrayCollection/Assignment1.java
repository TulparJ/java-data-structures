package ch01.apps;

import ch01.dates.Date;

public class Assignment1 {
    public static void main(String[] args) {
        // 31-element array for dates Dec 1–31, 2005
        Date[] decDates = new Date[31];

        // Initialize array
        for (int i = 0; i < decDates.length; i++) {
            decDates[i] = new Date(12, i + 1, 2005); // month=12 (December), day=i+1, year=2005
        }

        // Print each date
        for (Date d : decDates) {
            System.out.println(d);
        }
    }

}
