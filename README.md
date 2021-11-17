# MODUL 6 : KONSEP INHERITANCE

<hr>

## Dasar Teori

* Pengertian inheritence

  Inheritance atau Pewarisan merupakan sebuah konsep Object Oriented Programming, dimana sebuah class yang baru mewarisi atau memiliki metode - metode atau bagian - bagian dari class yang sebelumnya yang sudah ada, Konsep Pewarisan ini dalam penggunaannya menggunakan sistem hirarki atau sistem yang bertingkat dimana apabila submenu tersebut lebih spesifik maka akan semakin spesifik juga isi didalamnya itu juga berlaku dalam konsep pewarisan OOP apabila semakin spesifik subclassnya maka akan semakin sedikit pula bagian - bagian yang dapat diwarisi class tersebut kepada class berikutnya.
  
* Deklarasi inheritance dan Single inheritance

  Dalam java apabila ingin melakukan pendeklarasian Inheritance, dapat dilakukan dengan menambahkan kata kunci extends yang setelah melakukan deklarasi nama class lalu diikuti oleh nama Parent class atau class yang akan mewariskan bagian - bagian didalamnya, kegunaan dari kata kunci extends tersebut yaitu perluasan terhadap class. 
  Contoh penerapan dapat dilakukan seperti ini:
  ```java
  public class kopi extends Minuman {
  ...
  }
  ```
* Penerapan Inheritance
  Untuk Penerapan secara lebih jelas nya dapat dilihat sebagai berikut :
  
  Contoh:
  
  Disini yang menjadi Parent Class yaitu Minuman yang memiliki Child class kopi dan teh
  ```java
  class Minuman {
      String nama;
      
      Void minum(){
        System.out.println("ini dapat diminum");
      }
  }
  ```
  ```java
  class kopi extends Minuman {
      Void penjelasan(){
          System.out.println("ini Kopi");
      }
  }
  ```
  ```java
  class teh extends Minuman {
      Void penjelasan(){
          System.out.println("ini Teh");
      }
  }
  ```
  
* Pengaksesan memberi dari Parent Class

  Pengaksesan atau pemanggilan memberi dari parent class dapat dilakukan seperti ini :
  
  ```java
  Minuman beverage = new Minuman();
  kopi Coffee = new kopi();
  teh Tea = new teh();
  ```
  
  Disini Minuman merupakan Class Parent yang dipanggil di main, sedangkan beverage merupakan variable wadah yang akan digunakan apabila ingin memanggil Class Minuman.
  
* Kontrol Pengaksesan

  Dalam Java Access modifiers atau Kontrol Pengaksesan merupakan sebuah kata kunci istimewa yang dapat digunakan untuk memodifikasi sebuah class, metode dan variabel, ada beberapa access modifiers diantaranya yaitu Private, Public, Default, Protected.
  - Private   = hanya dapat diakses di class yang sama saja
  - Default   = hanya dapat diakses di class yang sama, lalu package yang sama
  - Protected = hanya dapat diakses di class yang sama, lalu package yang sama, kemudian juga subclass
  - Public    = hanya dapat diakses dari manapun. 


* Kata kunci Super

  Mirip dengan kata kunci this yang mereprentasikan sebuah objek dari sebuah class, kata kunci super ini merepresentasikan sebuah objek dari class parentnya.
  
  Kata kunci super dapat digunakan seperi berikut
  - super.data_member       = ini merujuk kepada data member pada parent class
  - super.function_member() = ini merujuk kepada sebuah function pada parent class
  - super()                 = ini merujuk kepada constructor pada parent class
  
  untuk super() hanya dapat digunakan pada baris pertama dalam konstructor subclass. 
  
* Konstruktor tidak diwariskan

  Sebuah konstruktor tidak dapat diwariskan dikarenakan sebuah konstruktor membuat objek baru sedangkan variabel atau metode dan digunakan setelah adanya sebuah objek, warisan dapat dilakukan apabila telah terjadi pembuatan objek dan objek tersebut memiliki bagian - bagian yang nantinya dapat diwariskan dan digunakan oleh class child-nya. 
 <hr>

## Praktikum
  Soal : 
  1. Mengidentifikasi soal percobaan modul 6
  
  Jawaban :
  1. [Jawaban Soal](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul6/src/Modul6/percobaan)
  
  a. [Percobaan 1](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul6/src/Modul6/percobaan/satu)
    
   - Class Bentuk sebagai Parent Class
  
  Disini Class Bentuk berperan sebagai Parent class, class ini berisi variabel int p, l yang memiliki access modifier protected, class tersebut menggunakan modifier protected agar child class dari class Bentuk nantinya dapat mengakses bagian - bagian tersebut.
  ```java
    package Modul6.percobaan.satu;

    public class Bentuk {
        protected int p, l;
    }
```
    
   - Class Persegi sebagai Child Class
   
   Class persegi sebagai Child class dari class Bentuk
    
