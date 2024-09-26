package Kuliah.Semester3.PBO.kelas.Pertemuan7.self.mahasiswa;

import java.util.Scanner;

class Mahasiswa {
    private int npm;
    private String nama;

    public Mahasiswa() {
        this.npm = 0;
        this.nama = "";
    }

    public Mahasiswa(int npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    // Setter dan Getter
    public void setNPM(int npm) {
        this.npm = npm;
    }

    public int getNPM() {
        return this.npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void inputMahasiswa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan NPM : ");
        this.npm = input.nextInt();
        input.nextLine(); // Mengkonsumsi newline character
        System.out.print("Masukkan Nama: ");
        this.nama = input.nextLine();
    }

    public void printMahasiswa() {
        System.out.println("NPM = " + this.npm + "\nNama = " + this.nama);
    }
}

public class maha1 {
    public static void main(String[] args) {
        Mahasiswa[] arr;
        arr = new Mahasiswa[5];
        arr[0] = new Mahasiswa(1, "Rudi");
        arr[1] = new Mahasiswa(2, "Ishak");
        arr[2] = new Mahasiswa(3, "Ali");
        arr[3] = new Mahasiswa(4, "Ida");
        arr[4] = new Mahasiswa(5, "Uci");
        // Pencetakan elemen array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element ke " + i + " : "
                    + arr[i].getNPM() + " "
                    + arr[i].getNama());
    }
}
