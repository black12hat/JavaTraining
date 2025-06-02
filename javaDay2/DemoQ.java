public class DemoQ{
    public static void main(String[] args){
        for(int row=0;row<6;row++){
            for(int col=0;col<6;col++){
                if( row!=5 && (col==0  || col==4) || (row>1 && row==col) || col!=5 && (row==0 || row==4) ){
                    System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}