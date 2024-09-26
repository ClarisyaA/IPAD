/*
Nama Program    : soal 1.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : Program untuk menggabungkan n string input menjadi satu string.
                  Jika ada string kosong, program menampilkan pesan error.
*/

package Kuliah.Semester3.PBO.Praktikum.Tugas1;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan jumlah string yang akan diinput
        System.out.print("Masukkan jumlah string yang akan diinput (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Mengambil enter setelah input angka
        
        String[] inputs = new String[n];
        boolean adaStringKosong = false;
        
        // Meminta pengguna memasukkan string satu per satu
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan string ke-" + (i + 1) + ": ");
            inputs[i] = scanner.nextLine();
            if (inputs[i].isEmpty()) {
                adaStringKosong = true;
            }
        }
        
        if (adaStringKosong) {
            System.out.println("Error, ada string kosong");
        } else {
            String gabunganString = "";
            for (String s : inputs) {
                gabunganString = gabunganString.concat(s).concat(" ");
            }
            gabunganString = gabunganString.trim();
            
            System.out.println(gabunganString); // Cetak gabungan string
            System.out.println(gabunganString.toUpperCase().replaceAll(" ", "")); // Cetak dalam huruf kapital tanpa spasi
        }
        
        scanner.close(); // Menutup scanner
    }
}
