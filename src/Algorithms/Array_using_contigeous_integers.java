package Algorithms;

import java.util.*;

public class Array_using_contigeous_integers {
    public static boolean are_elements_contigeous(ArrayList<Integer> arr ,int n){
        HashSet<Integer> s=new HashSet<Integer>();

        for(int i =0;i<n;i++)
        {
            s.add(arr.get(i));
        }
        int set_size=s.size();
        int max = Collections.max(arr);
        int min=Collections.min(arr);
        int result=max-min+1;
        if(result!=set_size)
            return false;

        return true;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Arrays.asList(12,13,14,15,16,17);
        int n=arr.size();
        if(are_elements_contigeous(arr,n))

            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
