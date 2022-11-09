package Algorithms;

import java.util.Scanner;

public class Binary_search_user_input {

    static int count=1;
    int binary( int[] arr, int first, int last, int ele){

        if(last>=first) {

            int mid = (first + last) / 2;
            System.out.println("--------------------------------------------------------");
            System.out.println("ITERATION NO: " +count++);
            System.out.println("Mid value index : "+mid+" and  Mid value: "+arr[mid]);
            System.out.println("last value index: "+last+" and Last value: "+arr[last]);
            System.out.println("first value index: "+first+" and First value: "+arr[first]);

            if (arr[mid] == ele)//=ele
            {

                return mid;
            }

            if(arr[mid] >=ele)//>ele
            {

                return binary(arr, first, mid-1, ele);
            }

            if(arr[mid]<=ele)//<ele
            {

                return binary(arr,mid+1,last,ele);
            }

        }


        return -1;//no element found it returns -1

    }
    public static void main(String[] args) {

        Binary_search_user_input binary1 = new Binary_search_user_input();

        int n;
        int ele;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        int j;
        for (j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("Enter key element :");
        ele = sc.nextInt();

        int index = binary1.binary(arr, 0, n - 1, ele);

        if (index== -1) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Element not present");
        } else {
            System.out.println("--------------------------------------------------------");
            System.out.println("Element found at index " +index);
        }
    }
}
