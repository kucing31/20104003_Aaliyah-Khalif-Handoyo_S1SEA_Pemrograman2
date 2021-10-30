package Modul4.percobaan;

public class Tabungan {
    private String nama;
    private int NoRekening;
    private int saldo;
    private int pin;

    Tabungan(String nama, int NoRekening){
        this.nama = nama;
        this.NoRekening = NoRekening;
    }

    Tabungan(String nama, int NoRekening, int saldo, int pin){
        this.nama = nama;
        this.NoRekening = NoRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getNama(){
        return nama;
    }

    public int getNoRekening(){
        return NoRekening;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void setPin(int pin){
        this.pin = pin;
    }
}
