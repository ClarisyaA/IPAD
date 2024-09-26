import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();
        
        // Input sisi persegi
        System.out.print("Masukkan sisi persegi: ");
        double side = scanner.nextDouble();
        
        // Input jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();
        
        // Membuat objek Area1, Area2, dan Area3
        Area1 area1 = new Area1();
        Area2 area2 = new Area2();
        Area3 area3 = new Area3();
        
        // Menghitung dan menampilkan hasil
        System.out.println("Luas persegi panjang: " + area1.CalculateArea(length, width));
        System.out.println("Luas persegi: " + area2.CalculateArea(side));
        System.out.println("Luas lingkaran: " + area3.CalculateArea(radius));
        
        scanner.close();
    }
}
