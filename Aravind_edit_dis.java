package Algorithms;

public class Aravind_edit_dis {


        static int min(int a , int b, int c){
            if(a<=b && a<=c)
                return a;
            else if(b<=a && b<=c)
                return b;
            else
                return c;
        }
        static int editdistance(String s1,String s2,int n, int m){
            int arr[][]=new int[n+1][m+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=m;j++){
                    if (i==0)
                        arr[i][j]=j;
                    else if (j==0)
                        arr[i][j]=i;
                    else if(s1.charAt(i-1) == s2.charAt(j-1))
                        arr[i][j]=arr[i-1][j-1];
                    else
                        arr[i][j]=1+min(arr[i][j-1],arr[i-1][j],arr[i-1][j-1]);
                }
            }
            return arr[n][m];
        }
        public static void main(String[] args) {
            String st1="satwik";
            String st2="sathvi";
            System.out.println(editdistance(st1,st2,st1.length(),st2.length()));
        }
    }
