package dev.manyroads.recursion;

public class TestRecursion {

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("result: " + result);
    }

    public static int sum(int k) {
        if (k > 0) {
            System.out.println("k: " + k);

            // 10 + ( 9 + ( 8 + sum(7) ) ) etc
            int total = k + sum(k - 1);
            System.out.println("total: " + total + " k: " + k   );
            return total;
        } else {
            System.out.println("Returning 0");
            return 0;
        }
    }
}
