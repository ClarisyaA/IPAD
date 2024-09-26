package Kuliah.Semester3.PBO.Praktikum.Pertemuan3;

public class Main {
    public static void main(String[] args) {
        // buat objek vehicle
        Vehicle vehicle = new Vehicle("Merah", 4);
        System.out.println("=== Vehicle ===");
        System.out.println("Warna: " + vehicle.getWarna());
        System.out.println("Jumlah Roda: " + vehicle.getJmlRoda());
        
        // buat mobil
        Mobil mobil = new Mobil("Biru", 4, "Bensin", 1500);
        System.out.println("\n=== Mobil ===");
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Jumlah Roda: " + mobil.getJmlRoda());
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " cc");

        // buat truk
        Truk truk = new Truk("Hijau", 6, "Solar", 3000, 10000);
        System.out.println("\n=== Truk ===");
        System.out.println("Warna: " + truk.getWarna());
        System.out.println("Jumlah Roda: " + truk.getJmlRoda());
        System.out.println("Bahan Bakar: " + truk.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk.getKapasitasMesin() + " cc");
        System.out.println("Muatan Maksimum: " + truk.getMuatanMaks() + " kg");
    }
}