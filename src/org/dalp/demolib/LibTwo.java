package org.dalp.demolib;

public class LibTwo {
    public String methodTwoOne() {
        return new Throwable().getStackTrace()[0].getMethodName();
    }

    public static void methodTwoTwo() {
        System.out.println(
            (new Throwable().getStackTrace()[0].getClassName())
            + "." + (new Throwable().getStackTrace()[0].getMethodName())
        );
    }
}
