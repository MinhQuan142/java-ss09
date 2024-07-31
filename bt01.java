package org.example;
import java.util.*;

public class bt01 {
    public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
            int sumOfSc = numbers.stream()
                    .filter(x -> x % 2 == 0)
                    .mapToInt(x -> x).sum();

        System.out.println("Tổng các số chẵn là: " + sumOfSc);
       }
    }

