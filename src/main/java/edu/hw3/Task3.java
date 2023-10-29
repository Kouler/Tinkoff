package edu.hw3;

import java.util.HashMap;
import java.util.List;

public class Task3 {
    private Task3() {
    }

    public static <E> HashMap<E, Integer> freqDict(List<E> list) {
        HashMap<E, Integer> map = new HashMap<>();
        for (E e : list) {
            map.put(
                    e,
                    (map.containsKey(e) ? map.get(e) + 1 : 1)
            );
        }

        return map;
    }
}
