import java.util.*;

public class product_checker {
    public static boolean product(int a, int b, int c){
        if ( (a*b) == c){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean res = product(a, b, c);
        System.out.println(res);
    }
}
