import java.util.*;

public class sum_of_digits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        do{
            int digits = num%10;
            sum = sum + digits;
            num  = num/10;
        }while(num>0);
        System.out.println(sum);
    }
}
