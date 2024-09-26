package Kuliah.Semester3.PBO.kelas.Pertemuan7.self.mahasiswa;

import java.util.Scanner;

// Class Mahasiswa
class Mahasiswa {
    private int npm;
    private String nama;

    // Constructor tanpa parameter
    public Mahasiswa() {
        this.npm = 0;
        this.nama = "";
    }

    // Constructor dengan parameter
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

    // Method untuk mencetak data mahasiswa
    public void printMahasiswa() {
        System.out.println("NPM: " + this.npm + ", Nama: " + this.nama);
    }
}

// Class LarikMahasiswa
class LarikMahasiswa {
    private Mahasiswa[] mhs;
    private int ukuran;

    // Constructor
    public LarikMahasiswa(int ukuran) {
        this.ukuran = ukuran;
        mhs = new Mahasiswa[ukuran];
        for (int i = 0; i < ukuran; i++) {
            mhs[i] = new Mahasiswa(); // Inisialisasi tiap elemen array
        }
    }

    // Method untuk input data mahasiswa
    public void input() {
        int vNPM;
        String vNama;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ukuran; i++) {
            System.out.println("Data ke-" + (i + 1) + " : ");
            System.out.print("NPM: ");
            vNPM = sc.nextInt();
            sc.nextLine(); // Konsumsi newline
            System.out.print("Nama: ");
            vNama = sc.nextLine();
            mhs[i].setNPM(vNPM);
            mhs[i].setNama(vNama);
        }
        System.out.println();
    }

    // Method untuk mencetak semua data mahasiswa
    public void print() {
        System.out.println("Data Mahasiswa:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            mhs[i].printMahasiswa();
        }
    }
}

// Class utama
public class maha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        // Membuat objek LarikMahasiswa
        LarikMahasiswa larik = new LarikMahasiswa(jumlahMahasiswa);

        // Menginput data mahasiswa
        larik.input();

        // Mencetak data mahasiswa
        larik.print();
    }
}
