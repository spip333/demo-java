package org.nstern.demos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringFormatDemo {

    public static void main(String[] args) {
        // %s : String
        String s1 = "Bonjour, je m'appelle %s. \n";
        String p1 = "Nicolas";
        System.out.format(s1, p1);

        // %d : integer
        String s2 = "Mon âge : %d ans.\n";
        int p2 = 57;
        System.out.format(s2, p2);

        // %t : date/time
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String s3 = "Ma date de naissance : %s. \n";
        LocalDate p3 = LocalDate.of(1965, 8, 12);
        String p3f = dtf3.format(p3);
        System.out.format(s3, p3f);

        // %t : date/time
        String s4 = "Ma date de naissance : %td.%tm.%ty \n ";
        LocalDate p4 = LocalDate.of(1965, 8, 12);
        System.out.format(s4, p4, p4, p4);
    }
}
