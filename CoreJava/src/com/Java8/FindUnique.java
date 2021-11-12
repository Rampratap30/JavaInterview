package com.Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUnique {
    public static void main(String[] args) {

        //Find duplicate String in Java 8
        Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
        List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
        //Let's verify distinct elements
        System.out.println(distinctElements);

        //Find duplicate number.
        int num[]={1,4,3,2,6,7,4,2,1,2,8,6,7};
        for(int i=0; i<num.length; i++){
            boolean isDistinct = true;
            for(int j=0; j<i; j++){
                if(num[i] == num[j]){
                    isDistinct =false;
                    break;
                }
            }
            if(isDistinct){
                System.out.print(num[i]+" ");
            }
        }
        System.out.println(" ");

        //Find duplicate character and also count in Java 8
        String aa = "ProtijayiGini";
        String[] strArray = aa.split("");
        Map<String , Long> map =  Arrays.stream(strArray).collect(Collectors.groupingBy(c -> c , Collectors.counting()));
        map.forEach( (k, v) -> System.out.println(k + " - Count :: "+ v +" times"));
    }
}
