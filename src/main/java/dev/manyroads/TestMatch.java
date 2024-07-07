package dev.manyroads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatch {

    // Extracts numbers from string
    static void haalCifersEruit(String lijntje) {

        Matcher tokentje = Pattern.compile(("\\d.")).matcher(lijntje);
        //Matcher tokentje = Pattern.compile(("\\d+")).matcher(lijntje);

        while (tokentje.find()) {
            String s = tokentje.group(0);
            //int n = Integer.parseInt(s);
            System.out.println("n: " + s);
            //System.out.println("n: " + n);
        }
    }

    public static void main(String[] args) {

        haalCifersEruit("23whjshrej344d");
    }
}
