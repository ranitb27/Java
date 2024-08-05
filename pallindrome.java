import java.util.*;

public class pallindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        is_pallindrome(num);
    }
    public static void is_pallindrome(int num){
        int rev = 0, temp;
        temp = num;//323
        while ( temp > 0){ //0
            rev = rev*10+(temp%10);// 3  30+2 320+3 323
            temp = temp/10; // 32 3 0
        }
        if (num == rev){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }

    }
}
