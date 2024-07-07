package dev.manyroads.strings;

import java.util.regex.Pattern;
/*
String with split() and Regex
 */
public class SplitString {

    static final String TEST_STRING = "Holoita-007-sdnsjnv";
    static final String TEST_STRING2 = "Holita.008";

    public static void main(String[] args) {

        // Split accepts REGEX and limit with x elements
        String[] sTemp = TEST_STRING.split("-", 2);
        // Split accepts REGEX
        //String[] sTemp = TEST_STRING.split("-");

        // Use escape char(\\) or [] or Pattern.quote
        String[] sTemp2 = TEST_STRING2.split(("[.]"));
        //String[] sTemp2 = TEST_STRING2.split(("\\."));
        //String[] sTemp2 = TEST_STRING2.split(Pattern.quote("."));

        for (String t : sTemp) {
            System.out.println("t: " + t);
        }
        for (String t : sTemp2) {
            System.out.println("t2: " + t);
        }
    }
}
