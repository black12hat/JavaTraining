public class GetIthBit{
    public static void main(String[] args){
        int n=8;
        int pos=3;
        int mask=1<<pos;
        int bit =n&mask;
        System.out.print((bit==0)?0:1);

    }
}