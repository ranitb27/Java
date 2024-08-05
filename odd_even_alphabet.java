import java.util.*;



public class odd_even_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i=i+1) {
            if (i % 2 == 0) {
                char c = a.charAt(i);
                System.out.print(c);
            }
        }
        System.out.print("\t");
        for (int i = 0; i < a.length(); i=i+1) {
            if (i % 2 != 0) {
                char c = a.charAt(i);
                System.out.print(c);
            }
        }

    }
}
