package edu.hw2.task4;

public final class Info {
    private Info() {
    }

    public static CallingInfo callingInfo(Throwable exeption) {
        StackTraceElement[] stack = exeption.getStackTrace();
        return new CallingInfo(stack[0].getClassName(), stack[0].getMethodName());
    }
}
