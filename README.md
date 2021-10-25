# Modul 3 : Pengenalan Pemrograman Berorientasi Objek

## Dasar Teori
* Pemrograman Berorientasi Objek 

  Pemrograman Berorientasi Objek merupakan sebuah pemrograman berorietasikan kepada sebuah objek, dimana   fungsi-fungsi tersebut dibungkus dalam sebuah class objek.
* Mendeklarasikan Suatu Class

  Class objek, merupakan sebuah wadah yang menyimpan sebuah model dari suatu objek atau benda, dimana     model tersebut mendeskripsikan suatu data.
* Mendeklarasikan Suatu Atribut

  Atribut merupakan suatu nilai yang terdapat dalam suatu objek, yang berasal dari class.
* Mendeklarasikan Suatu Metode

  Sebuah perintah yang dapat dilakukan objek, dimana dalam pengimplementasiannya, program ditulis         dalam berbentuk fungsi.
* Mengakses Anggota Suatu Objek
  
  Untuk mengakses suatu anggota objek, harus melakukan pembuatan instance class terlebih dahulu.
  
  <hr>
  
  ## Praktikum
  Soal :
  1. Mengimplementasikan UML Class diagram dalam program untuk Class Tabungan
  
  |              TABUNGAN            | 
  | -------------------------------- | 
  | +Saldo: int                      | 
  | +Tabungan(initsaldo: int)        |
  | +getSaldo(): int                 |
  | +simpangUang(jumlah: int)        |
  | +ambilUang(jumlah: int): boolean |
  
Jawaban :
1. [Jawaban Soal 1](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul3/src/Modul3/latihan/LatihanTesTabungan.java)

    pertama tama, UML Class diatas, meminta untuk membuat variabel dan fungsi dalam bahasa java yaitu :
    ```java
    int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    ```
   diatas itu terjadi pendeklarasian variabel saldo yang bertipe data integer, dan juga pembuatan        sebuah fungsi Tabungan dengan paramenter variabel saldo dan fungsi tersebut berguna untuk mengisi      variabel saldo dengan saldo yang nanti diinputkan oleh pengguna. 
   
   Lalu setelah itu membuat sebuah fungsi getSaldo,simpanUang, dan ambilUang, dengan bahasa java          seperti ini :
    ```java
    public int getSaldo(){
      return saldo;
    }
    
    public simpanUang(int jumlah){
        return saldo = saldo + jumlah;
    }
    
    public boolean ambilUang(int jumlah){
      if(saldo - jumlah < 0){
        return false;
      } else {
         saldo -= jumlah;
         return true;
      }
     }
    ```
    pertama pada fungsi getSaldo fungsi tersebut digunakan untuk memanggil saldo agar dapat digunakan, lalu fungsi simpanUang berguna untuk menambahkan jumlah saldo, dimanan dia akan mengembalikan variabel saldo yang sudah diisi dengan nilai variabel saldo + nilai variabel jumlah, kemudian untuk fungsi yang terakhir yaitu fungsi ambilUang fungsi ini digunakan untuk mengurangi nilai yang ada didalam variabel saldo dengan nilai variabel jumlah yang telah dimasukkan oleh pengguna dalam fungsi tersebut terdapat if dengan kondisi apabila saldo - jumlah < 0 maka dia akan mengembalikan false atau fungsi tidak akan memberikan hasil pengurangan lalu selain itu, maka jika saldo -= jumlah maka dia akan mengembalikan true dan menunjukan hasil pertambahan.

<hr>

## Kesimpulan

pada modul ini mahasiswa dapat mengerti dan menggunakan objek beserta atribut dalam pemrograman berorientasi objek sserta hasil yang didapatkan.
    
    
