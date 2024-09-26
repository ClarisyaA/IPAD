import java.util.Scanner;

class Perjalanan {
    // Variables for departure and arrival
    private int tglhari1, bulan1, tahun1, jam1, menit1, detik1;
    private int tglhari2, bulan2, tahun2, jam2, menit2, detik2;

    // Constructor with arguments
    public Perjalanan(int tglhari1, int bulan1, int tahun1, int jam1, int menit1, int detik1, 
                      int tglhari2, int bulan2, int tahun2, int jam2, int menit2, int detik2) {
        this.tglhari1 = tglhari1;
        this.bulan1 = bulan1;
        this.tahun1 = tahun1;
        this.jam1 = jam1;
        this.menit1 = menit1;
        this.detik1 = detik1;
        this.tglhari2 = tglhari2;
        this.bulan2 = bulan2;
        this.tahun2 = tahun2;
        this.jam2 = jam2;
        this.menit2 = menit2;
        this.detik2 = detik2;
    }

    // Method to calculate the difference between the dates and times
    public void hitungSelisih() {
        int totalDetikBerangkat = detik1 + menit1 * 60 + jam1 * 3600 + tglhari1 * 86400;
        int totalDetikKedatangan = detik2 + menit2 * 60 + jam2 * 3600 + tglhari2 * 86400;

        int selisihDetik = totalDetikKedatangan - totalDetikBerangkat;

        int selisihHari = selisihDetik / 86400;
        selisihDetik %= 86400;

        int selisihJam = selisihDetik / 3600;
        selisihDetik %= 3600;

        int selisihMenit = selisihDetik / 60;
        selisihDetik %= 60;

        // Output the difference
        System.out.println("Lama Perjalanan: " + selisihHari + " hari " + selisihJam + " jam " + selisihMenit + " menit " + selisihDetik + " detik.");
    }
}

public class MainPerjalanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for departure
        System.out.println("Masukkan data waktu keberangkatan:");
        System.out.print("Tanggal: ");
        int tglhari1 = scanner.nextInt();
        System.out.print("Bulan: ");
        int bulan1 = scanner.nextInt();
        System.out.print("Tahun: ");
        int tahun1 = scanner.nextInt();
        System.out.print("Jam: ");
        int jam1 = scanner.nextInt();
        System.out.print("Menit: ");
        int menit1 = scanner.nextInt();
        System.out.print("Detik: ");
        int detik1 = scanner.nextInt();

        // Input for arrival
        System.out.println("Masukkan data waktu kedatangan:");
        System.out.print("Tanggal: ");
        int tglhari2 = scanner.nextInt();
        System.out.print("Bulan: ");
        int bulan2 = scanner.nextInt();
        System.out.print("Tahun: ");
        int tahun2 = scanner.nextInt();
        System.out.print("Jam: ");
        int jam2 = scanner.nextInt();
        System.out.print("Menit: ");
        int menit2 = scanner.nextInt();
        System.out.print("Detik: ");
        int detik2 = scanner.nextInt();

        // Create Perjalanan object and calculate the difference
        Perjalanan perjalanan = new Perjalanan(tglhari1, bulan1, tahun1, jam1, menit1, detik1, 
                                               tglhari2, bulan2, tahun2, jam2, menit2, detik2);
        perjalanan.hitungSelisih();
    }
}
