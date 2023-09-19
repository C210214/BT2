import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("0. Thoát chương trình");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật ");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tam tròn");
            System.out.println("4. Thoát");

            System.out.println("Xin mời lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài hình chữ nhật: ");
                    int height = scanner.nextInt();
                    System.out.println("Nhập chiều rộng hình chữ nhật: ");
                    int width = scanner.nextInt();
                    System.out.println("Chu vi hình chữ nhật là: " + (height + width) * 2);
                    System.out.println("Diện tích hình chữ nhật là: " + height * width);
                    break;
                case 2:
                    System.out.println("Nhập chiều dài cạnh a: ");
                    int a = scanner.nextInt();
                    System.out.println("Nhập chiều dài cạnh b: ");
                    int b = scanner.nextInt();
                    System.out.println("Nhập chiều dài cạnh c: ");
                    int c = scanner.nextInt();
                    int p = (a + b + c) / 2;
                    System.out.println("Chu vi hình tam giác là: " + (a + b + c));
                    System.out.println("Diện tích hình tam giác là: " + (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
                    break;
                case 3:
                    System.out.println("Nhập bán kính hình tròn: ");
                    int r = scanner.nextInt();

                    System.out.println("Chu vi hình tròn là: " + 2 * 3.14 * r);
                    System.out.println("Diện tích hình tròn là: " + 2 * 3.14 * r * r);
                    break;
                case 4:
                    System.out.println("Kết thúc");
                    System.exit(4);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }
        }
        while (choice != 0);
    }
}
