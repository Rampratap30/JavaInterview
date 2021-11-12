package com.Java8;

import java.util.ArrayList;

public class AllZeroShiftFirst {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(0);
        integers.add(44);
        integers.add(0);
        integers.add(1);
        integers.add(555);

        integers.forEach(System.out::print);
        System.out.println("");
        integers.sort(Integer ::compareTo);
        //System.out.println("sorts ::");
        integers.forEach(System.out::print);

    }
}
