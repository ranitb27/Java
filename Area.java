import java.util.*;

public class Area {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double hieght = sc.nextDouble();
        System.out.println(area(length));
        System.out.println(area(length, breadth));
        System.out.println(area(breadth, hieght));

    }
    public static double area(int length){
        double sq_Area = (double) Math.pow(length, 2);
        return sq_Area;
    }
    public static double area(int length, int breadth){
        double rect_area = (double) length * breadth;
        return rect_area;
    }
    public static double area(double breadth, double heigth){
        double tri_area = (double) breadth * heigth;
        return tri_area;
    }
}
