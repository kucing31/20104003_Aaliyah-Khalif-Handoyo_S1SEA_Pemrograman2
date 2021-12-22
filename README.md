# MODUL 9 : Exception

<hr>

## Dasar Teori

* Exception
  
  Exception merupakan sebuah kondisi dimana terdapat error dalam sebuah program pada saat dijalankan, kemudian error tersebut dapat di selesaikan menggunakan teknik exception handling. Terdapat beberapa query dalam melakukan teknik exception handling yaitu diantaranya :
    - Try
    - Catch
    - Finally
    - Throw
    - Throws
  
* Tipe - tipe Exception (Checked Exception dan Unchecked Exception)
  Ada dua tipe exception yaitu Checked exception dan Unchecked exception
    - Checked Exception
      
      Checked Exception merupakan sebuah exception yang diketahui atau ditemukan pada saat compile time.
      Selain itu ada juga exceptions yang dicek pada saat compile time, dikarenakan maka exceptions tersebut disebut dengan compile time exceptions.
      
    - Unchecked Exception
      
      Unchecked exception merupakan sebuah exception yang terjadi pada saat runtime, pada saat compile time semuanya berjalan dengan semestinya, namun pada saat runtime akan terlempar exception ini, maka dari itu exception ini juga disebut sebagai runtime exceptions.
  
* Menangani exception menggunakan try, catch, finally, throw dan throws
  - Try and Catch
  
    Try digunakan untuk menentukan blok kode yang nantinya akan diuji untuk exception pada saat dijalankan atau melakukan pelemparan, sedangkan Catch digunakan untuk menentukan blok kode yang akan dieksekusi apabila terjadi kesalahan dalam blok kode try.
    
    Oleh karena itu penggunaan Try and Catch dalam penanganan exception digunakan secara berpasangan.
    Struktur dan contoh dalam penggunaan Try and Catch
 ```java
 try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```
  
  - Finally
  
    Finally digunakan untuk menempatkan blok code yang penting seperti pembersih kode, code yang digunakan sebagai penutup file ataupun kode yang digunakan sebagai pemutus hubungan, kemudian blok finally akan melakukan eksekusi dimana apakah exceptionnya bertamabah atau tidak lalu apakah exception atau exceptions tersebut ditangani atau tidak.
  Perumpamaan penggunaan finally menggunakan bahasa indonesia:
    Try     : Memasak telur tapi telurnya habis
  
    Catch   : membeli telur 
 
    Catch2   : memasak menu lain
  
    Finally : makan
  
    memasak telur tapi telurnya habis maka membeli telur lalu makan untuk finally Catch
  
    memasak telur tapi telurnya habis maka memasak menu lain lalu makan untuk Finally Catch2
  
    disini blok finally akan tetap dijalankan apapun kondisi yang diberikan dari try and catch
  
  - Throw and Throws
  
    Throw digunakan untuk secara khusus melempar sebuah exception dan tidak bisa digunakan secara bersamaan dengan try and catch, sedangkan Throws digunakan untuk melakukan pendeklarasian exception yang penggunaannya sama seperti penggunaan try and catch namun perbedaannya adalah throws hanya digunakan khusus untuk melakukan pelemparan sebuah exception dan tidak bisa digunakan bersama dengan try and catch.
    
<hr>

## Praktikum
Soal : 

  1. Mengidentifikasi soal Latihan pada modul 9

Jawaban :
  
  1. [Latihan 1](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul9/src/Modul9/latihan/Latihan1/percobaan7.java)

```java
import java.io.FileNotFoundException;

public class percobaan7 {
    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
```
hasil tampilan
```java
File Tidak Ada

Process finished with exit code 0
```

  pada latihan 1 program akan melakukan percobaan atau try yang dimana try tersebut memanggil method1 dimana didalamnya terdapat query throw yang melemparkan exception FilenotFountException dengan isi nya "File tidak ada" kemudian exception tersebut diterima atau ditangkap oleh catch lalu catch tersebut menampilkan hasil yang berada dalam exception yaitu "File tidak ada" dimana hal tersebut didapatkan dari exception telah dilemparkan pada saat pemanggilan method1 pada saat try.
  
  2. [Latihan 2](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul9/src/Modul9/latihan/Latihan2/percobaan.java)

