import java.util.Scanner;
public class Demo9{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       int n=5;
       
         for(int i=1;i<=n;i++){
              for(int k=0;k<=n-i;k++){
                System.out.print(" ");
              }
             for (int j=1;j<=2*i-1;j++){
              if(j==1 || j==2*i-1 ||i==5){
                    System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
              
                
            }
            
            
           
            
            System.out.println();
        }
    }
}