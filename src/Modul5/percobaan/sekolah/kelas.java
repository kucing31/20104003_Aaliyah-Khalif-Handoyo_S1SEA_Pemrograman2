package Modul5.percobaan.sekolah;

import Modul5.percobaan.mahasiswa;

public class kelas {

    private int kodekelas;
    private String namakelas;
    private mahasiswa mahasiswa;

    public kelas(int kode, String nama){
        this.kodekelas = kode;
        this. namakelas = nama;
    }

    public void setmhs(mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
