
import java.util.Scanner;

public class btvn {
    private static boolean number(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int y(int x) {
        for (int i = x - 1; i >= 2; i--) {
            if (number(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập một số nguyên x: ");
        int x = a.nextInt();

        int b = y(x);

        if (b != -1) {
            System.out.println("Số nguyên tố nhỏ hơn và gần x nhất là: " + b);
        } else {
            System.out.println("Không tìm thấy số nguyên tố nhỏ hơn và gần x nhất.");
        }
    }
}
