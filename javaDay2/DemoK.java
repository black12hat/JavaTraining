public class DemoK{
    public static void main(String[] args){
        for(int r=0;r<=6;r++){
            for(int c=0;c<=4;c++){
                if(c==0 || r+c==4 || r-c==2){
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