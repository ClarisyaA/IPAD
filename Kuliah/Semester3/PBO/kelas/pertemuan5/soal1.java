package Kuliah.Semester3.PBO.kelas.pertemuan5;

/*
 Nama Program   :Soal1.java
 Nama           :Clarisya Adeline
 NPM            :140810230017
 Kelas          :A
 Tanggal        :12 September 2024
 Deskripsi      :Soal 1 dengan Enkapsulasi 2 Class (dengan Setter, Getter, dan Constructor)
*/

import java.util.Scanner;

class Perhitungan {
    private int n;
    private int r;

    // Constructor dengan parameter
    public Perhitungan(int n, int r) {
        this.n = n;
        this.r = r;
    }

    // Constructor tanpa parameter
    public Perhitungan() {
        this.n = 0;
        this.r = 0;
    }

    // Setter untuk nilai n
    public void setN(int n) {
        this.n = n;
    }

    // Setter untuk nilai r
    public void setR(int r) {
        this.r = r;
    }

    // Getter untuk nilai n
    public int getN() {
        return n;
    }

    // Getter untuk nilai r
    public int getR() {
        return r;
    }

    // Method untuk menghitung faktorial
    public static long faktorial(int nilai) {
        long hasil = 1;
        for (int i = 2; i <= nilai; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // Method untuk menghitung faktorial menggunakan getter
    public long faktorial() {
        return faktorial(getN());
    }

    // Method untuk menghitung kombinasi menggunakan getter
    public long kombinasi() {
        return faktorial(getN()) / (faktorial(getN() - getR()) * faktorial(getR()));
    }

    // Method untuk output hasil
    public void output(String perhitungan, long hasil) {
        System.out.println("Hasil " + perhitungan + ": " + hasil);
    }
}

public class soal1 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        Perhitungan hitung = new Perhitungan();

        // Menghitung faktorial dan kombinasi dengan nilai tetap melalui constructor
        System.out.println("Contoh perhitungan langsung dengan constructor parameter:");
        Perhitungan hitung1 = new Perhitungan(5, 3);
        long hasilFakt1 = hitung1.faktorial();
        long hasilKomb1 = hitung1.kombinasi();
        hitung1.output("Faktorial 5", hasilFakt1);
        hitung1.output("Kombinasi C(5, 3)", hasilKomb1);

        // Menggunakan setter untuk input nilai
        System.out.println("\nOutput dengan setter (n=6, r=2):");
        Perhitungan hitung2 = new Perhitungan();
        hitung2.setN(6);
        hitung2.setR(2);
        long hasilFakt2 = hitung2.faktorial();
        long hasilKomb2 = hitung2.kombinasi();
        hitung2.output("Faktorial 6", hasilFakt2);
        hitung2.output("Kombinasi C(6, 2)", hasilKomb2);

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
                    int nilaiFakt = input.nextInt();
                    hitung.setN(nilaiFakt); // Menggunakan setter untuk nilai faktorial
                    long hasilFak = hitung.faktorial();
                    hitung.output("Faktorial", hasilFak);
                    break;
                case 2:
                    System.out.print("Masukkan nilai n: ");
                    int n = input.nextInt();
                    hitung.setN(n);

                    System.out.print("Masukkan nilai r: ");
                    int r = input.nextInt();
                    hitung.setR(r);

                    long hasilKom = hitung.kombinasi();
                    hitung.output("Kombinasi", hasilKom);
                    break;
                case 3:
                    System.out.println("Selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}