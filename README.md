# Modul 0 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam Java
 
  sebuah identifier yang telah dipesan untuk melakukan pendifinisian sebelumnya oleh java yang digunakan untuk tujuan tertentu.
  Penjelasan Teori
* Tipe Dasar
 
  Dalam java ada 8 tipe dasar yaitu boolean,char,byte,short,int,long,float,dan double.

* Variabel

  Variabel merupakan sebuah penanda suatu tipe data ataupun nama masing masing identifier.
  Penjelasan Teori
* Casting dan Promotion

  Biasanya digunakan untuk merubah suatu tipe data ke tipe data yang lebih kecil panjang bitnya.

<hr>

## Praktikum
Soal : 
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul0/src/Modul0/latihan/BigInteger.java)
```java
long p = 2147483648;
``` 
Syntax diatas akan menampilkan error:
```java
  C:\Aal's Files\Repository\20104003_AaliyahKhalifHandoyo_S1SEA_Pemrograman2\src\Modul2\latihan\BigInteger.java:5: error: integer number too large : 2147483648;
```
  error ini terjadi dikarenakan java akan membaca tipe data ini sebagai tipe data integer bukan tipe data long oleh karena itu terjadi error, apabila kita ingin membuat tipe data tersebut menjadi long seperti syntax diatas maka kita harus menambahkan huruf "L" dibelakang angkanya agar java dapat membaca tipe data tersebut menjadi tipe data long.
  contoh nya seperti ini : long p = 2147483648L;

2. [Jawaban Soal 2](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul0/src/Modul0/latihan/AnakAyam.java)
```java
Anak ayam turunlah 5, Mati satu tinggalah 4
Anak ayam turunlah 4, Mati satu tinggalah 3
Anak ayam turunlah 3, Mati satu tinggalah 2
Anak ayam turunlah 2, Mati satu tinggalah 1
Anak Ayam turun 1, mati satu tinggalah induknya
```
kita dapat melakukan perulangan for yang dapat digunakan untuk melakukan pengulangan angka yang telah diinput contohhnya seperti yang diatas dan inputannya seperti ini :
```java
Masukkan Jumlah Anak Ayam	: 5
```

3. [Jawaban Soal 3](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul0/src/Modul0/latihan/Abc.java)

  pada awalnya pengguna akan diminta untuk memasukkan inputan untuk jumlah testcase contoh 
 ```java
   Masukkan Jumlah Testcase : 5
   ```
   lalu, program akan menampilkan list huruf A hingga C dengan yang dimulai dengan angka 1 lalu berganti ke 2 seperti ini :
```java
Masukkan A 1 : 5
Masukkan B 1 : 7
Masukkan C 1 : 9

Masukkan A 2 : 3
Masukkan B 2 : 5
Masukkan C 2 : 4
```
cara agar angka tersebut muncul bersamaan dengan huruf adalah dengan cara menggunakan perulangan dalam pencodingan yaitu perulangan for, dimana salah satu aturannya yaitu i = 0
maka oleh karena itu akan ditambahkan i dengan angka 1.
 ```java
           for (int i = 0; i < k; i++) {
            System.out.print("Masukkan A " + (i + 1) + "\t: ");
            a[i] = sc.nextInt();
            System.out.print("Masukkan B " + (i + 1) + "\t: ");
            b[i] = sc.nextInt();
            System.out.print("Masukkan C " + (i + 1) + "\t: ");
            c[i] = sc.nextInt();
        }
   ```
   
  lalu program akan langsung membaca dan sesuai dengan aturannya dimana jika i = 0 maka akan ditambahkan dengan angka 1, lalu i akan berubah menjadi 1 dan terus sampai i tersebut sesuai dengan inputan dari pengguna
<hr>

## Kesimpulan
kesimpulan yang didapatkan yaitu mengingat kembali tentang tipe data dalam java, lalu cara pemakaiannya dan pengertian tentang java.
