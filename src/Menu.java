import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("0. Thoát chương trình");
            System.out.println("1. In ra choice: ");
            System.out.println("2. Tính diện tích hình chữ nhật");
            System.out.println("3. Exit");

            System.out.println("Xin mời lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println(choice);
                    break;
                case 2:
                    System.out.println("Nhập chiều dài hình chữ nhật: ");
                    int height = scanner.nextInt();
                    System.out.println("Nhập chiều rộng hình chữ nhật: ");
                    int width = scanner.nextInt();
                    System.out.println("Diện tích hình chữ nhật là: " + height * width);
                    break;
                case 3:
                    System.out.println("Kết thúc");
                    System.exit(3);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }
        }
        while (choice != 0);
    }
}
