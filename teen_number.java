import java.util.*;

public class teen_number {
    public static boolean teen(int a, int b, int c){
        if (a >= 13 && a<=19){
            return false;
        }
        if (b >= 13 && b<=19){
            return false;
        }
        if (c >= 13 && c<=19){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        boolean res = teen(a, b, c);
        if (res == false){
            System.out.println("It is a Teen number!");
        }
        else {
            System.out.println("Not a Teen Number");
        }
    }
}
