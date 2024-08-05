public class And {
    public static void main(String args[]){
        int bodytemp = 98;
        if(bodytemp >= 97){
            System.out.println("You have fever");
        }
        int a=51, b=999;
        if ((a>=50) && (b<=1000)){
            System.out.println(a+b);
            if((a+b>1000) && (a+b<=2000)){
                System.out.println("All Good!!!");
            }
        }
    }
}
