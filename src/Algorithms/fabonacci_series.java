package Algorithms;

public  class fabonacci_series {
    public  int fabonacci(int count){
        if(count==0)
        {
            return 1;
        }
        if(count==1|| count==2){
            return fabonacci(count-1)+fabonacci(count-2);
        }
        return count;
    }
//UPDATW

}