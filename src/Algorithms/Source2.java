/*
An integer value is given to you as an input, and you need to print the pattern for the number of rows given as input. For example:



Sample Input:

5

Sample Output:

*

**

***

****

*****



Sample Input:

3

Sample Output:

*

**

***

 */
package Algorithms;

import java.util.Scanner;

public class Source2 {
    // function to print the required pattern
    public static String func(int n) {

        if(n<=0)
            return "";

        String res;
        res = func(n-1);
        res += "*";
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }
}
