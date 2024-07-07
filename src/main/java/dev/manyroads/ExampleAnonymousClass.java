package dev.manyroads;

public class ExampleAnonymousClass {

    public static void main(String... args) {
        ExampleAnonymousClass myApp = new ExampleAnonymousClass();
        myApp.sayHello();
    }

    // *** Methods ***
    public void sayHello() {

        HelloWorld englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    // Interfaces
    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }

    // Local Classes
    class EnglishGreeting implements HelloWorld {
        String name = "world";

        public void greet() {
            greetSomeone("world");
        }

        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hello " + name);
        }
    }

    // Anonymous classes
    HelloWorld frenchGreeting = new HelloWorld() {
        String name = "tout le monde";

        public void greet() {
            greetSomeone("tout le monde");
        }

        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Salut " + name);
        }
    };
    HelloWorld spanishGreeting = new HelloWorld() {
        String name = "mundo";

        public void greet() {
            greetSomeone("mundo");
        }

        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hola, " + name);
        }
    };
}
