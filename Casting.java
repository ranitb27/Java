public class Casting {
    public static void main(String args []){
        int a = 212;
        byte b = 6;
        short c = 848;
        long l = (long) ((a+b+c)*1000);
        System.out.println(l);
        short sum = (short) ((a+b+c)*1000);
        System.out.println(sum);
    }
}
