import java.util.*;

public class Dog_Barking {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        boolean b = sc.hasNextBoolean();
        boolean result = dog(b, time);
        if (!result){
            System.out.println("We should wake up");
        }
        else {
            System.out.println("We showuld continue with or work!!");
        }

    }
    public static boolean dog(boolean b, int time){
        if (time>=1 && time <= 23){
            if ((b) && (time<8 || time>22)){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
