import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong SNT can in ra:");
        int n = sc.nextInt();
        int count = 0;
        int N = 2;

        while (count < n) {
            if (checkPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean checkPrime(int a) {
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}