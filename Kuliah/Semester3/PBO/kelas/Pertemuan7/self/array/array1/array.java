package Kuliah.Semester3.PBO.kelas.Pertemuan7.self.array.array1;

import java.util.Scanner;

class MyLarik {
    // atribut
    private int ukuran; // ukuran array / larik
    private int[] nilai; // buat elemen array

    // constructor
    public MyLarik() {
        ukuran = 10;
        nilai = new int[ukuran];
    }

    public MyLarik(int ukuran) {
        this.ukuran = ukuran;
        nilai = new int[ukuran];
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
        nilai = new int[ukuran]; // Menyusun kembali array dengan ukuran baru
    }

    public void inputUkuran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran larik: ");
        this.ukuran = input.nextInt();
        nilai = new int[ukuran]; // Menyusun kembali array dengan ukuran baru
    }

    public void isiLarik() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " = ");
            nilai[i] = input.nextInt();
        }
    }

    public float cariRata() {
        float jumlah = 0;
        for (int i = 0; i < ukuran; i++) {
            jumlah = jumlah + nilai[i];
        }
        return (jumlah / ukuran);
    }

    public int nilaiMax() {
        int tertinggi = nilai[0]; // Ambil nilai pertama sebagai pembanding awal
        for (int i = 1; i < ukuran; i++) { // Mulai dari indeks ke-1
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
        }
        return (tertinggi);
    }

    public void cetakLarik() {
        System.out.println("Pencetakan Larik");
        for (int i = 0; i < ukuran; i++) {
            System.out.println("Nilai ke-" + (i + 1) + "= " + nilai[i]);
        }
    }

    public void cetakProses() {
        System.out.println("Rata-rata = " + cariRata());
        System.out.println("Nilai Tertinggi = " + nilaiMax());
    }
}

public class array {
    // public static void main(String[] args) {
    //     MyLarik A = new MyLarik();
    //     System.out.println("Input Larik A");
    //     A.inputUkuran(); // Meminta pengguna untuk memasukkan ukuran larik
    //     A.isiLarik();
    //     A.cetakLarik();
    //     System.out.println("Rata-rata = " + A.cariRata());
    //     System.out.println("Nilai Tertinggi = " + A.nilaiMax());
    // }

    // static int inputInt(String pesan) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print(pesan);
    //     int hasilInput = input.nextInt();
    //     return (hasilInput);
    // }
        public static void main(String[] args) {
            MyLarik A = new MyLarik();
            System.out.println("Input Larik A");
            int nData = inputInt("Masukkan ukuran Larik: ");
            System.out.println("Ukuran yang dimasukkan: " + nData);
            A.setUkuran(nData);
            A.isiLarik();
            System.out.println();
            A.cetakLarik();
            System.out.println("Rata-rata = " + A.cariRata());
            System.out.println("Nilai Tertinggi = " + A.nilaiMax());
        }
    
        static int inputInt(String pesan) {
            Scanner input = new Scanner(System.in);
            System.out.print(pesan);
            int hasilInput = input.nextInt();
            return (hasilInput);
        }
    
    
}
