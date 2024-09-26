package Kuliah.Semester3.PBO.kelas.pertemuan5;

 /*
Nama Program   :Soal3.java
Nama           :Clarisya Adeline
NPM            :140810230017
Kelas          :A
Tanggal        :10 September 2024
Deskripsi      :Soal 3
*/

import java.util.Scanner;

class AnakAyam {
    private int ayam;

    // Constructor dengan parameter
    public AnakAyam(int ayam) {
        this.ayam = ayam;
    }

    // Constructor tanpa parameter (default)
    public AnakAyam() {
        this.ayam = 0;  // Menginisialisasi dengan nilai default
    }

    public void setAyam(int ayam) {
        this.ayam = ayam;
    }

    public int getAyam() {
        return ayam;
    }

    public void inputAyam() {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak anak ayam: ");
        setAyam(input.nextInt());
    }

    public void output() {
        for (int i = getAyam(); i >= 1; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turunlah " + i);
                System.out.println("Mati satu tinggalah " + (i - 1));
            } else {
                System.out.println("Mati satu tinggal induknya.");
            }
        }
    }

}

public class soal3 {
    public static void main(String[] args) {
        // Menggunakan constructor dengan parameter
        AnakAyam jumlah = new AnakAyam(4);
        System.out.println("Output dengan constructor parameter:");
        jumlah.output();

        // Menggunakan setter untuk menetapkan nilai ayam
        AnakAyam banyak = new AnakAyam();
        banyak.setAyam(5);
        System.out.println("\nOutput dengan setter:");
        banyak.output();

        // Input nilai ayam dari pengguna
        AnakAyam anak = new AnakAyam();
        System.out.println("\nOutput dengan input dari pengguna:");
        anak.inputAyam();
        anak.output();
    }
}