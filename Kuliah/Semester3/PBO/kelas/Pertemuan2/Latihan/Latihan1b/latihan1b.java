/*
Nama Program    : latihan1b.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : mencari nilai rata-rata dari 3 angka
                     Buatlah program yang menghasilkan output nilai rata-rata dari tiga angka. 
                     Nilai dari masing-masing tiga angka tersebut adalah 10, 20 dan 45. 
                     Tampilan Output yang diharapkan adalah,
                        number 1 = 10
                        number 2 = 20
                        number 3 = 45
                        Rata-rata = 25
*/


package Latihan.Latihan1b;

public class latihan1b {
    public static void main(String args[]){
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        
        double rataRata = (number1 + number2 + number3) / 3.00;

        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Rata-Rata = " + rataRata);
    }
}
