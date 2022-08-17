/*
Recursion
What will be the output of the following program?

public class Demo {
    int i = 1;

    int function() {
        if (i <= 5) {
            System.out.print(i++ + " ");
            function();
        }
        return 0;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.function();
    }
}
 */


package Algorithms;

public class DEMO_UPGRAD_OUTPUT_CODES {
    int i = 1;

    void function() {
        if (i <= 5) {
            System.out.print(i++ + " ");
            function();
        }
    }

    public static void main(String[] args) {
        DEMO_UPGRAD_OUTPUT_CODES obj = new DEMO_UPGRAD_OUTPUT_CODES();
        obj.function();
    }
}
