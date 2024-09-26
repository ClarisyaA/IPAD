package Kuliah.Semester3.PBO.kelas.Petemuan5ril;

import java.util.Scanner;

class Koordinat {
    // Atribut absis (X) dan ordinat (Y)
    private int absis;
    private int ordinat;

    // Constructor untuk inisialisasi koordinat
    public Koordinat(int absis, int ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Getter dan Setter untuk absis dan ordinat
    public int getAbsis() {
        return absis;
    }

    public void setAbsis(int absis) {
        this.absis = absis;
    }

    public int getOrdinat() {
        return ordinat;
    }

    public void setOrdinat(int ordinat) {
        this.ordinat = ordinat;
    }

    // Metode untuk menampilkan koordinat
    public void output() {
        System.out.println("Koordinat Kartesian: (" + absis + ", " + ordinat + ")");
    }

    // Metode untuk menghitung titik tengah antara dua koordinat
    public Koordinat cariTitikTengah(Koordinat other) {
        int tengahAbsis = (this.absis + other.getAbsis()) / 2;
        int tengahOrdinat = (this.ordinat + other.getOrdinat()) / 2;
        return new Koordinat(tengahAbsis, tengahOrdinat);
    }

    // Metode untuk mencari pencerminan terhadap sumbu X
    public Koordinat cerminTerhadapSumbuX() {
        return new Koordinat(this.absis, -this.ordinat);
    }

    // Metode untuk mencari pencerminan terhadap sumbu Y
    public Koordinat cerminTerhadapSumbuY() {
        return new Koordinat(-this.absis, this.ordinat);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input koordinat A
        System.out.print("Masukkan absis A (X): ");
        int x1 = scanner.nextInt();
        System.out.print("Masukkan ordinat A (Y): ");
        int y1 = scanner.nextInt();
        Koordinat A = new Koordinat(x1, y1);

        // Input koordinat B
        System.out.print("Masukkan absis B (X): ");
        int x2 = scanner.nextInt();
        System.out.print("Masukkan ordinat B (Y): ");
        int y2 = scanner.nextInt();
        Koordinat B = new Koordinat(x2, y2);

        // Tampilkan koordinat A dan B
        System.out.println("\nKoordinat A:");
        A.output();
        System.out.println("Koordinat B:");
        B.output();

        // Menghitung dan menampilkan titik tengah
        Koordinat titikTengah = A.cariTitikTengah(B);
        System.out.println("\nTitik tengah antara A dan B:");
        titikTengah.output();

        // Pencerminan terhadap sumbu X dan Y untuk A
        System.out.println("\nPencerminan A terhadap sumbu X:");
        Koordinat cerminX = A.cerminTerhadapSumbuX();
        cerminX.output();

        System.out.println("Pencerminan A terhadap sumbu Y:");
        Koordinat cerminY = A.cerminTerhadapSumbuY();
        cerminY.output();
    }
}