```java
import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukan Angka\t: ");
            int num = sc.nextInt();
            if (num>10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s){
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");
        }
    }
}
```
hasil tampilan 

  - yang kurang dari 10
```java
Masukan Angka	: 7
Angka kurang dari atau sama dengan 10

Process finished with exit code 0
```

  - yang lebih dari 10
```java
Masukan Angka	: 12
Angka lebih dari 10
Selesai

Process finished with exit code 0
```

  Pada program Latihan2 ini program akan melakukan try dimana didalamnya terdapat inputan angka yang akan dimasukkan kedalam variabel num kemudian setelah itu try tersebut melakukan percabangan atau if dengan kondisi jika num > 10 maka dia akan melakukan throw new exception atau melemparkan exception baru yang dibuat dengan menggunakan query throw yang berfungsi sebagai pendeklarasi sekaligus juga pelempar exception tersebut, dan hasilnya jika nilai kurang dari 10 maka try tersebut akan menampilkan hasil "Angka kurang dari atau sama dengan 10" namun jika lebih atau terjadi error yang dihasilkan dari tidak sesuainya inputan dengan kondisi maka exception tersebut akan dibuat kemudian dilempar oleh try lalu ditangkap oleh catch kemudian catch tersebut akan menampilkan 
  
  "Angka lebih dari 10"
  
  "Selesai"

  3. [Latihan 3](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/tree/Modul9/src/Modul9/latihan/Latihan3)
 
```java
import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        } catch (ExceptionA a){
            JOptionPane.showMessageDialog(null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        } try {
            throw new ExceptionB();
        } catch (ExceptionA b){
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
```

  Hasil penampilan

  - Try pertama
```java
Exception
Modul9.latihan.Latihan3.ExceptionC
```

  - Try kedua
```java
Exception
Modul9.latihan.Latihan3.ExceptionB
```
  Pada latihan ini terdapat 4 class dimana Demo berperan sebagai main class lalu class ExceptionA sebagai child class dari exception dan ExceptionB merupakan child class dari ExceptionA, lalu ExceptionC merupakan child class dari ExceptionB.
  
  Pada saat program tersebut dijalankan, program akan melakukan try yang berisikan throw new ExceptionC dimana kegunaannya adalah untuk melemparkan exception yang nantinya akan diterima oleh catch lalu catch tersebut akan melakukan penampilan JOption pane yang sesuai dengan isi berdasarkan INFORMATION.MASSAGE. Kemudian untuk Try selanjutnya juga sama berisikan throw new exception namun terdapat perbedaan dalam isinya yaitu yang dilempar merupakan ExceptionB kemudian exception tersebut akan ditangkap oleh catch kemudian catch tersebut akan menampilkan JOption pane yang berisikan sesuai dengan INFORMATION.MASSAGE.
  
  mengapa tidak terjadi error pada saat pemanggilan dikarenakan ExceptionB dan ExceptionC berhubungan dengan ExceptionA.
  
<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 9

Kesimpulan yang didapat kali ini yaitu bagiamana cara penanganan apabila terjadi error dalam coding pada saat melakukan compile ataupun pada saat running, yang dapat disebut juga sebagai Exception, kemudian untuk menangani exception tersebut dapat menggunakan exception handling

  Ada dua tipe Exception yaitu :
  - Checked Exception
  
    Checked Exception yaitu sebuah exception yang diketahui atau ditemukan pada saat compile time.
      
  - Unchecked Exception
    
    Unchecked exception merupakan sebuah exception yang terjadi pada saat runtime, pada saat compile time semuanya berjalan dengan semestinya, namun pada saat runtime akan terlempar exception ini, maka dari itu exception ini juga disebut sebagai runtime exceptions.
    
    Kemudian untuk Exception Handling terdapat beberapa cara yaitu :
    - Try and Catch
    - Finally
    - Throw and Throws

Kemudian cara penggunaan dari Try and Catch, lalu Finally dan Throw and Throws, dimana try and catch digunakan secara berpasangan, lalu finally yang juga dapat digunakan bersamaan dengan try and catch, dimana apapun kondisinya blok finally akan tetap dieksekusi, lalu throw yang digunakan secara khusus hanya untuk melempar exception, sedangkan throws digunakan untuk mendeklarasikan dan juga melempar exception.
  
  
