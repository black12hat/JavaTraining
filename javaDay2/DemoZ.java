public class DemoZ{
    public static void main(String[] args){
        for(int row=0;row<=4;row++){
            for(int col=0;col<=4;col++){
                if(row==0 || row==4 || row+col==4){
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