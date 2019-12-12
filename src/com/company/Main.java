package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] integers = new Integer[1_000_000];
        Random r = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(100);
        }
        long stop;
        long start = System.nanoTime();
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(integers));
        stop = System.nanoTime();
        System.out.println(stop - start);
        start = System.nanoTime();
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integers));
        stop = System.nanoTime();
        System.out.println(stop - start);

    }
       /*LocalDateTime a = LocalDateTime.now();
        ArrayList<Cat> catsArray = new ArrayList<>();
        LinkedList<Cat> catsLinked = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            catsArray.add(new Cat("Lali", 2));
            catsLinked.add(new Cat("Marrow", 4));
            long start = System.currentTimeMillis();
            System.out.println(start);
            for (int j = 0; j < 100; j++) {
                catsArray.add(1, new Cat("add cat1", 5));
                catsArray.add(0, new Cat("First Cat1", 1));
                catsArray.add(new Cat("Last Cat1", 8));
            }
        }long finish1=System.currentTimeMillis();
         System.out.println(finish1);
        for (int j = 0; j < 100; j++) {
            catsLinked.add(1, new Cat("add Cat2", 7));
            catsLinked.addFirst(new Cat("First Cat2", 3));
            catsLinked.addLast(new Cat("Last Cat2", 8));
        }
        long finish = System.currentTimeMillis();
    }
}

        */

//Это задание Б
    public static void main(String[] args) {
        ArrayList<Animal>animals=new ArrayList<>();
        for(int i=0;i<101;i++){
            if(i<51)
                animals.add(new Cat("cat",i));
            animals.add(new Dog("dog",i));
        }
        System.out.println(animals);
        int counter=0;
        for(Animal a: animals){
            if(a instanceof Cat){
                counter+=1;
                if(counter==5){
                    animals.remove(a);
                    counter=0;
                }
            }
        }
        counter=0;
        for(Animal a:animals){
            if(a instanceof  Dog){
                counter +=1;
                if(counter==3){
                    animals.add(animals.indexOf(a)+1,new Mouse("mouce",2));
                }
            }
        }
    }
}
