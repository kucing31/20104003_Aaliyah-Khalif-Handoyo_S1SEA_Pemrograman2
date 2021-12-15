# MODUL 8 : POLIMORFISME

<hr>

## Dasar Teori

* Konsep dasar polimorfisme
  Polymorphism merupakan sebuah konsep dalam Object Oriented Programing (OOP) dimana class-nya memiliki nama yang sama namun bentuk yang berbeda, maksud dari pernyataan diatas yaitu memmiliki nama yang sama namun memiliki perbedaan dari isi, tipe data lalu juga parameter dari method tersebut berbeda dari method yang memiliki nama yang sama dan juga berbeda dari yang lainnya.
  
* Virtual Method Invocation
  Virtual Method Invocation (VMI)  merupakan sebuah pemanggilan yang terjadi apabila terjadi polimorfisme dan overriding, saat setelah pembuatan obyek tersebut selesai lalu dilakukan pemanggilan overriden method pada class Parent, kompiler dalam java tersebut akan melakukan pemanggilan atau invocation kepada overriding method pada subclassnya, yang dimana seharusnya dipanggil itu merupakan overriden method.
  
* Polymorhic arguments
  Polymorphic arguments merupakan salah satu tipe parameter yang menerima sebuah nilai yang bertipe pada subclassnya.
  
* Instanceof 
  merupakan sebuah keyword yang digunakan di java untuk melakukan pembandingan objek, dimana apakah instansiasi dari suatu class atau tidak, lalu hasilnya akan memberikan nilai boolean yang berupa true atau false 
  
  
<hr>

## Praktikum
Soal : 
1. Mengidentifikasi soal percobaan modul 8

Jawaban :
1. [Jawaban Soal](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul8/src/Modul8/latihan)

 a. [Class Pegawai](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul8/src/Modul8/latihan/Pegawai.java)

  Pada awalnya class melakukan pendeklarasian variabe yang nanti akan digunakan untuk sebagai wadah penyimpanan data, dan disini class ini merupakan super class atau Parent class dimana nantinya class selanjutnya akan menjadi child class-nya.
```java
    private String name;
    private String address;
    private int number;
```
  variabel yang dideklarasikan yaitu name, address yang bertipe String lalu number yang bertipe data int, kemudian semua memiliki modifier private dimana variabel hanya bisa diakses oleh class itu sendiri.

kemudian setelah itu selain pendeklarasian class juga diisi dengan beberapa method dan setter dan getter.
dibawah merupakan beberapa method yang bukan setter dan getter
```java
    public Pegawai (String name, String address, int number){
        System.out.println("Menyusun Pegawai");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Memeriksa Surat Untuk " + this.name + " " + this.address);
    }

    public String toString(){
        return name + " " + address + " " + number;
    }
``` 
beberapa method diatas digunakan untuk melakukan beberapa tugas, yaitu dimana method pegawai digunakan untuk melakukan perujukan data yang nanti akan diisi melalui getter dan setter, kemudian method mailcheck dimana method tersebut merupakan void jadi dia menggunakan variabel temporary dimana gunanya method ini untuk melakukan pengecekan data apakah berhasil atau tidak penginputan data yang sudah dimasukkan dan juga tidak boleh menggunakan return, kemudian method toString yaitu method yang digunakan untuk melakukan pemanggilan data name, address, dan number.

 b. [Class Gaji](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul8/src/Modul8/latihan/Gaji.java)

Pada Class Gaji diawali dengan pendeklarasian variabel salary dengan tipe data double yang nanti digunakan sebagai tempat penyimpanan data untuk gaji tahunan dan juga bermodifier private.
```java
    private double salary; //Gaji Tahunan
    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck(){
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Memeriksa tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary(){
        return salary;
    }

    private void setSalary(double newSalary) {
        if (newSalary >= 0.0){
            salary = newSalary;
        }
    }

    public double computerPay(){
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/53;
    }
 ```
 ada beberapa method dikelas ini yang merupakan turunan dari class Pegawai dikarenakan class ini merupakan child class dari class Pegawai, dan method yang pertama yaitu Gaji dimana dia menggunakan variabel yang berada pada parent class- nya ditambahkan dengan variabel salary, dan juga method Gaji melakukan pemanggilan method yang digunakan untuk melakukan pemasukkan data salary yang nantinya akan dilakukan perbandingan gaji baru dengan gaji lama yang dilakukan dalam method setSalary.
  lalu ada method Mailcheck yang digunakan untuk menampilkan kelas gaji dalam surat yang datanya didapatkan dari variabel name dan salary yang dipanggil menggunakan getName dan variabel salary itu sendiri.
  kemudian method setSalary, method ini digunakan untuk melakukan perbandingan antara data gaji yang baru dengan gaji yang lama dengan menggunakan percabangan if jika newSalary >= 0.0 maka salary = newSalary jadi jika gaji baru lebih besar atau sama dengan gaji lama maka gaji baru akan menggantikan gaji lama kemudian variabel dirubah yang tadinya int menjadi double.
  Kemudian untuk method terakhir yaitu method computerPay, method digunakan untuk melakukan penghitungan jumlah pembayaran gaji dimana dia nanti menampilkan menghitung pembayaran untuk (nama yang dipanggil menggunakan getName) lalu pengembalian variabel salary yang dibagi dengan 53.
  
 c. [Class VirtualDemo](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul8/src/Modul8/latihan/VirtualDemo.java)
 
 Disini class VirtualDemo merupakan main class yang digunakan untuk menerima inputan data dan juga running program.
 class ini digunakan untuk melakukan pemasukkan data gaji dan pegawai, kemudain juga digunakan untuk melakukan pemanggilan method mailcheck.
 berikut merupakan hasil dari running program
```java
Menyusun Pegawai
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi Gaji --
Memeriksa kelas gaji dalam surat 
Memeriksa tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai --
Memeriksa kelas gaji dalam surat 
Memeriksa tertuju untuk Ini nama dengan gaji 2500.0
```
hasil output berikut menampilkan pertama menampilkan hasil pemanggilan mailcheck gaji, lalu untuk hasil yang kedua menampilkan hasil mailcheck pegawai mengapa hasil menjadi double dikarenakan pada class gaji method salary nilai salary dirubah menjadi double.

<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 8
kesimpulan yang didapatkan dalam praktikum kali ini yaitu bahwa sebuah method yang memiliki nama yang sama namun parameter dan isi yang berbeda merupakan polymorphisme, lalu juga cara penggunaannya, kemudian apabila melakukan penggubangan antara overriding dan polymorphisme maka akan terjadi VMI atau Virtual Method Invocation.
