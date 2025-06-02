public class SetIthBit{
    public static void main(String[] args){
        int n=8;
        int pos=2;
        int mask=1<<pos;
        n=n|mask;
        System.out.print(n);
    }
}