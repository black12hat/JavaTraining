public class ClearIthBit{
    public static void main(String[] args){
        int n=5;
        int pos=0;
        int mask=~(1<<pos);
        n=n&mask;
        System.out.println(n);
    }
} 


