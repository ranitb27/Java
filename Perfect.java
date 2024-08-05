import java.util.*;

public class Perfect {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        factor(n);

    }
    public static void factor(int n){
        int sum =0;
        if(n>1){
            for(int i = 1; i<n ; i++){
                if(n%i == 0){
                    sum = sum + i;
                }
            }System.out.println(sum);
        }
        else {
            System.out.println("Invalid");
        }
    }
}

