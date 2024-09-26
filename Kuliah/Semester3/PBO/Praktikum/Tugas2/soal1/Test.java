/*
Nama Program    : soal 1.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Rabu, 11 September 2024
Deskripsi       : Program inputOutput aritmatika dengan 2 package util & io
*/

package Kuliah.Semester3.PBO.Praktikum.Tugas2.soal1;
import Kuliah.Semester3.PBO.Praktikum.Tugas2.soal1.util.operasi;
import Kuliah.Semester3.PBO.Praktikum.Tugas2.soal1.io.inputOutput;

public class Test {

    public static void main(String[] args) {
        inputOutput io = new inputOutput();
        operasi aritmatika = new operasi();

        int num1 = io.inputAngka("Masukkan Nilai ke - 1 : ");
        char op = io.operasiAngka();
        int num2 = io.inputAngka("Masukkan Nilai ke - 2 : ");

        int hasil = 0;

        switch (op) {
            case '+':
                hasil = aritmatika.tambah(num1, num2);
                break;
            
            case '-':
                hasil = aritmatika.kurang(num1, num2);
                break;
            
            case '/':
                hasil = aritmatika.bagi(num1, num2);
                break;
            
            case '*':
                hasil = aritmatika.kali(num1, num2);
                break;

            default:
                System.err.println("Operator tidak valid!");
                return;
        }

       io.output(num1, num2, hasil, op);
    }
}