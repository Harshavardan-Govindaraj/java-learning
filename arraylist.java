
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers =new ArrayList(
        Arrays.asList(3,5,6,8,78,90));
        System.out.println (numbers);
        System.out.println("Using iterator class to display arraylist");
        Iterator iterator= numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        numbers.add(5,"string");
        numbers.remove(6);
        System.out.println("After some changes");
        for (Object integer:numbers) {
            System.out.println(integer);
        }
        numbers.remove("string");//removed it because I am going to sort the arraylist
        Collections.sort(numbers);
        System.out.println ("Sorted arraylist"+numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println ("Reverse ordered arraylist"+numbers);

    }
}
