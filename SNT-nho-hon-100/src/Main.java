//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int j = 2; j <= 100 ; j++) {
            if (checkPrime(j)){
                System.out.println("Prime number: " + j);
            }
        }

    }
    public static boolean checkPrime(int n) {
        if (n < 2) return false; // Các số nhỏ hơn 2 không phải là số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) { // Chỉ kiểm tra đến sqrt(n)
            if (n % i == 0) { // Nếu chia hết thì không phải số nguyên tố
                return false;
            }
        }
        return true; // Không tìm thấy số nào chia hết thì là số nguyên tố
    }
    
}