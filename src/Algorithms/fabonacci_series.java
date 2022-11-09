package Algorithms;

public  class fabonacci_series {
    public static  int fabonacci(int count){
        if(count==0)
        {
            return 1;
        }
        if(count==1|| count==2){
            return fabonacci(count-1)+fabonacci(count-2);
        }
        return count;
    }

    public static void main(String[] args) {
        int  fn;
        int f0=0;
        int f1=1;
        fn=f0+f1;
        f0=f1;
        f1=fn;

    }

}