package Modul4.percobaan;

public class MainTabungan {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Aal", 14325);
        Tabungan anda = new Tabungan("Euphii",15687, 1756000, 34444);

        saya.setSaldo(50000);
        saya.setPin(765432);

        System.out.println("Saldo Awal Saya :  " + saya.getSaldo());
        System.out.println("Saldo Awal Kamu :  " + anda.getSaldo());
        System.out.println("Nomor Pin Saya  :  " + saya.getPin());
        System.out.println("Nomor Pin kamu  :  " + anda.getPin());
    }
}
