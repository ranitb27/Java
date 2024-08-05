import java.util.*;

public class Pythagorean_Triplet {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( ( Math.sqrt( ( (Math.pow(a,2)) + (Math.pow(b,2)) ) ) ) == c ){
            System.out.println("They are Pythagorean Triplet!!");
        }
        else {
            System.out.println("Not PT!!");
        }
    }
}

