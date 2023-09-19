public class Bai4 {
    public static void main(String[] args) {

        int count = 1;
        int i = 0;
        while (count <= 20) {
            if (CheckNumber(i)) {
                System.out.println("Số nguyên tố thứ "+ count + ": "+i);
                count++;
            }
            i++;
        }



    }
    public static boolean CheckNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
