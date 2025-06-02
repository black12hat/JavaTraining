public class PowerOf2{
    public static void main(String[] args){
     int n=16;
     while(n>=0){
        n=n&n-1;
       
     }
     if(n==0){
            System.out.println("Yes it is"