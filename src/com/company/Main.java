package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();

        people.add("Ivanov Peter");
        System.out.println(people.size());
        System.out.println(people.get(0));

        ArrayList<String> names = new ArrayList<>();
        names.add("Kukushkin");
        names.add("AssKukushkin");
        names.add("Kukushkin");
        names.add("Zaitsev");
        names.add("Holubiev");
        names.add("Voliev");
        names.add("PopovVoliev");
        names.add("Popov - Voliev");
        names.add("Popov-Voliev");
        names.add(" Hoo-hoho");
        names.add("Popov ");
        System.out.println(names.size());






        for (int in = 0; in < names.size(); in ++ ) {
            //System.out.println(in);

            people.add(names.get(in));


        }


        /*Comparator<String> alphabetic = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
        people.sort(alphabetic);*/

        System.out.println(people);
        System.out.println("before " + people.size());

        for (int i= 0; i < people.size(); i ++) {
           if (people.get(i).contains(" ") && people.get(i).indexOf(" ")!= 0) {
               String split = people.get(i);
               String[] splitFinal = split.split(" ");

               people.set(i, splitFinal[0] );
           } else if (people.get(i).contains(" ") && people.get(i).indexOf(" ")== 0){
               String split = people.get(i);
               String[] splitFinal = split.split(" ");

               people.set(i, splitFinal[1] );
           }



        }


        Comparator<String> alphabetic = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
        people.sort(alphabetic);

        System.out.println(people);
        System.out.println("After " + people.size());

    }
}
