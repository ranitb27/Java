import java.util.*;

public class Positive {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        String res = num < 0 ? " Negetive!! ":"Positive";
        String check = (num == 0) ? "Zero!!": res;
        System.out.println(check);

    }
}
