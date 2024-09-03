/*
Nama Program    : latihan1b.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : Mencari nilai terbesar
                    Diberikan tiga angka, tuliskan program yang menghasilkan output angka dengan nilai terbesar diantara tiga
                    angka tersebut. Gunakan operator kondisi ?: yang telah dipelajari sebelumnya 
                    (PETUNJUK: Anda akan perlu menggunakan dua set operator ?: untuk memecahkan permasalahan ini).
                    Sebagai contoh, diberikan angka 10, 23 dan 5,
                    Program akan menghasilkan output :
                    number 1 = 10
                    number 2 = 23
                    number 3 = 5
                    Nilai tertingginya adalah angka = 23
*/

package Latihan.Latihan1c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1cInput {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int[] numbers = new int[3];

        try {
            // Input tiga angka dari pengguna
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
                input = dataIn.readLine();
                numbers[i] = Integer.parseInt(input);
            }

            // Menentukan nilai terbesar menggunakan operator ternary
            int terbesar = (numbers[0] > numbers[1])
                           ? ((numbers[0] > numbers[2]) ? numbers[0] : numbers[2])
                           : ((numbers[1] > numbers[2]) ? numbers[1] : numbers[2]);

            // Menampilkan hasil
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("number " + (i + 1) + " = " + numbers[i]);
            }
            System.out.println("Nilai tertingginya adalah angka = " + terbesar);

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
