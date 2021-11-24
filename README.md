# MODUL 7 : OVERLOADING DAN OVERRIDING

<hr>

## Dasar Teori

* Overloading

  Overloading merupakan sebuah metode yang digunakan untuk memungkinkan banyak metode - metode yang memiliki perbedaan dalam parameter dan hasil return yang berbeda untuk memiliki nama yang sama, dikarenakan oleh itu penggunaan metode Overloading bermanfaat yaitu tidak perlu lagi membuat fungsi - fungsi yang memiliki perbedaan nama namun bertugas sama.
  
* Overriding

  Overriding merupakan sebuah metode yang digunakan untuk mengimplementasikan sebuah fungsi spesifik di subclass dimana fungsi tersebut berada di superclass.
  
  - Aturan untuk melakukan Overriding dan Overloading Method
    
    Overriding
   - Nama metode harus sama
   - Daftar Parameter harus sama
   - Return type harus sama
   
   Overloading
   - Nama metode harus sama
   - Daftar Parameter harus berbeda
   - Return type dapat sama namun juga boleh berbeda;

<hr>

## Praktikum
Soal : 
  1. Mengidentifikasi soal percobaan modul 7

  Jawaban :
  1. [Jawaban Soal](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul7/src/Modul7/percobaan)
  
  a. [Percobaan 1](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul7/src/Modul7/percobaan/p1) 
  
  - Class A

```java
package Modul7.percobaan.p1;

public class A {
}
```
Disini Class A berperan sebagai Parent class  atau superclass

  - Class B
```java
package Modul7.percobaan.p1;

public class B extends A {
}
```
Disini Class B berperan sebagai Child Class atau sub-class dari class A, dan juga merupakan Parent class dari class C

  - Class C
```java
package Modul7.percobaan.p1;

public class C  {

}
```
Class C merupakan Child Class dari class B dikarenakan merupakan Parent class terdekat dari Child class C

  - Class Overload
```java
package Modul7.percobaan.p1;

public class Overload {
    void myOverload(A a){
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload(B b){
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();
        A a = new A();

        o.myOverload(a);
        o.myOverload(c);
    }
}
```
Pada percobaan pertama ini Class Overload digunakan sebagai Main class, dimana class ini digunakan untuk melakukan pemanggilan Class C dan hasil nya akan memanggil Parent class yang dicetak melalui class C pada output pemanggilan tersebut.

Output Pemanggilan
```java
Overload.myOverload(A a)
Overload.myOverload(B b)
```

Disini outputnya memberikan hasil pemanggilan yang dilakukan pada Class C yang muncul yaitu class B dikarenakan Class B tersebut merupakan Parent class dari class C dan meskipun Class A merupakan Parent class dari class B namun hasilnya tetap saja memanggil class B dikarenakan class A tidak memiliki keterkaitan langsung terhadap class C sedangkan pada saat pemanggilan class A memunculkan hasil pemanggil diri sendiri hal tersebut dikarekan Class A tidak memiliki parent class oleh karena itu hanya memanggil dirinya sendiri.


  b. [Percobaan 2](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul7/src/Modul7/percobaan/p2)
  
```java
package Modul7.percobaan.p2;

import Modul7.percobaan.p1.Overload;

public class Overload1 {
    void myMethod(short s){
        System.out.println("short");
    }

    void myMethod(int i){
        System.out.println("int");
    }

    void myMethod(long l){
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
        o.myMethod(1);
        o.myMethod(64);
    }
}
```

Disini program tersebut merupakan contoh dari cara penggunaan metode overloading, seperti yang dapat diketahui bahwa seluruh nama dari metode yang berada dalam class diatas memiliki nama yang sama namun berparameter berbeda, dalam class ini perbedaan metode tersebut dapat dilihat dari parameter nya yaitu short, int dan juga long, dan juga disesuaikan dengan hasil keluarannya. Pada Class ini atau Main class variabel b ini dideklarasikan bertipe data bit dengan memiliki nilai 1, kemudian variabel b tersebut dipanggil menggunakan fungsi myMethod setelah itu juga melakukan pemanggilan data yang lain bernilai 1 dan 64 lalu hasil yaitu seperti ini:
```java
short
int
int
```
Disini hasil pemanggilan variabel b tersebut menampilkan short, hal tersebut terjadi dikarenakan oleh variabel data disini menggunakan tipe data bit yang memiliki memory 8-bit dan bertipe data short, lalu nilai tersebut merupakan nilai yang terdekat dengan memory 16-bit sedangkan yang lain mencetak int, hal itu dikarenakan pada nilai angka biasanya memiliki tipe data default integer, oleh karena itulah mengapa nilai - nilai angka yang dimasukkan tersebut memiliki hasil int.

<hr>

## Kesimpulan
 - Overloading 
 dapat membuat sebuah Child class memiliki method yang sama dengan parent classnya namun tidak dengan pengimplementasiannya. Syarat agar Overloading dapat dilakukan yaitu Nama metode harus sama, parameter harus berbeda, dan tipe pengembalian atau return typenya bisa sama ataupun berbeda.
  
  Keuntungan dalam penggunaan Overloading yaitu tidak perlu membuat nama - nama fungsi yang berbeda untuk melakukan tugas yang sama.
  
 - Overriding
 dapat membuat sebuah Child class menggunakan atau membuat metode yang sama dari Parent classnya. Syarat agar Overriding dapat dilakukan yaitu Nama metode tersebut harus sama, parameter harus sama, lalu tipe pengembalian atau return typenya pun harus sama.
  
  Keuntungan dalam penggunaan Overriding yaitu dapat melakukan inheritance dengan metode - metode yang ditimpa lalu Parent class dapat memberikan defisini umum yang nantinya dapat digunakan oleh seluruh Child classnya.
