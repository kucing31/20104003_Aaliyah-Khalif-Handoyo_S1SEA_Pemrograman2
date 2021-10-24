package Modul0.percobaan;
import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int var_a;
        int var_b;
        System.out.println("Masukkan nilai var_a : ");
        var_a = masukkan.nextInt();
        System.out.println("Masukkan nilai var_b : ");
        var_b = masukkan.nextInt();
        System.out.println("Variabel yang terdapat dalam program");
        System.out.println("var_a : " + var_a);
        System.out.println("var_b : " + var_b);
    }


}
