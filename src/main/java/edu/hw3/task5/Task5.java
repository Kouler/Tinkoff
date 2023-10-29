package edu.hw3.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    private Task5() {
    }

    public static List<String> parseContacts(List<String> contacts, String direction) {
        List<String> empty = new ArrayList<>();
        if (contacts == null) {
            return empty;
        }

        List<SortingPrinciple> sortingArray = new ArrayList<>();

        for (int i = 0; i < contacts.size(); i++) {
            String[] element = contacts.get(i).split(" ");
            String s;
            switch (element.length) {
                case 1:
                    s = element[0];
                    break;
                case 2:
                    s = element[1];
                    break;
                default:
                    return empty;
            }
            sortingArray.add(new SortingPrinciple(s, i));
        }

        switch (direction) {
            case "ASC":
                Collections.sort(sortingArray, new SortByASC());
                break;
            case "DESC":
                Collections.sort(sortingArray, new SortByDESC());
                break;
            default:
                return empty;
        }

        List<String> sortedContacts = new ArrayList<>();
        for (SortingPrinciple ele : sortingArray) {
            sortedContacts.add(contacts.get(ele.position()));
        }

        return sortedContacts;
    }
}