```java
    public class Persegi extends Bentuk {
      protected int p, l;

        public void setSuperP(int p){
            super.p = p;
        }

        public void setSuperL(int l){
            super.l = l;
        }

        public void setP(int p){
            this.p = p;
        }

        public void setL(int l){
            this.l = l;
        }

        public void getLuas(){
            System.out.println("Luas super\t: " +(super.p * super.l));
            System.out.println("Luas\t\t: " + (this.p * this.l));
        }
     }
 ```
    
   Pertama tama di dalam class ini diawali dengan pendeklarasian variabel p, dan l dengan tipe data integer, kemudian setelah ada dua method yaitu setSuperP dan setSuperL kedua method tersebut berguna untuk melakukan set pada variabel yang berada class parent, lalu ada 2 method lagi yaitu setP dan setL dalam method tersebut menggunakan kata kunci this yang merujuk pada variable yang berada pada class tersebut atau class yang digunakan.
  
   Lalu method yang terakhir yaitu method getLuas, method ini digunakan sebagai rumus dan nantinya apabila dilakukan pemanggilan akan menampilkan hasil perkalian luas.
  
  - Class PersegiTest sebagai main class

    Class ini digunakan untuk melakukan inputan dan juga pemanggilan class lainnya untuk menampilkan hasil dari inputan pengguna.
```java
package Modul6.percobaan.satu;

public class PersegiTest {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();

        kotak.setSuperP(5);
        kotak.setSuperL(10);

        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }
}
```
  
  Dalam Class PersegiTest berisi beberapa inputan yaitu setSuperP dan setSuperL untuk mengisi variabel yang berada pada class parent, lalu setP dan setL untuk mengisi mengisi variabel dari class childnya dan cara pemanggilannya menggunakan inisialisasi Persegi kota = new persegi dan akhirnya untuk input akan menjadi contohnya kotak.setSuperP
  
  lalu akan menampilkan hasil program seperti ini:
  ```java
  Luas Super : 50
  Luas       : 39
  ```
  
  b. [Percobaan 2](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul6/src/Modul6/percobaan/dua)
  
  - Class Person sebagai Parent class
  
```java
public class Person {
    protected String name;
    protected String address;

    public Person(){
        System.out.println("Inside Person\t: Constructor");
        name = "";
        address = "";
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
}
```

Di dalam class person awalnya terdapat pendklarasian variabel name lalu address bertipe data String dengan memiliki access modifier protected agar hanya dapat diakses oleh child classnya saja.

  kemudian setelah itu terdapat beberapa metode yaitu getName,setName,getAddress,setAddress metode - metode tersebut merupakan metode getter dan setter yang digunakan untuk mengembalikan nilai kepada variabel yang menggunakan fungsi return sedangkan setter digunakan untuk memberikan nilai pada variabel dan constructor, setter biasanya berbentuk void dikarenakan setter tersebut digunakan sebagai wadah sementara untuk nilai yang akan diberikan kedalam variabel kemudian dalam setter biasannya menggunakan kata kunci this atau super, lalu di atas 4 metode tersebut terdapat class Person yang berisi nilai yang didapat dari 4 metode dibawahnya.
  
  - Class Student sebagai child class
  
  lalu untuk class child dalam percobaan kedua ini dan merupakan child class dari Class Person yaitu adalah Class Student, berikut beserta konstruktornya
  
```java
package Modul6.percobaan.dua;

public class Student extends Person{
    public Student() {
//        super("Ini nama", "Ini alamat");
//        super();
//        super.name = "Ini nama";

        System.out.println("Inside Student\t: Constructor");
    }
}
```

  - Class InheritDemo sebagai main class

  Kemudian untuk class yang digunakan sebagai main class yaitu class InheritDemo, dimana isi class ini hanya pemanggilan dari child class Person yaitu class Student
  
```java
package Modul6.percobaan.dua;

public class InheritDemo {
    public static void main(String[] args) {
        Student Wahyu = new Student();
     
    }
}
```

