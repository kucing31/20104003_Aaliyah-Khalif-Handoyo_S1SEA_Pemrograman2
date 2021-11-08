# MODUL 5 : MENGELOLA CLASS

<hr>

## Dasar Teori

* Package

  Package yaitu merupakan sebuah metode enkapsulasi yang digunakan untuk melakukan pengelompokan class, sub package dan interfaces, package ini digunakan selain untuk mealkukan pengelompokan juga digunakan untuk mencegah konflik penamaan terhadap file file, layaknya dalam folder didalam sebuah directory.

  Contoh :
  ``` java
  package Mahasiswa;
  public class Mahasiswa{ }
  ```

  Kemudian untuk melakukan pemanggilan package dapat menggunakan import
  ``` java
  import package.name.Class;   // untuk memanggil 1 class
  import package.name.*;   // untuk memanggil seluruh paket
  ```
  
* Import class 
  
    import digunakan untuk melakukan pemanggilan sehingga dapat diakses biasanya digunakan untuk memanggil sebuah package beserta isinya dan juga dapat digunakan untuk memanggil interface.
    
   Contoh :
   ``` java
   import java.util.Scanner; // untuk mengimpor class Scanner
   import Mahasiswa.siswa; // untuk memanggil class tertentu yang berada didalam package Mahasiswa
   
   public class siswa{}
   ```
 
* This
  This merupakan sebuah kata kunci yang merujuk kepada sebuah object yang berada dalam constructor atau method yang sedang digunakan, this paling sering digunakan untuk umumnya membedakan antara atribut kelas dan parameter yang memiliki nama yang sama.
  
  This dituliskan seperti ini :
  ```java
  this.Nama         // merujuk kepada Nama
  this.MencariNIM() // merujuk kepada method atau fungsi MencariNIM
  this()            // merujuk kepada constructor
  ```
 
 <hr>

## Praktikum
Soal : 
1. Mengimplementasikan UML class diagram dalam program untuk package perbankan

