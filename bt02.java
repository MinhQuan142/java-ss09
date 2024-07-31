package org.example;

import java.util.*;

public class bt02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                asList(1,2,3,4,5,6,7,8,9,10,11,1,2,1,2,12,1,2,32,3,32,4,543,54,54,54354);
        int maxNumber = Collections.max(numbers);
        System.out.println("Phần tử lớn nhất danh sách là: " + maxNumber);
    }
}
