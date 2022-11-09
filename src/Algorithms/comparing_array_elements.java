package Algorithms;

import java.util.Scanner;

public class comparing_array_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= {1,7,22,23,24,25};
int key;
key=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

                if(arr[i]==key)
                {
                    System.out.print(arr[i] + " ");
                }

        }
    }
}
