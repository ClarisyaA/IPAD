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

public class latihan3 {
    public static void main(String[] args) {
        // Mendeklarasikan variabel a dan b dengan nilai yang diberikan
        int a = 53;  // dalam biner: 00110101
        int b = 19;  // dalam biner: 00010011

        // Melakukan operasi bitwise AND
        int and = a & b;
        // Melakukan operasi bitwise OR
        int or = a | b;
        // Melakukan operasi bitwise XOR
        int xor = a ^ b;
        // Melakukan operasi bitwise left shift pada a
        int shiftLeft = a << 2;
        // Melakukan operasi bitwise right shift pada b
        int shiftRight = b >> 1;

        // Menampilkan hasil operasi
        System.out.println("a = " + a + " (biner: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (biner: " + Integer.toBinaryString(b) + ")");
        System.out.println("a & b = " + and + " (biner: " + Integer.toBinaryString(and) + ")");
        System.out.println("a | b = " + or + " (biner: " + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b = " + xor + " (biner: " + Integer.toBinaryString(xor) + ")");
        System.out.println("a << 2 = " + shiftLeft + " (biner: " + Integer.toBinaryString(shiftLeft) + ")");
        System.out.println("b >> 1 = " + shiftRight + " (biner: " + Integer.toBinaryString(shiftRight) + ")");
    }
}
