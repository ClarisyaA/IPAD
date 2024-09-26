package Kuliah.Semester3.PBO.kelas.Petemuan5ril.fix;

import java.util.Scanner;

class Koordinat {
    private float absis;
    private float ordinat;

    public Koordinat() {
        this.absis = 0;
        this.ordinat = 0;
    }

    public Koordinat(float absis, float ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public void inputKoordinat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan absis: ");
        this.absis = input.nextFloat();
        System.out.print("Masukkan ordinat: ");
        this.ordinat = input.nextFloat();
    }

    public void printKoordinat() {
        System.out.println("Absis: " + absis + ", Ordinat: " + ordinat);
    }

    public void titikTengah1(Koordinat B) {
        this.absis = (this.absis + B.absis) / 2;
        this.ordinat = (this.ordinat + B.ordinat) / 2;
    }

    public Koordinat titikTengah2(Koordinat A) {
        return new Koordinat((A.absis + this.absis) / 2, (A.ordinat + this.ordinat) / 2);
    }

    public void cerminX() {
        this.ordinat = -this.ordinat;
    }

    public Koordinat cerminY() {
        return new Koordinat(-this.absis, this.ordinat);
    }
}

public class Main {
    public static void main(String[] args) {
        Koordinat A = new Koordinat(2, 3);
        Koordinat B = new Koordinat(4, 6);
        Koordinat C = new Koordinat();

        System.out.println("A = (2, 3)");
        System.out.println("B = (4, 6)");
        System.out.println();

        // Titik Tengah
        C.titikTengah1(B);
        System.out.print("Titik Tengah 1 (A dan B): ");
        C.printKoordinat();

        // Titik Tengah (fungsi return)
        Koordinat D = B.titikTengah2(A);
        System.out.print("Titik Tengah 2 (B dan A): ");
        D.printKoordinat();

        // Pencerminan X
        A.cerminX();
        System.out.print("Pencerminan X dari A: ");
        A.printKoordinat();

        // Pencerminan Y
        Koordinat E = A.cerminY();
        System.out.print("Pencerminan Y dari A: ");
        E.printKoordinat();
    }
}
