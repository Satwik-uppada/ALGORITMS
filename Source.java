/*
Recursion
Description
Write a Java program to calculate the sum of n consecutive natural numbers using recursion.
For example: if input = 3, then the sum = 3 + 2 + 1 = 6, so output = 6

Sample input
3
Sample Output
6

Sample input
1
Sample Output
1
 */
package Algorithms;

import java.util.Scanner;

public class Source {
    public static int sum(int n){
        if(n!=0){
            return n+sum(n-1);
        }
        else
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int value = Source.sum(n);
            System.out.print(value);
        } else {
            System.out.println("Enter a natural number");
        }
    }
}

