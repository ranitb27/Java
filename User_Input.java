import java.util.Scanner;

public class User_Input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Age : "+age);
        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Name : "+name);
        System.out.println("****----****---****----****---****");
        System.out.println("Name : "+name+" Age : "+age);
    }
}
