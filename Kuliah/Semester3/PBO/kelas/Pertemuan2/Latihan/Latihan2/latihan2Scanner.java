/*
Nama Program    : latihan2.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : Buatlah program untuk mencari luas,
                    keliling dan nilai diagonal persegi panjang
                    ◼ Gunakan input keyboard (scanner)
                    ◼ Tampilan :
                     Masukkan panjang : 5
                     Masukkan lebar : 2
                     Keliling Persegi Panjang : 14
                     dst
*/

package Latihan.Latihan2;

// Import kelas Scanner dari paket java.util untuk membaca input dari keyboard
import java.util.Scanner;

public class latihan2Scanner {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        try {
            // Mendapatkan pemisah baris sesuai dengan sistem operasi
            String newLine = System.lineSeparator();
            
            // Menampilkan pesan ke pengguna
            System.out.println("Mencari Luas, Keliling, dan Nilai Diagonal Persegi Panjang");
            
            // Meminta input dari pengguna untuk panjang dan membaca nilai integer
            System.out.print("Masukkan Panjang (integer) : ");
            int panjang = input.nextInt();

            // Meminta input dari pengguna untuk lebar dan membaca nilai integer
            System.out.print("Masukkan Lebar (integer) : ");
            int lebar = input.nextInt();

            // Menghitung luas persegi panjang
            int luas = panjang * lebar;

            // Menghitung keliling persegi panjang
            int keliling = 2 * (panjang + lebar);

            // Menghitung diagonal persegi panjang menggunakan rumus Pythagoras
            double diagonal = Math.sqrt(panjang * panjang + lebar * lebar);  // Menghitung diagonal
            
            // Menampilkan baris kosong untuk pemisah
            System.out.println(newLine);

            // Menampilkan hasil perhitungan luas
            System.out.println("Luas Persegi Panjang = " + luas);
            
            // Menampilkan hasil perhitungan keliling
            System.out.println("Keliling Persegi Panjang = " + keliling);
            
            // Menampilkan hasil perhitungan diagonal
            System.out.println("Diagonal Persegi Panjang = " + diagonal);
            System.out.println(newLine);

        } finally {
            // Menutup objek Scanner untuk menghindari kebocoran sumber daya
            input.close();
        }
    }
}
