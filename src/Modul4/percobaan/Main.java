package Modul4.percobaan;

public class Main {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Aaliyah", 2030400802, 1520000, 14325);
        System.out.println("Nama            : " + saya.getNama());
        System.out.println("Nomor Rekening  : " + saya.getNoRekening());
        System.out.println("Saldo           : " + saya.getSaldo());
        System.out.println("PIN             : " + saya.getPin());
    }
}
