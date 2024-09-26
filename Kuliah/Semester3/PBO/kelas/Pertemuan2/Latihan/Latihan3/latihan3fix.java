/*
Nama Program    : latihan3.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       :  Diketahui a=53, b=19 (format 8 bit)
                    Tentukan hasil
                    a&b,
                    a|b,
                    a^b,
                    a<<2,
                    b>>1
*/

package Latihan.Latihan3;

public class latihan3fix {

    // Fungsi untuk mengonversi integer ke representasi biner 8 bit
    public static String keBiner8Bit(int number) {
        // Membuat array karakter dengan panjang 8 untuk menyimpan hasil biner
        char[] binary = new char[8];

        // Mengisi array dari bit paling kanan ke bit paling kiri
        for (int i = 7; i >= 0; i--) {
            // Mengambil nilai bit ke-i dari kanan dengan operasi AND dan shifting
            binary[i] = (number & 1) == 1 ? '1' : '0';
            // Geser angka ke kanan satu bit untuk memproses bit selanjutnya
            number >>= 1;
        }

        // Mengubah array karakter menjadi string dan mengembalikan hasilnya
        return new String(binary);
    }

    public static void main(String[] args) {
        // Mendeklarasikan variabel a dan b dengan nilai yang diberikan
        int a = 53;  // dalam biner: 00110101
        int b = 19;  // dalam biner: 00010011

        // Melakukan operasi bitwise AND
        //     a = 00110101
        //     b = 00010011
        //     --------------
        // a & b = 00010001
        int and = a & b;

        // Melakukan operasi bitwise OR
        //     a = 00110101
        //     b = 00010011
        //     --------------
        // a | b = 00110111
        int or = a | b;

        // Melakukan operasi bitwise XOR
        //     a = 00110101
        //     b = 00010011
        //     --------------
        // a ^ b = 00100110
        int xor = a ^ b;

        // Melakukan operasi bitwise left shift pada a
        //      a = 00110101
        // a << 2 = 11010100
        int shiftLeft = a << 2;

        // Melakukan operasi bitwise right shift pada b
        //      b = 00010011
        // b >> 1 = 00001001
        int shiftRight = b >> 1;

        // Menampilkan hasil operasi dengan representasi biner 8 bit
        System.out.println("a = " + a + " (biner: " + keBiner8Bit(a) + ")");
        System.out.println("b = " + b + " (biner: " + keBiner8Bit(b) + ")");
        System.out.println("a & b = " + and + " (biner: " + keBiner8Bit(and) + ")");
        System.out.println("a | b = " + or + " (biner: " + keBiner8Bit(or) + ")");
        System.out.println("a ^ b = " + xor + " (biner: " + keBiner8Bit(xor) + ")");
        System.out.println("a << 2 = " + shiftLeft + " (biner: " + keBiner8Bit(shiftLeft) + ")");
        System.out.println("b >> 1 = " + shiftRight + " (biner: " + keBiner8Bit(shiftRight) + ")");
    }
}
