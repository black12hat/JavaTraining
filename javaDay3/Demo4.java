import java.util.Scanner;
public class Demo4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

        //    for printing space       
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
             for (int j=1;j<=i;j++){
                System.out.print("*");
            }
           
            
            System.out.println();
        }


    }
}