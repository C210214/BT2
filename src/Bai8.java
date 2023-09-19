import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập a: ");
            int a = sc.nextInt();
            System.out.println("Nhập b: ");
            int b = sc.nextInt();
            System.out.println("Nhập c: ");
            int c = sc.nextInt();
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
                int p = (a + b + c)/2;
                System.out.println("Chu vi tam giác là: " + p*2);
                System.out.println("Diện tích tam giác là: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            } else {
                System.out.println( "không phải là 3 cạnh của 1 tam giác");
            }
        }

    }
}
