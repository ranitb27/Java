public class bags {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));   // Should return false
        System.out.println(canPack(1, 0, 5));   // Should return true
        System.out.println(canPack(0, 5, 4));   // Should return true
        System.out.println(canPack(2, 2, 11));  // Should return true
        System.out.println(canPack(-3, 2, 12)); // Should return false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (goal > ((bigCount * 5) + smallCount)) {
            return false;
        }
        if ((goal % 5) <= smallCount) {
            return true;
        }
        return false;
    }
}
