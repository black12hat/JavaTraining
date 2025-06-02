public class DemoW{
    public static void main(String[] args){
        for(int row=0;row<=3;row++){
            for(int col=0;col<=6;col++){
                if(col==0 || col==6 || row+col==3 || col-row==3){
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