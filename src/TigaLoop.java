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

        // Saring deret 1-10 (angka tetap, tidak ikut n)
        int sampaiPrintln = 0;
        System.out.print("Disaring :");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(" " + i);
            sampaiPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + sampaiPrintln + " kali");

        // Kenapa loop tidak berhenti di i = 8 padahal 8 > 7:
        // continue (lewati genap) ditulis SEBELUM break, jadi saat i = 8 continue
        // langsung lompat ke putaran berikutnya dan pengecekan i > 7 tidak pernah
        // sampai ke angka 8. Loop baru berhenti di i = 9 (ganjil, 9 > 7, lalu break).
        // Kalau break ditaruh di atas continue, loop akan berhenti tepat di i = 8.

        scanner.close();
    }
}

/* Hasil run n=5:
===== SATU DERET, TIGA LOOP =====
for      : 1 2 3 4 5
while    : 1 2 3 4 5
do-while : 1 2 3 4 5

i <  n berputar : 4 kali
i <= n berputar : 5 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali

Hasil run n = 0:
===== SATU DERET, TIGA LOOP =====
for      :
while    :
do-while : 1

i <  n berputar : 0 kali
i <= n berputar : 0 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali

Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
jadi badannya pasti jalan minimal sekali.
*/