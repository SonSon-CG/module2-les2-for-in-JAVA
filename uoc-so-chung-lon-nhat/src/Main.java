import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen a");
        int a = sc.nextInt();
        System.out.println("nhap so nguyen b");
        int b = sc.nextInt();
        if (a ==0 && b==0) {
            System.out.println(a + " va" + b + " khong co uoc UCLN");
        }else if (a==0) {
            System.out.println("UCLN cua" + a + "va" + b + "la " + Math.abs(b) );
        }else if (b==0) {
            System.out.println("UCLN cua" + a + "va" + b + "la " + Math.abs(a));
        }else{

        }

    }
}