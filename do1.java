import java.util.*;

public class do1 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        do {
            if (odd(n) == true){
                System.out.println("Number : "+n+" is Odd");
            }else {
                System.out.println("Number : "+n+" is Even");
            }n=n+1;
        }while (n>=5 && n<=10);
    }
    public static boolean odd(int n){
        if(n%2!=0){
            return true;
        }
        else {
            return false;
        }
    }
}
