package Algorithms;

import java.util.Scanner;

public class Even_numbers_sum {
    public static int evenSum1(int n) {
        if(n <= 1)
            return 0;

        else if (n % 2 == 0)
            return (n + evenSum1(n - 1));
        else
            return evenSum1(n - 1);

    }
    private static int evenSum2(int n){
        return (n/2)*(1 + n/2);
    }

    public static void main(String[] args) {
        System.out.println("enter n value:");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int result1=evenSum1(num);
        int result2=evenSum2(num);
        System.out.println("Algorithm1:"+result1);
        System.out.println("Algorithm2:"+result2);
    }
}

