package Algorithms;

import java.util.Scanner;

public class Tower_of_hanoi {
    public static void Hanoi(int n ,String S,String H,String D){
        if(n==1){
            System.out.println("Transferred disk "+n+" from "+S+" to "+D);
            return ;
        }
        Hanoi(n-1,S,D,H);
        System.out.println("Transferred disk " +n +" from "+S+" to "+D);
        Hanoi(n-1,H,S,D);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n =sc.nextInt();

        Hanoi(n, "source", "helper", "destination");
    }
}
