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

public class latihan1c {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;

        int terbesar = (number1 > number2) ? 
                       (number1 > number3) ? number1 : number3 : 
                       (number2 > number3) ? number2 : number3;

        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + terbesar);

    }
    
}
