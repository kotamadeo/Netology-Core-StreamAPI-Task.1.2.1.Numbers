package com.gmail.at.kotamadeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        System.out.println(array);
        List<Integer> result = new ArrayList<>();
        for (Integer integer : array) {
            if (integer > 0 && integer % 2 == 0) {
                result.add(integer);
            }
        }
        System.out.println(result);
        Collections.sort(result);
        System.out.println(result);
    }
}