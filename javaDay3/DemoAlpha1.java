public class DemoAlpha1{
    public static void main(String[] args){
        int n=5;
        char a='E';
        char temp=a;
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                
                 System.out.print(temp++ + " ");
            }
            a--;
            temp=a;
            System.out.println();
        }
    }
}