Jawaban :
1. [Jawaban Soal](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul5/src/Modul5/latihan)

  Pertama tama membuat bernama package perbankan kemudian diisi dengan 2 class yaitu Nasabah dan Tabungan lalu satu class lagi untuk melakukan running program dan menjadi pemisah. Package yang dibuat dapat diketahui dengan urutan file ini :
  ```java
  package Modul5.latihan.perbankan;
  ```
  
  Lalu dalam Class nasabah dapat kita gunakan untuk menyimpan data dari nasabah tersebut, dan caranya yaitu dengan pendeklarasian variable - variable seperti ini :
  ```java
  private String namaAwal;
  private String namaAkhir;
  private tabungan tabungan;
  ```
  kemudian method dalam class nasabah dapat dibuat seperti ini:
  ```java
  public nasabah(String namaAwal, String namaAkhir){
    this.namaAwal = namaAwal;
    this.namaAkhir = namaAkhir;
  }
  ```
  
  pada method nasabah this.namaAwal itu merujuk kepada atribut namaAwal yang pada awal - awal telah dibuat begitupun juga namaAkhir, method tersebut akan memasukkan inputan pada method tersebut kedalam variabel namaAwal dan namaAkhir pada class nasabah. Lalu untuk setTabungan pun sama juga :
  ```java
  public void setTabungan(tabungan tabungan) {
            this.tabungan = tabungan;
  }
  ```
  
  Kemudian dalam Class tabungan dapat digunakan untuk menyimpan nominal uang yang dimasukkan ataupun diambil, class pertama tama akan melakukan pendeklarasian sebuah atribut yang bernama saldo kemudian atribut jumlah sebagai nominal yang telah diinputkan pengguna.
  ```java
  private int saldo;
  private int jumlah;
  ```
  Lalu untuk method dalam class tabungan 
  ```java
  public tabungan(int saldo){
        this.saldo = saldo;
  }
  
  public public int getSaldo(){
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
  ```
  
  ada 4 method yaitu tabungan, getSaldo, ambilUang, simpanUan :
  - pertama method tabungan digunakan untuk memasukkan inputan saldo dari pengguna kedalam atribut saldo yang telah diinputkan pengguna, 
  - getSaldo digunakan untuk memanggil isi dari atribut saldo, 
  - kemudian untuk method ambilUang digunakan untuk melakukan pengecekan apakah nominal dalam atribut saldo apakah apakah dia bisa mengurangi saldo tersebut atau tidak apabila bisa maka akan mengembalikan mengambalikan true namun jika tidak bisa maka akan mengembalikan false, 
  - simpanUang method ini digunakan untuk menambahkan nominal kedalam atribut saldo dimana nominal saldo dan jumlah ditambah kemudian hasilnya dimasukkan kembali kedalam atribut saldo.
 
  Lalu yang terakhir class TesLatihan yang disimpan diluar package perbankan, class ini digunakan untuk memasukkan data menggunakan method - method yang telah dibuat.
  untuk urutan filenya seperti ini :
  ```java
  package Modul5.latihan;
  ```
  untuk melakukan pemanggilan class nasabah dan tabungan dalam class TesLatihan dapat menggunakan perintah import seperti ini :
  ```java
  import Modul5.latihan.perbankan.nasabah;
  import Modul5.latihan.perbankan.tabungan;
  ```
  pertama tama kita akan melakukan pendeklarasian variabel:
  ```java
  int ss;
  boolean status;
  ```
  kemudian setelah itu melakukan inisiasi nasabah yang nantinya kaan diisi dengan nama awal nasabah dan nama akhir nasabah dimana dua data tersebut disimpan didalam dua atribut berbeda yaitu namaAwal dan namaAkhir seperti ini :
  ```java
  nasabah nasabah = new nasabah("Sugeng", "Darwanto");
  ```
  kemudian untuk memanggil apakah sudah berhasil atau tidak dapat menggunakan perintah seperti ini:
  ```java
  System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
  ```
  lalu untuk hasilnya
  ```java
  Nasabah atas nama : Sugeng Darwanto
  ```
  kemudian setelah itu kita dapat memasukkan nominal saldo kedalam atribut dengan menggunakan perintah ini:
  ```java
  nasabah.setTabungan(new tabungan(10000));
  ss = nasabah.getTabungan().getSaldo();
  System.out.println("Saldo awal : " + ss);
  ```
  kemudian hasilnya akan menjadi seperti ini :
  ```java
  Saldo awal : 10000
  Jumlah uang yang tersimpan : 7000
  ```
  lalu untuk method mengambil uang dapat digunakan seperti ini:
  ```java
  status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil   : 4000");
        if (status) {
            System.out.println(" > berhasil");
        }
        else System.out.println(" > gagal");
  ```
  variabel status atau ss tersebut digunakan untuk mengecek apakah method tersebut berhasil dilaksanakan atau tidak sesuai dengan hasil method ambilUang yang dimana apabila dia mengembalikan true maka akan menampilkan berhasil jika false maka akan menampilkan gagal.
  seperti ini :
  ```java
  Jumlah uang yang diambil   : 15000 > berhasil
  ```
  lalu kemudian untuk menampilkan nominal saldo sekarang yaitu dengan menggunakan perintah ini:
  ```java
  ss = nasabah.getTabungan().getSaldo();
  System.out.println("Saldo sekarang : " + ss);
  ```
  di atas variabel ss tersebut diisi dengan nominal yang diisi dengan nominal yang didapat dari getTabungan dan getSaldo.
  kemudian hasilnya akan seperti ini :
  ```java
  Saldo sekarang : 26900
  ```
  
  <hr>

## Kesimpulan
Kesimpulan yang didapatkan dari praktikkum pemrograman modul 5 ini yaitu dapat menggunakan import dan mengambil atau mengakses sebuah class yang berada dalam package dengan penggunaan perintah import, selain itu juga memahami kata kunci This yang digunakan untuk melakukan rujukan agar tidak terjadi kebingungan dalam codingan.
  
