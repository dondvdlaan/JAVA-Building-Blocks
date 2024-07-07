package dev.manyroads;

import java.text.MessageFormat;

public class Test3Dots {

    private final String message;

    public Test3Dots(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        for(Object o : args){

            System.out.println("args: " + o);
        }
        return new MessageFormat(this.message).format(args);
    }

    public static void main(String[] args) {
        Test3Dots test3Dots = new Test3Dots("You''re about to delete  rows.");
        String s = test3Dots.getMessage(1);
        System.out.println(s);

        int fileCount = 1273;
        String diskName = "MyDisk";
        Object[] testArgs = {(long) fileCount, diskName};

        MessageFormat form = new MessageFormat(
                "The disk \"{1}\" contains {0} file(s).");

        System.out.println(form.format(testArgs));
    }
}
