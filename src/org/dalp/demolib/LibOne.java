package org.dalp.demolib;

public class LibOne {
    public String methodOne() {
        return new Throwable().getStackTrace()[0].getMethodName();
    }

    public static void methodTwo() {
        System.out.println(
            (new Throwable().getStackTrace()[0].getClassName())
            + "." + (new Throwable().getStackTrace()[0].getMethodName())
        );
    }
}
