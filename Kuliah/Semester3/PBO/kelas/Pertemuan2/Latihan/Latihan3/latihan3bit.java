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

public class latihan3bit {
    public static void main(String[] args) {
        // Mendeklarasikan variabel a dan b dengan nilai yang diberikan
        int a = 53;  // dalam biner: 00110101
        int b = 19;  // dalam biner: 00010011

        // Melakukan operasi bitwise
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int shiftLeft = a << 2;
        int shiftRight = b >> 1;

        // Menampilkan hasil operasi dalam format 8-bit
        System.out.println("a = " + a + " (biner: " + formatTo8Bits(a) + ")");
        System.out.println("b = " + b + " (biner: " + formatTo8Bits(b) + ")");
        System.out.println("a & b = " + and + " (biner: " + formatTo8Bits(and) + ")");
        System.out.println("a | b = " + or + " (biner: " + formatTo8Bits(or) + ")");
        System.out.println("a ^ b = " + xor + " (biner: " + formatTo8Bits(xor) + ")");
        System.out.println("a << 2 = " + shiftLeft + " (biner: " + formatTo8Bits(shiftLeft) + ")");
        System.out.println("b >> 1 = " + shiftRight + " (biner: " + formatTo8Bits(shiftRight) + ")");
    }

    // Fungsi untuk memformat integer ke string 8-bit biner
    public static String formatTo8Bits(int value) {
        // Mengubah nilai menjadi biner
        String binaryString = Integer.toBinaryString(value);
        // Menambahkan leading zeros agar panjang string biner 8-bit
        String formattedBinaryString = String.format("%8s", binaryString).replace(' ', '0');
        // Mengambil hanya 8 bit terakhir jika panjang lebih dari 8 bit
        return formattedBinaryString.length() > 8 ? formattedBinaryString.substring(formattedBinaryString.length() - 8) : formattedBinaryString;
    }
}
