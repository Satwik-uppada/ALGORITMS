package Algorithms;

public class shyam {

        public static int binarysearch(int[] arr, int first, int last, int key)
        {

            if(last>=first) {
                int mid = (first + last) / 2;
                if (arr[mid] == key) {
                    return mid;
                }
                if(arr[mid]>key){
                    return binarysearch(arr, first, mid - 1, key);}

                else{
                    return binarysearch(arr, mid + 1, last, key);
                }
            }
            return -1;

        }
        public static void main(String[] args){
            int arr[]={2,3,4,5,6,7,8,9};
            int key=7;
            int last= arr.length-1;

            int result=binarysearch(arr,0,last,key);
            if(result==-1){
                System.out.println("element  not found");
            }
            else{
                System.out.println("element found at;"+result);
            }
        }
    }

