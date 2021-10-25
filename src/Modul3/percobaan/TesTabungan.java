package Modul3.percobaan;

public class TesTabungan {
    public static void main(String[] args) {
        Tabungan t = new Tabungan(15000);
        System.out.println("Saldo awal tabungan anda : " + t.saldo);
        t.ambilUang(10000);

        System.out.println("Jumlah uang yang diambil : 10000");
        System.out.println("Saldo tabungan anda sekarang adalah : " + t.saldo);
    }
}
