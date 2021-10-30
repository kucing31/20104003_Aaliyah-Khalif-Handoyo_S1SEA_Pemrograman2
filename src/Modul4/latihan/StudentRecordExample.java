package Modul4.latihan;

public class StudentRecordExample {
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
}
