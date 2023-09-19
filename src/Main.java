import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // sout - hiển thị với new line
        // souf - hiển thị format với chuỗi
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
//            System.err.println("Đây là lỗi"); // lưu ý khi sử dụng (bất đồng bộ)
//
//            // Hiển thị với màu sắc trong màn console (sử dụng icon: Window + .)
//            System.out.println("\u001B[31mRed textfdfd");
//            System.out.println("\u001B[32mGreen text");
//            System.out.println("\u001B[33mYellow text");
//            System.out.println("\u001B[34mBlue text");
//            System.out.println("\u001B[35mPurple text");
//            System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
//            System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️");


        // Biến và kiểu dữ liệu

        // Kiểu nguyên thuỷ
        // Cú pháp [kiểu dữ liệu] [tên biến] = [giá trị];
//        int number = 10;
//        float fl = 5.9f;
//        double db = 10.0;
//        char ch = 'a';
//        boolean check = true;

        // Nếu giá trị là chuỗi thì sử dụng %s, là số thì dùng %d
        // là số thực dùng %f, là các kiểu khác thì mặc định là %s
//        System.out.printf("Number = %-5d | fl = %-5.2f | db = %-5.2f | ch = %1s | check = %-10s \n", number, fl, db, ch, check);


        // Các ký tự đặc biệt: \n - xuống dòng; \t tab


        // Kiểu tham chiếu
//        String name = "Đỗ Đình Tâm"; // tương đương với char[] khi thay đổi giá trị của 1 chuỗi thì tạo ra 1 mảng kí tự mới
//        Date date = new Date();
//        System.out.println("Ngày tháng hiện tại là: " + date);
//        System.out.println("Họ và tên: " + name);
//        Scanner sc = new Scanner(System.in); // Đây là máy quét dùng để nhập dữ liệu
        // từ màn hình console
        // nhập chuỗi, số, số thực, boolean, byte, ...
//        System.out.println("Hãy nhập vào địa chỉ");
//        String address = sc.nextLine();
//        System.out.println("Địa chỉ: " + address);

        // Nhập số nguyên, thực, boolean
//        System.out.println("Hãy nhập vào 1 số");
//        int a = Integer.parseInt(sc.nextLine()); // ép kiểu
//        System.out.println("số bạn vừa nhập là: " + a);
        // Luw ý : Khi vừa nhập số xong mà chuyển qua nhập chuỗi thì sẽ b nuốt dòng
//        System.out.println("Hãy nhập vào 1 chuỗi");
//        String string = sc.nextLine();

        // Khai báo biến hằng
//        final float PI = 3.14F;


        // Toán tử
        //-- và ++ dùng để giảm hoặc tăng giá trị của biến 1 đơn vị
        // Tiền tố : ++a hoặc --a : biểu thức này sẽ trả về giá trị của biến sau khi tăng hoặc giảm
        int a = 10;
//        System.out.println(--a);
        // Hậu tố : a++ hoặc a-- :  biểu thức này sẽ trả về giá trị của biến trước khi tăng hoặc giảm
        System.out.println(++a);


        // Toán tử 3 ngôi
        // (biểu thức logic) ? (nếu đúng) : (nếu sai);
        // kiểm tra 1 số người dùng nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập vào 1 số");
        int number = sc.nextInt();
//        String rs = (number % 2 == 0) ? "số chẵn" : "số lẻ";
//        System.out.println(rs);

        // Câu lệnh điều kiện
        // chỉ có if
        if (false) {
            System.out.println("thực hiện if");
        }

        // if ... else
        // kiểm tra chẵn lẻ
        if (number % 2 == 0) {
            System.out.println("số chẵn");
        } else {
            System.out.println("số lẻ");
        }

        // Bậc thang
        // set điểm trung bình
        float dtb = 7.0f;
        if (dtb < 5.0) {
            //yếu
        } else if (dtb < 6.5) {
            //trung bình
        } else if (dtb < 7) {
            //khá
        } else if (dtb < 8) {
            //giỏi
        } else {
            //xuất sắc
        }

        // Lồng nhau
        // năm nhuận
        int year = 1900;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    // là năm nhuận
                    System.out.println("năm nhuận");
                } else {
                    // không là năm nhuận
                    System.out.println("năm k nhuận");
                }
            } else {
                //là năm nhuận
                System.out.println("năm nhuận");
            }
        } else {
            // không là năm nhuận
            System.out.println("năm không nhuận");
        }


        // switch ... case
        // hiển thị số dư khi chia cho 5
        int so = 1997;
        int mod = so % 5;
        switch (mod) {
            case 0:
                System.out.println("chia hết");
                break;
            case 1:
                System.out.println("dư 1");
                break;

            case 2:
                System.out.println("dư 2");
                break;
            case 3:
                System.out.println("dư 3");
                break;
            case 4:
                System.out.println("dư 4");
                break;
        }
    }
}