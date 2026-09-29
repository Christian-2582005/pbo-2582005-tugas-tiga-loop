import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.print("while    :");
        int iWhile = 1;
        while (iWhile <= n) {
            System.out.print(" " + iWhile);
            iWhile++;
        }
        System.out.println();

        System.out.print("do-while :");
        int iDoWhile = 1;
        do {
            System.out.print(" " + iDoWhile);
            iDoWhile++;
        } while (iDoWhile <= n);
        System.out.println();

        // Off-by-one: dua penghitung, batas i < n lawan i <= n
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        scanner.close();
    }
}