package com.gmail.at.kotamadeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        String result = array.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted()
                .map(x -> String.format("%d", x))
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
