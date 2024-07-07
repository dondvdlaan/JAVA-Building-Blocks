package dev.manyroads.functionalInterfaces;

import java.util.function.Supplier;

public class FunctionalInterfaces {

    // This function returns an incrementing version nr
    Supplier<String> vSupplier = new Supplier<String>() {
        private int id = 0;

        @Override
        public String get() {
            return "V: " + id++;
        }
    };

    // This function returns a random value.
    Supplier<Double> randomValue = () -> Math.random();

    public static void main(String[] args) {

        FunctionalInterfaces interfaces = new FunctionalInterfaces();
        // Print the random value using get()
        System.out.println("Value is: " + interfaces.randomValue.get());

        for (int i = 0; i < 10; i++) {
            System.out.println("vSupplier: " + interfaces.vSupplier.get());
        }
    }

}
