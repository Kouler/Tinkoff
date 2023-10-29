package edu.hw3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private Task2() {
    }

    static List<String> clusterize(String string) {
        List<String> arrayList = new ArrayList<String>();
        StringBuilder s = new StringBuilder();
        int braceCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            s.append(string.charAt(i));

            if (string.charAt(i) == '(') {
                braceCounter++;
            } else if (string.charAt(i) == ')') {
                braceCounter--;
            } else {
                return null;
            }

            if (braceCounter < 0) {
                return null;
            } else if (braceCounter == 0) {
                arrayList.add(s.toString());
                s.setLength(0);
            }
        }

        if (braceCounter != 0) {
            return null;
        } else {
            return arrayList;
        }
    }
}
