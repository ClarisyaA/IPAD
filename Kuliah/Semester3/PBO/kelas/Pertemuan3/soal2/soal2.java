package Kuliah.Semester3.PBO.kelas.Pertemuan3.soal2;

/*
 Nama Program   :Soal2.java
 Nama           :Clarisya Adeline
 NPM            :140810230017
 Kelas          :A
 Tanggal        :10 September 2024
 Deskripsi      :Soal 2
*/

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Baris: ");
        int tinggi = input.nextInt(); // Misalnya tinggi = 3
        
        // Total baris = tinggi * 2 - 1 => (5)
        for (int i = 0; i < tinggi * 2 - 1; i++) {
            // Mengatur jumlah bintang pada setiap baris berdasarkan kondisi
            for (int j = 0; j < tinggi; j++) {
                // Jika baris i < tinggi (sebelum atau di tengah)
                if (i < tinggi) { 
                    if (j < tinggi - i) { // 
                        System.out.print("*");
                    }
                } 
                // Jika baris i >= tinggi (setelah tengah)
                else {
                    if (j < i - tinggi + 2) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
        
        input.close();
    }
}
