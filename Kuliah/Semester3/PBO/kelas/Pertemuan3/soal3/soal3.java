package Kuliah.Semester3.PBO.kelas.Pertemuan3.soal3;

/*
 Nama Program   :Soal3.java
 Nama           :Clarisya Adeline
 NPM            :140810230017
 Kelas          :A
 Tanggal        :10 September 2024
 Deskripsi      :Soal 3
*/

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak anak ayam: ");
        int ayam = input.nextInt(); 

        for (int i = ayam; i >= 1; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turunlah " + i);
                System.out.println("Mati Satu tinggalah " + (i-1));
            }
            else{
                System.out.println("Mati Satu tinggal induknya.");
            }
            
        }
        input.close();
    }
}
