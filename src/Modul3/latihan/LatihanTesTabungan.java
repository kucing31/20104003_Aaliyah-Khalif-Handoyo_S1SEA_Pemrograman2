package Modul3.latihan;

import Modul3.percobaan.Tabungan;
public class LatihanTesTabungan {
    public static void main(String[] args) {
        boolean status;
        Tabungan tabungan = new Tabungan(25000);
        System.out.println("Tabungan awal : " + tabungan.getSaldo());
        tabungan.simpanUang(25000);
        System.out.println("Jumlah uang yang tersimpan\t : 25000");
        status = tabungan.ambilUang(5000);
        System.out.print("Jumlah uang yang diambil\t : 5000");
        if (status){
            System.out.println(" Ok");
        } else {
            System.out.println(" Gagal");
        }
        tabungan.simpanUang(10000);
        System.out.println("Jumlah uang yang tersimpan\t : 10000");
        status = tabungan.ambilUang(2000);
        System.out.print("Jumlah uang yang diambil\t : 2000");
        if (status) {
            System.out.println(" Ok");
        } else {
            System.out.println(" Gagal");
        }
        status = tabungan.ambilUang(5000);
        System.out.print("Jumlah yang diambil\t\t\t : 5000");
        if (status){
            System.out.println(" OK");
        } else {
            System.out.println(" Gagal");
        }
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang tersimpan\t : 3000");
        System.out.println("Saldo sekarang tersisa\t\t = " + tabungan.getSaldo());
    }
}
