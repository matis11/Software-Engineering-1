package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int n = 16;

    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>();
        Integer i = 1;
        while (sequence.size() < n) {
            final String s = i.toString();
            if (!s.contains("3") && !s.contains("5") && (i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i);
                sequence.add(i);
            }
            i++;
        }
    }
}
