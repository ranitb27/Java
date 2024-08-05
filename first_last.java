import java.util.*;

public class first_last {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 123
        int a = first_last_sum(num);
        System.out.println(a);
    }
    public static int first_last_sum(int num){
        if(num<0){
            return -1;
        }
        int first=0, last = num % 10; // 0  3
        num = num/10; //12
        while(num != 0){
            if (num / 10 == 0){
                first = num % 10; //1
            }num = num /10; // 1
        }


        return last+first; // 1+3
    }
}
