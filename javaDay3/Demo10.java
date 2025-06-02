import java.util.Scanner;
public class Demo10{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       int n=5;
       
         for(int i=1;i<2*n;i++){
             int tc=(i>n)?2*n-i:i ;
             int ts=(i>n)?i-n:n-i;
             for (int j=0;j<tc;j++){
              System.out.print("*");
              }
              for(int k=0;k<ts;k++){
                System.out.print(" ");
              }
               for(int k=0;k<ts;k++){
                System.out.print(" ");
              }
               for (int j=0;j<tc;j++){
              System.out.print("*");
              }
                
            System.out.println();
            
        }
        
    }
}