import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int n_min = sc.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int n_max = sc.nextInt();
        int sum = 0;
        for (int i = n_min; i <= n_max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng: " + sum);
    }
}
