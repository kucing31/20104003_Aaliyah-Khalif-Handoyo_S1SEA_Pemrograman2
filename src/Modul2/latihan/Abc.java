package Modul2.latihan;
import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;
        int[] a,b,c;

        System.out.print("Masukkan Jumlah Testcase\t: ");
        k = scan.nextInt();
        a = new int[k];
        b = new int[k];
        c = new int[k];

        for (int i = 0; i < k; i++) {
            System.out.print("Masukkan A " + (i + 1) + " : ");
            a[i] = scan.nextInt();
            System.out.print("Masukkan B " + (i + 1) + " : ");
            b[i] = scan.nextInt();
            System.out.print("Masukkan C " + (i + 1) + " : ");
            c[i] = scan.nextInt();
        }

        for (int i = 0; i < k; i++) {
            System.out.print(" A " + (i + 1) + " + B " + (i + 1) + " - C " + (i + 1) + " = " );
            System.out.println(a[i] + b[i] - c[i]);
        }
    }
}
