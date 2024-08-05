import java.util.*;

public class All_Fctors {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n>1){
            for(int i = 1; i<=n ; i++){
                if(n%i == 0){
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}
