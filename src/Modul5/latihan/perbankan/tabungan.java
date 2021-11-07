package Modul5.latihan.perbankan;

public class tabungan {

    private int saldo;
    private int jumlah;

    public tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public boolean ambilUang(int jumlah){
        if (saldo - jumlah < 0){
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

    public int simpanUang(int jumlah){
        return saldo = saldo + jumlah;
    }
}
