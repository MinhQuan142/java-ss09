package org.example;

import java.util.ArrayList;
import java.util.*;

public class bt03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays
                .asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 11, 13, 14, 15, 16);
        System.out.println("mảng số nguyên\n" + list);
        int result = list
                .stream()
                .reduce(0, (a,b) -> a + b, Integer::sum);
        System.out.println("tổng các số nguyên trong mảng:  " + result);
//    int sum = 0;
//    for (Integer i : list) {
//        sum += i;
//    }
//        System.out.println("Tổng các phần tử trong mảng là: " + sum);

    }
}
