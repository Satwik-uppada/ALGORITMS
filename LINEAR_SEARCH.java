package Algorithms;

import java.util.Scanner;

public class LINEAR_SEARCH {

    public static int linearsearch(int[] arr, int x, int n)
    {
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println("Enter the size of array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter any number to check weather it is present in this array list or not= ");
        int x = scan.nextInt();

        int index = linearsearch(arr, x ,n);

        if (index == -1)
            System.out.println("Element is not found");
        else
            System.out.println("Element found at index "+index);
    }
}
