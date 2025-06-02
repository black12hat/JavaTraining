public class DemoJ{
    public static void main(String[] args){
        for(int r=0;r<=6;r++){
            for(int c=0;c<=4;c++){
                if(r==0 || c==2 || (r==6 && c<=2) || (c==0 && r==5)){
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