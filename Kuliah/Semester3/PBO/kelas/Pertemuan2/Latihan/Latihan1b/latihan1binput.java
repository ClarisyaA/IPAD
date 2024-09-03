/*
Nama Program    : latihan1b.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : mencari nilai rata-rata dari 3 angka
                     Program ini menerima tiga angka sebagai input dari pengguna dan menghitung rata-ratanya.
                     Tampilan Output yang diharapkan adalah,
                        number 1 = <nilai1>
                        number 2 = <nilai2>
                        number 3 = <nilai3>
                        Rata-rata = <rata-rata>
*/

package Latihan.Latihan1b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1binput {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        String input = "";
        int sum = 0;

        try {
            // Loop untuk membaca 3 angka dari pengguna
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
                input = dataIn.readLine();
                numbers[i] = Integer.parseInt(input);
                sum += numbers[i]; // Menambahkan nilai ke total sum
            }

            // Menghitung rata-rata
            double average = sum / 3.0;

            // Menampilkan hasil
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("number " + (i + 1) + " = " + numbers[i]);
            }
            System.out.println("Rata-rata = " + average);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input!");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid! Harap masukkan angka.");
        } finally {
            try {
                dataIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
