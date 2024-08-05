public class sum_even {
    public static boolean even(int n){
        if(n<=0){
            return false;
        }
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static int sumeven(int start, int end){
        if(start>end){
            return -1;
        }
        if (start<0){
            return -1;
        }
        int sum=0;
        for (int i = start; i<=end; i++){
            if (even(i)){
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String [] args){
        int start = 1;
        int end = 10;
        int sum11 = sumeven(start, end);
        System.out.println(sum11);
    }
}
