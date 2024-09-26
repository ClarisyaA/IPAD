package Kuliah.Semester3.PBO.kelas.Pertemuan3.soal1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
/*
 Nama Program   :Soal1.java
 Nama           :Clarisya Adeline
 NPM            :140810230017
 Kelas          :A
 Tanggal        :29 Agustus 2024
 Deskripsi      :Soal 1
*/

import java.util.Scanner;

public class Soal1 {

    public static int[] input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = input.nextInt();
        return new int[]{n, r};
    }

    public static long faktorial(int nilai) {
        long hasil = 1;
        for (int i = 2; i <= nilai; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static long kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(n - r) * faktorial(r));
    }

    public static void output(String perhitungan, long hasil) {
        System.out.println("Hasil " + perhitungan + ": " + hasil);
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cari Faktorial");
            System.out.println("2. Cari Kombinasi");
            System.out.println("3. Selesai");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nilai untuk faktorial: ");
                    int nilai = input.nextInt();
                    long hasilFak = faktorial(nilai);
                    output("Faktorial", hasilFak);
                    break;
                case 2:
                    int[] nil = input();
                    long hasilKom = kombinasi(nil[0], nil[1]);
                    output("Kombinasi", hasilKom);
                    break;
                case 3:
                    System.out.println("Selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
