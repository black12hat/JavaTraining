//  * * * * * 
//   * * * *
//    * * *
//     * *
//      *
//     * * 
//    * * *
//   * * * *
//  * * * * *

import java.util.Scanner;
public class demo8{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       int n=5;
        for(int i=0;i<n;i++){
              for(int k=0;k<=i;k++){
                System.out.print(" ");
              }
             for (int j=0;j<n-i;j++){
                System.out.print("* ");
                
            }

            
        
            
            System.out.println();
        }
         for(int i=2;i<=n;i++){
              for(int k=0;k<=n-i;k++){
                System.out.print(" ");
              }
             for (int j=0;j<i;j++){
                System.out.print("* ");
                
            }
            
            
           
            
            System.out.println();
        }
    }
}