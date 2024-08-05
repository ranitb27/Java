import java.util.*;

public class Even_or_odd {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String a = (num%2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(a);
    }
}
