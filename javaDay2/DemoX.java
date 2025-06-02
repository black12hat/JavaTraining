public class DemoX{
    public static void main(String[] args){
        for(int row=0;row<=6;row++){
            for(int col=0;col<=6;col++){
                if(row==col || col+row==6){
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