import java.util.*;

public class Challenge_Method {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double marks = sc.nextDouble();
        char gradecal = grade(marks);

        display(name,gradecal);

    }
    public static char grade(double marks){
        char g;
        if(marks>=90 && marks<100){
            g='A';
        }
        else if(marks >= 80 && marks < 90){
            g='B';
        }
        else if (marks >= 70 && marks < 80){
            g='C';
        } else if (marks >= 60 && marks < 70) {
            g='D';
        } else if (marks >= 50 && marks < 60) {
            g='E';
        }
        else {
            g='F';
        }
        return g;
    }
    public static void display(String name, char gradecal){
        System.out.println("Student name: "+name+" Grade : "+gradecal);

    }
}
