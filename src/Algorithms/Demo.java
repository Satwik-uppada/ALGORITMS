/*Recursion
What is the output of the following program?

class Demo {
    void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }

    public static void main(String[] args) {
        String st = "abc d efg";
        Demo obj = new Demo();
        obj.function(st);
    }
}

 */
package Algorithms;
 class Demo {

        void function(String st) {
            if ((st == null) || (st.length() <= 1))
                System.out.println(st);
            else {
                System.out.print(st.charAt(st.length() - 1));
                function(st.substring(0, st.length() - 1));
            }
        }

        public static void main(String[] args) {
            String st = "abc d efg";
            Demo obj = new Demo();
            obj.function(st);
        }
    }

