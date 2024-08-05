import java.util.*;

public class Weight_convertor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        System.out.println("Weigth in milli-gram: "+kgtomg(weight)+"mg");
        System.out.println("Weigth in Kilo-gram: "+kgtog(weight)+"g");
    }
    public static double kgtomg(double weight){
        double mg = weight * 100;
        return mg;
    }
    public static double kgtog(double weight){
        double g = weight * 1000;
        return g;
    }
}