Maka hasil outputnya akan seperti berikut:
```java
Inside Person	  : Constructor
Inside Student	: Constructor
```
Mengapa pada hasil output dari main muncul keduanya padahal yang dilakukan pemanggilan hanyalah child class nya saja, itu dikarenakan class Student sudah menjadi child class dari class Person dan itu berarti 2 class tersebut saling terhubung antar satu sama lain, oleh karena itu maka pada saat pemanggilan child class dilakukan, Parent class nya pun akan ikut terpanggil juga.

  c. [Percobaan 3](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul6/src/Modul6/percobaan/tiga)
  
  - Class A sebagai Parent class

```java
package Modul6.percobaan.tiga;

public class A {
    protected int x; //privat tidak bisa di akses oleh class lain
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai(){
        System.out.println("nilai x : " +x+ " \nnilai y : " +y);
    }
}
```
  Dalam Class yang berperan sebagai Parent class di awalnya terdapat pendeklarasian variabel x dan y bertipe integer yang memiliki access modifier protected dimana awalnya masih menggunakan modifier private namun sekarang sudah diganti, mengapa modifier tersebut diganti dikarenakan pada saat percobaan tidak berhasil memunculkan nilai dikarenakan modifier nya private sehingga tidak dapat diakses oleh class lain dan pada saat melakukan pemanggilan gagal. Kemudian setelah itu 3 metode yaitu setX, setY, dan yang terakhir metode getNilai beserta constructor metode - metode tersebut.
  
  - Class B sebagai Child class
 
```java
package Modul6.percobaan.tiga;

public class B extends A {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getJumlah(){
        System.out.println("Jumlah\t: " + (x+y+z));
    }
}
```

  Pada class B terdapat deklarasi variabel z bertipe data integer dengan memiliki access modifier private. Kemudian di class ini terdapat metode get dan set yaitu setZ dan getJumlah.
  
  - Class InheritanceTest sebagai Main class

 ```java
 package Modul6.percobaan.tiga;

public class InheritanceTest {
    public static void main(String[] args) {
        A ortu = new A();
        B anak  = new B();

        System.out.println("SuperClass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        System.out.println("\nSubClass");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getNilai();;
        anak.getJumlah();
    }
}
```

  Class ini berperan sebagai main class, dimana dalam class ini terdapat pemanggilan dari kedua class sebelumnya, dimana Class A sebagai Parent Class dan Class B sebagai child class, setelah itu terjadi pengisian nilai kedalam variabel yang berada di kedua class tersebut, lalu pemanggilan hasil agar dapat ditampilkan.

```java
SuperClass
nilai x : 10 
nilai y : 20

SubClass
nilai x : 5 
nilai y : 4
Jumlah	: 59
```

  Yang menyebabkan jumlah tidak muncul pada superclass dikarenakan pada pemasukkan nilai di class main tidak terdapat variabel z yang dibutuhkan dalam rumus, dimana variabel z hanya berada didalam subclass atau child class sedang pada superclass tidak ada, maka jumlah hanya dapat muncul pada subclass, dan tidak terjadi error.
  
  d. [Percobaan 4](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul6/src/Modul6/percobaan/empat)
  
  - Class Parent sebagai Parent class

dalam Class Parent tidak terdapat apa apa

```java
package Modul6.percobaan.empat;

public class Parent {
}
```

  - Class Child sebagai Child class
  
```java
package Modul6.percobaan.empat;

public class Child {
    int x;

    public Child(){
        super(); //penggunaan super harus di letakan pada statement bagian atas
        x = 5;
    }
}
```
  Pada kelas Child terdapat pendeklarasian variabel yaitu x bertipe data integer, kemudain class ini memiliki sebuah metode child dimana dia berisi kata kunci super() untuk sebuah constructor, lalu x = 5, pada saat awal constructor super tersebut tidak disimpan di awal, dan karena itu terjadi error namun setelah dipindahkan ke paling error tersebut tidak terjadi kembali, hal ini terjadi dikarenakan pada saat melakukan pemanggilan konstruktor parent class tidak disimpan statementnya di baris pertama pada constructor child class.
  
<hr>

## Kesimpulan

Kesimpulan yang dapat diambil dari modul 6 yaitu, konsep inheritance merupakan sebuah konsep dimana bagian bagian Parent classnya dapat diwariskan dan digunakan oleh Child classnya, penggunaan konsep inheritance dapat dilakukan dengan cara menambahkan kata kunci extends pada nama child class lalu nama class yang akan dijadikan Parentnya, lalu Access Modifier yang dapat digunakan untuk mengatur class apa saja yang dapat mengakses data tersebut, kemudian tipe tipe modifier tersebut yaitu private,protected,default,public. Lalu dalam penggunaan kata kunci super apabila ingin melakukan pemanggilan constructor harus disimpan di baris awal agar tidak terjadi error. 
  
