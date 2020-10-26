package com.mycomp.tdd.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {

    Map<String, Integer> storage = new HashMap<>();

    public RomanNumeralConverter() {
        storage.put("I", 1);
        storage.put("V", 5);
        storage.put("X", 10);
        storage.put("L", 50);
        storage.put("C", 100);
        storage.put("D", 500);
        storage.put("M", 1000);
    }

    public int convert(String input) {
        int result = valueOf(input);
        if (result == -1) {
            result = 0;
            String[] parts = splitInput(input);
            for (int i = 0; i <= parts.length - 1; ) {
                int first = getFirst(parts[i]);
                int second = getSecond(parts, i);
                if (second > first) {
                    result += second - first;
                } else {
                    int third = getThird(parts, i);
                    if (third != 0 && third > second) {
                        result += (third - second) + first;
                        i++;
                    } else {
                        result += first + second;
                    }
                }
                i = i + 2;
            }
        }
        return result;
    }

    private int getThird(String[] parts, int i) {
        return i >= parts.length - 2 ? 0 : valueOf(parts[i + 2]);
    }

    private int getSecond(String[] parts, int i) {
        return i >= parts.length - 1 ? 0 : valueOf(parts[i + 1]);
    }

    private int getFirst(String part) {
        return valueOf(part);
    }

    private String[] splitInput(String input) {
        return input.split("");
    }

    private int valueOf(String part) {
        return storage.getOrDefault(part, -1);
    }
}
