import java.util.*;

public class Voting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        String results = age<=18 ? "Cannot Vote" : "Can Vote";
        System.out.println(results);
    }
}
