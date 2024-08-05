import java.util.*;

public class CalculatorSumAvg {
    public static void main(String [] args){
        sumavg();
    }
    public static void sumavg(){
        int  sum = 0, count = 0, avg = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            boolean isint = sc.hasNextInt();
            if (isint){
                int value = sc.nextInt();
                sum += value;
                count ++;
            } else if (count == 0) {
                System.out.println("Sum = 0, Avg = 0");
                break;
            }
            else {
                avg = sum/count;
                System.out.println("Sum = "+sum+" Avg = "+avg);
                break;
            }
            sc.nextLine();
        }sc.close();
    }
}
