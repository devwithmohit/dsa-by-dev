
public class Recursion2 {

    public static int powerRecurion(int x, int y) {
        //  ✅ Power Function using Recursion
        if (y == 0) {
            return 1;
        }
        return x * powerRecurion(x, y - 1);

    }

    public static void main(String[] args) {
        int data = powerRecurion(2, 3);
        System.out.println(data);
    }
}
