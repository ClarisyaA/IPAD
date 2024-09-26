package Kuliah.Semester3.PBO.Praktikum.Tugas1;

// Import kelas Scanner dari paket java.util untuk membaca input dari keyboard
import java.util.Scanner;

public class test1 {
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
