package Modul2.latihan;

import  java.util.Scanner;
public class AnakAyam {
    public static void main(String[] args) {
        int cik, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Anak Ayam\t: ");
        cik = scan.nextInt();
        for (i = cik; i > 1; i--) {
            System.out.print("Anak ayam turunlah " + cik);
            cik = i - 1;
            System.out.println(", Mati satu tinggalah " + cik);
        }
        System.out.println("Anak Ayam turun 1, mati satu tinggalah induknya");
    }
}
