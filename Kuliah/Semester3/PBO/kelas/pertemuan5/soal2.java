package Kuliah.Semester3.PBO.kelas.pertemuan5;

/*
 Nama Program   :Soal2.java
 Nama           :Clarisya Adeline
 NPM            :140810230017
 Kelas          :A
 Tanggal        :12 September 2024
 Deskripsi      :Soal 2 dengan Setter dan Getter untuk Input/Output Dalam dan Luar
*/
import java.util.Scanner;

class Asterik {
    private int tinggi;

    // Constructor dengan parameter
    public Asterik(int tinggi) {
        this.tinggi = tinggi;
    }

    // Constructor tanpa parameter (default)
    public Asterik() {
        this.tinggi = 0;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void inputTinggi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        setTinggi(input.nextInt());
    }

    public void output() {
        // Bagian atas segitiga
        for (int i = 0; i < getTinggi(); i++) {
            for (int j = 0; j < getTinggi() - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        // Bagian bawah segitiga
        for (int i = 1; i < getTinggi(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class soal2 {
    public static void main(String[] args) {
        // Output dengan constructor parameter
        Asterik segitiga1 = new Asterik(3);
        System.out.println("Output dengan constructor parameter (tinggi 3):");
        segitiga1.output();

        // Output dengan setter
        Asterik segitiga2 = new Asterik();
        segitiga2.setTinggi(5);
        System.out.println("\nOutput dengan setter (tinggi 5):");
        segitiga2.output();

        // Output dengan input dari pengguna
        Asterik segitiga3 = new Asterik();
        System.out.println("\nOutput dengan input dari pengguna:");
        segitiga3.inputTinggi();
        segitiga3.output();
    }
}