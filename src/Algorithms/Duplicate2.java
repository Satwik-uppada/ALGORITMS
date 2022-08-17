package Algorithms;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Duplicate2 {
    public void findDuplicates(int[] id) {
        System.out.println("Duplicate data : ");
        int count[] = new int[10000];
        for (int j : id) {
            count[j]++;
            if (count[j] == 2)
                System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of student ids in given database: ");
        int n = sc.nextInt();
        int[] id = getInput(n);
        System.out.println("Input array is : ");
        printId(id);
        Duplicate2 duplicates = new Duplicate2();
        duplicates.findDuplicates(id);
    }

    public static int[] getInput(int n) {
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = randomNumber(1, n);
        }
        return input;
    }

    public static int randomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static void printId(int[] id) {
        for (int j : id) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
