public class Practice {
    public static void main(String args[]){
        int a =45;
        byte b = 127;
        short s = 6002;
        long sum = (a+b+s)*1000;

        System.out.println(sum);
        short sum1 = (short) ((a+b+s)*1000);
        System.out.println(sum1);
    }
}
