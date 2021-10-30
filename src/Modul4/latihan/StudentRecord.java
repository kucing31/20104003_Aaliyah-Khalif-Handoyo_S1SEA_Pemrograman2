package Modul4.latihan;

public class StudentRecord {
    private String name, address;
    private int age;
    private double math, english, science, average;
    private static int studentCount;

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
}
