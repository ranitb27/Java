import java.util.*;

public class table {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        /*int i=0;
        do{
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }while(i<=100);
        for(int i =0; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }*/
        int i=0;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }
    }
}
