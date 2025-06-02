import java.util.Scanner;
public class Demo7{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       int n=5;
        for(int i=n;i>=1;i--){


        //    for printing space       
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
             for (int j=1;j<2*i;j++){
                System.out.print("*");
                
            }
            
           
            
            System.out.println();
        }
    }
}