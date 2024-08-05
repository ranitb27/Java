import java.util.*;

public class Method {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter distance and time: ");
        double distance = sc.nextDouble();
        double time = sc.nextDouble();
        display("Ranit", 2);
        int length = 45;
        int breadth = 56;
        System.out.println(perimeter(length, breadth));
        System.out.println(area(length, breadth));
        System.out.println(speed(distance, time));

    }
    public static void display(String s, int Roll){
        System.out.println("Name "+s);
        System.out.println("Roll "+Roll);
    }
    public static int perimeter(int length, int breadth){
        int perimeter = 2*(length+breadth) ;
        return perimeter;
    }
    public static int area(int length, int breadth){
        int area = length * breadth;
        return area;
    }
    public static double speed(double distance, double time){
        if(distance > 100){
            double speedofobject = distance*time;
            return  speedofobject;
        }
        else {
            return 0;
        }
    }
}
