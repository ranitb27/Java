import java.util.*;

public class Alloperations {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x+" + "+y+" = "+add(x,y));
        System.out.println(x+" - "+y+" = "+substract(x,y));
        System.out.println(x+" / "+y+" = "+divide(x,y));
        System.out.println(x+" % "+y+" = "+mod(x,y));
        System.out.println(x+" * "+y+" = "+multipy(x,y));
    }

    static  int add(int x,int y){
        int sum = x+y;
        return sum;
    }

    static int substract(int x, int y){
        int sub = x-y;
        return sub;
    }

    static int divide(int x, int y){
        int div = x/y;
        return div;
    }

    static int mod(int x, int y){
        int mod = x%y;
        return mod;
    }

    static int multipy(int x, int y){
        int mul = x * y;
        return mul;
    }
}
