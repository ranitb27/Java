import java.util.*;

public class Grading_System {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        if(marks<0 || marks>100){
            System.out.println("Invalid!!");
        }
        else if(marks<50){
            System.out.println("Grade F");
        }
        else if(marks<60){
            System.out.println("Grade E");
        }
        else if(marks < 70){
            System.out.println("Grade D");
        }
        else if(marks<80){
            System.out.println("Grade C");
        }
        else if(marks<90){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade A");
        }
        sc.close();
    }
}
