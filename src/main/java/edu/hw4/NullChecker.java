package edu.hw4;

public class NullChecker {
    private NullChecker() {
    }

    static Integer check(Object o1, Object o2) {
        if (o1 == null && o2 == null) {
            return 0;
        } else if (o1 == null) {
            return 1;
        } else if (o2 == null) {
            return -1;
        } else {
            return null;
        }
    }
}
