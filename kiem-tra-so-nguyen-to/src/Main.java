import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so");
        int number = sc.nextInt();
        boolean check = true;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + " khong phai la so nguyen to");
        }else{
            System.out.println(number + " la so nguyen to");
        }

    }
}