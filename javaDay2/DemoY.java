public class DemoY{
    public static void main(String[] args){
        for(int row=0;row<=6;row++){
            for(int col=0;col<=6;col++){
                if((row<=3 && row==col) || (row>3 && col==3) || ( row<=3 && row+col==6)){
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