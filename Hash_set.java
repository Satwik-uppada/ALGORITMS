package Algorithms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hash_set {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(6);
        set.add(4);
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(2);
        set.add(1);

        System.out.println(set);
        //repeated elements are not repeated in hash set

        System.out.println("size of set is : " + set.size());
        //size of hash set it won't consider repeated elements twice
        int a ;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();

        if(set.contains(a)) {
            System.out.println("present");
        }

        if(!set.contains(a)) {
            System.out.println("absent");
        }


        set.remove(1);

        System.out.println(set);


        set.add(0);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();


        if(!set.isEmpty()) {
            System.out.println("set is not empty");
        }
        set.clear();
        if(set.isEmpty())
            System.out.println("set is empty");
    }
}

