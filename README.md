# Modul 4 : Dasar Pemrograman Berorientasi Objek

## Dasar Teori
* Information Hiding

  Information Hiding merupakan sebuah atribut atau sebuah method yang dimiliki oleh sebuah objek yang berguna untuk menyembunyikan data atau atribut agar tidak dapat diakses dari    luar 
* Encapsulation (Enkapsulasi)

  Merupakaan sebuah method yang digunakan untuk memnyembunyikan implementasi - implementasi sebuah detail dari sebuah class.
* Constructor (Konstruktor)

  Sebuah method yang pertama kali dijalankan oleh program pada saat membuat sebuah objek yang berfungsi untuk menginisialisasi variabel - variable instans yang berada dalam objek.
* Overloading Constructor

  sebuah class yang memiliki lebih dari constructor dimana class ini memiliki sebuah syarat yaitu daftar parameter tidak boleh ada redudansi atau tidak boleh ada yang sama.

<hr>

## Praktikum
Soal : 
1. Membuat 2 Class StudentRecord & StudentRecordExample, Analisa

Jawaban :
1. [Jawaban Soal 1](https://github.com/kucing31/20104003_Aaliyah-Khalif-Handoyo_S1SEA_Pemrograman2/blob/Modul4/src/Modul4/latihan/StudentRecord.java)
  
    Pertama - tama kita membuat variable - variable yang hanya dapat diakses oleh method - method         private yang nanti akan dibuat setelah melakukan pembuatan variable private.
    
   ```java
    private String name, address;
    private int age;
    private double math, english, science, average;
    private static int studentCount;
   ```
    
    ada beberapa variabel yaitu name dan address yang bertipe String, lalu age dan studentCount yang       bertipe data integer atau int, kemudian math,english,science, lalu average yang bertipe data           double.
  
    Kemudian setelah pembuatan variable - variable tersebut, kita melakukan pembuatan method - method     yang digunakan untuk melakukan pengambilan data lalu pemasukkan data terhadap masing - masing         variable yang telah di private menggunakan enkapsulasi.
    
    ```java
    public String getName(){
        return name;
    }
    
    public void setName(String temp){
        name = temp;
    }
    
    public double getAverage(){
        double result = 0;
        result = (math + english + science) / 3;
        return  result;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    ```
    
    Untuk 2 method pertama kita membuat pengambilan dan pemasukkan atau getter dan setter dari            variabel name, pertama melakukan pemanggilan menggunakan method public String getName untuk             memanggil data name lalu data tersebut dikembalikan, lalu membuat pemasukkan data atau setter         yaitu method SetName dan void tersebut dikarenakan data tersebut akan ditempatkan di variable         temporary atau variabel sementara. 
    
    Kemudian membuat method pengambilan data getAverage yang bertipe data double untuk mengambil           variable average yang nantinya akan digunakan untuk menghitung nilai yang didapatkan dari variabel     math,english, lalu science dengan cara menambahkan ketiga isi dari variable tersebut lalu membagi     hasil penambahan tersebut dengan 3 lalu memasukan hasilnya kedalam variable result yang dibuat         dalam method getAverage dengan tipe data double. 
    
    Lalu untuk method yang terakhir yaitu method getStudentCount yang berfungsi untuk menghitung           jumlah banyaknya siswa pada yang diinput pengguna.
    
    
    ```java
     public static void main(String[] args) {
        StudentRecord Aal = new StudentRecord();
        StudentRecord adalah = new StudentRecord();
        StudentRecord Nama = new StudentRecord();

        Aal.setName("Aal");
        adalah.setName("adalah");
        Nama.setName("Nama");

        System.out.println(Aal.getName());
        System.out.println("Hitung : " + StudentRecord.getStudentCount());
    }
    ```
    
    Kemudian dalam main kita melakukan pemanggilan constructor yang telah dibuat sebelumnya dengan         menggunakan method overload constructor setelah memanggil constructor kita melakukan pembuatan         setter name dari masing - masing variable. 
    
    Pada bagian tersebut kita melakukan pembuatan setter name yang kemudian dipanggil untuk               memunculkan sebuah nama yang telah diinputkan kemudian dengan menggunakan getNam, hasil program        diatas akan menampilkan output seperti ini :
    ```java
    Aal
    Hitung : 0
    ```
    
    seperti yang dapat dilihat hasil yang didapatkan pada saat memasukkan berhasil memunculkan Aal         sesuai dengan yang sudah diinputkan namun Hitung nya tidak memiliki nilai itu dikarenakan pada         bagian constructornya di bagian getAverage tidak ada nilai yang diinputkan ke masing - masing         variable tersebut dan akhirnya memunculkan nilai 0.
    
<hr>

## Kesimpulan
    Kesimpulan yang didapatkan dalam modul 4 ini, yaitu bagaimana caranya menggunakan constructor dalam PBO lalu memahami kegunaan dari visibility dalam PBO kemudian juga method pengambilan dan pemasukkan data dalam PBO.
