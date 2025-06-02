public class DemoC{
    public static void main(String[] args){
        for(int row=0;row<=6;row++){
            for(int col=0;col<=4;col++){
                if(row==0|| col==0 || row==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println( );
        }
    }
}