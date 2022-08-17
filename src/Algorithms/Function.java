/*Recursion
What will be the output of the following code when the input n = 20?

import java.util.Scanner;
public class Function {
   public static int func(int n) {
       if (n == 1)
           return n;
       else
           return func(n-1);
   }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a positive no: ");
       int n = sc.nextInt();
       int value = Function.func(n);
       System.out.println(value);
   }
}
Hint: Notice the recursive call and the terminating condition.


 */



package Algorithms;

import java.util.Scanner;

public class Function {
    public static int func(int n) {
        if (n == 1)
            return n;
        else
            return func(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive no: ");
        int n = sc.nextInt();
        int value = Function.func(n);
        System.out.println(value);
    }
}
