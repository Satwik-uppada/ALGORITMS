
/*
You are given the base and exponent values,
and you have to return the power of a given value.
The base and exponent values are passed to the
function named ‘powerfunc’ wherein you need to write the code.
You need to calculate the power of the base value and return the output.


Input: The input will be in the following format:

The first line should have the base value.
The second line should have the value of the exponent to which the exponent is to be raised.
Output: The output should be in the following format:

Power of the given value.



Sample Input:

2

3

Sample Output:

8


 */
package Algorithms;

import java.util.Scanner;

public class Source1 {
    // function to calculate base^exponent
    public static int powerfunc(int base, int power) {

        if(power !=0)
            return (base*powerfunc(base,power-1));
        /*
        Introduction to Power function in Java
        Power function in Java is of type java.lang.Math.pow() library.
        It is mainly used to return the value of the first argument raised to the power of the second argument.
         It works similar to the exponents that we use in our mathematics.

         Syntax:

double pow(double base, double exponent)
base − Any primitive data type.
exponent − Any primitive data type
Return: This method returns base exponent.


         */
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerfunc(a, b));
    }
}
