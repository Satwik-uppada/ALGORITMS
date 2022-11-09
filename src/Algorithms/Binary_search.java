package Algorithms;

public class Binary_search {
int binary(int arr[],int first,int last,int key){
    if(last>=first) {
        int mid = (first + last) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        if(arr[mid]>key){
            return binary(arr, first, mid-1, key);
        }
        if(arr[mid]<=key){
            return binary(arr,mid+1,last,key);
        }
    }
    return -1;
}
    public static void main(String[] args) {
     Binary_search binary_search=new Binary_search();

        int[] arr={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int key=0;
        int result = binary_search.binary(arr, 0, n - 1, key);
        if (result == -1){
            System.out.println("********************************");
            System.out.println("*");
            System.out.print("*");
            System.out.print("       Element not present   ");
            System.out.println("********************************");}
        else
            System.out.println("Element found at index "
                    + result);
        

    }
}
