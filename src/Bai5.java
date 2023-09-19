public class Bai5 {
    public static void main(String[] args) {
        int n = 1;
        while (true){
            if(CheckNum(n)){
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static boolean CheckNum(int num) {
        if (num % 5 == 0 && num % 7 == 0 && num % 11 == 0) {
            return true;
        }
        return false;
    }

}
