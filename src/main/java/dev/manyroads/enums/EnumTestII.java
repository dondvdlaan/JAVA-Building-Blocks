package dev.manyroads.enums;

import java.text.MessageFormat;

public enum EnumTestII {
     PLUGIN_GET_STRUCTURE_ERROR(
            "A generic {0} plugin {1} error {2}"
   );

    String message;


    EnumTestII(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        return new MessageFormat(this.message).format(args);
    }

    public static void main(String[] args) {

        System.out.println(PLUGIN_GET_STRUCTURE_ERROR.getMessage(1,2,3));
    }
}
