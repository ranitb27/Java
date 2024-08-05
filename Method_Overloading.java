import java.util.*;

public class Method_Overloading {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String subject = sc.next();
        String name = sc.next();
        char section = sc.next().charAt(0);
        int Roll = sc.nextInt();
        display(name, Roll, section, subject);
        display(name, Roll);
        display(Roll, section);


    }
    public static void display(String name, int Roll, char sec, String subject){
        System.out.println("Name : "+name+", Roll : "+Roll+", section : "+sec+", Subject : "+subject);
    }
    public static void display(String name, int Roll){
        System.out.println("Name : "+name+", Roll : "+Roll);
    }
    public static void display(int Roll, char sec){
        System.out.println("Roll : "+Roll+", Section : "+sec);
    }
}
