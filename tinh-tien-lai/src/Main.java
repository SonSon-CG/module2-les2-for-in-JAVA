import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tien cho vay");
        int amount = sc.nextInt();
        System.out.println("Nhap ti le lai suat theo thang");
        double rate = sc.nextDouble();
        System.out.println("Nhap so thang cho vay");
        int month = sc.nextInt();

        int profit = (int) (amount * ((rate/100)/12) * month);
        System.out.println(" so tien lai trong " + month + " thang la: " + profit);

    }
}