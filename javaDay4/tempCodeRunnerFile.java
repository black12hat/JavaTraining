public class Pattern5{
    public static void main(String[] args){
         int n=5;
        for(int i=n;i>=1;i--){
             for(int k=1;k<n-i;k++){
                System.out.print(" ");
             }
           for(int j=0;j<=i;j++){
            System.out.print(i);
            }
           
            System.out.println();