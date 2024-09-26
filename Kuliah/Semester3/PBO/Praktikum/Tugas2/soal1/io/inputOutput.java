/*
Nama Program    : soal 1.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Rabu, 11 September 2024
Deskripsi       : Program inputOutput aritmatika dengan 2 package util & io
*/

package Kuliah.Semester3.PBO.Praktikum.Tugas2.soal1.io;

import java.util.Scanner;
import Kuliah.Semester3.PBO.Praktikum.Tugas2.soal1.util.operasi;

public class inputOutput {
    private Scanner input = new Scanner(System.in);

    public int inputAngka(String kata){
        System.out.print(kata);
        return input.nextInt();

    }

    public char operasiAngka(){
        System.out.print("Operasi Hitung(+, -, /, *): ");
        return input.next().charAt(0);
    }

    public void output(int num1, int num2, int hasil, char op){
        System.out.println(num1 + " " + op + " " + num2 + " = " + hasil);
    }
}
