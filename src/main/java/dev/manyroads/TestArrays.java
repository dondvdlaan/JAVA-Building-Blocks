package dev.manyroads;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestArrays {

    public static void main(String[] args) {

        System.out.println("List: " + PUBLIC_VALUES);
        for(String s : copyArray()){
            System.out.println("S: " + s);
        }
        //arraySort();
    }

    /**
     * Array.sort() example
     */
    public static void arraySort() {

        int[] iArray = {3, 5, 1, 7, 8, -1};

        System.out.println("Unsorted Array");
        for (int i : iArray) {
            System.out.println(i + " ");
        }

        Arrays.sort(iArray);

        System.out.println("\nSorted Array");
        for (int i : iArray) {
            System.out.println(i);
        }
        System.out.println("Arrays[]: " + Arrays.toString(iArray));
    }

    /**
     * Copying array
     */
    private static final String[] VALUES = {"een", "twee", "drie"};

    // Convert in public List
    public static final List<String> PUBLIC_VALUES = Collections.unmodifiableList(Arrays.asList(VALUES));

    // Copy array
    public static String[] copyArray() {
        return VALUES.clone();
    }

}
