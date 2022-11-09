package Algorithms;

import java.util.Scanner;

public class sum_of_1_10_natural_no_using_recursion {
    public static int  sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n= sc.nextInt();
        int result=sum(n);
        System.out.println(result);
    }
}
