public class DemoAlpha2{
    public static void main(String[] args){
        int n=5;
        char a='a';
       
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((a-'a')%2!=0 ){
                     System.out.print((char) (a -32) + " ");
                     a++;
                }
                else{
                     System.out.print((char) (a)+ " ");
                     a++;
                }
                 
            }
          
           
            System.out.println();
        }
    }
}