package Modul5.latihan;

import Modul5.latihan.perbankan.nasabah;
import Modul5.latihan.perbankan.tabungan;

public class TesLatihan {
    public static void main(String[] args) {
        int ss;
        boolean status;
        nasabah nasabah = new nasabah("Sugeng", "Darwanto");

        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());

        nasabah.setTabungan(new tabungan(10000));
        ss = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal : " + ss);

        nasabah.getTabungan().simpanUang(7000);
        System.out.println("Jumlah uang yang tersimpan : 7000");

        status = nasabah.getTabungan().ambilUang(15000);
        System.out.print("Jumlah uang yang diambil   : 15000");
        if (status) {
            System.out.println(" > berhasil");
        } else {
            System.out.println(" > gagal");
        }

        nasabah.getTabungan().simpanUang(8500);
        System.out.println("Jumlah uang yang tersimpan : 8500");

        status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil   : 4000");
        if (status) {
            System.out.println(" > berhasil");
        }
        else System.out.println(" > gagal");

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil   : 1600");
        if (status) {
            System.out.println(" > berhasil");
        }
        else {
            System.out.println(" > gagal");
        }

        nasabah.getTabungan().simpanUang(22000);
        System.out.println("Jumlah uang yang tersimpan : 2000");

        ss = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang : " + ss);
    }
}
