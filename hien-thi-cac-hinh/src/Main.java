import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Ban muon ve hinh gi:");
        System.out.println("1: Ve HCN");
        System.out.println("2: Ve tam giac vuong 1");
        System.out.println("3: Ve tam giac vuong 2");
        System.out.println("4: Exit");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 1; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
            case 2:

            case 3:
            case 4:
        }



    }
}