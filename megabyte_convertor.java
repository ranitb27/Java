import java.util.*;

public class megabyte_convertor {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        mb(n);
    }
    public static void mb(int n){
        if (n<=0){
            System.out.println("Invalid!!");
        }
        else {
            int mb = (n/1024);
            int kilo = n%1024;
            System.out.println(n+" KB = "+mb+" MB and "+kilo+" KB");
            double single = mb + (kilo/1024.0);
            System.out.println(single+" mb");
        }
    }
}
