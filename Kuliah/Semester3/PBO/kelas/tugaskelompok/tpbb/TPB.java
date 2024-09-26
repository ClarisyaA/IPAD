package Kuliah.Semester3.PBO.kelas.tugaskelompok.tpbb;

/*
Anggota Kelompok    :   - Clarisya Adeline (140810230017)  
                        - Nazwa Nashatasya (140810230019)
                        - Ammara Azwadiena Alfiantie (140810230073)
Kelas               : A
Tanggal             : Minggu, 22 September 2024
Deskripsi           : SOAL 1 Java

Nilai dan Lama Ujian TPB Lari 3 keliling lapangan bola (2 class)
Input : Nama, NPM, waktu mulai, waktu selesai
Berikan juga status “lulus” pada output A, B, C; selain itu beri status : “gagal”

Tentukan dan tampilkan juga hasil huruf mutu dengan ketentuan :
0 menit 	<= lama  <    7.5 menit	    : HM = “A”, status = “Lulus”
7.5 menit 	<= lama  <    12.5 menit	: HM = “B”, status = “Lulus”
12.5 menit 	<= lama  <    30 menit		: HM = “C”, status = “Lulus”
30 menit 	<= lama 			        : HM = “D”, status = “gagal”
Hitung lama Ujian lari
Tampilkan : Nama, NPM, HM, status lulus, waktu mulai, waktu selesai dan lama lari
*/
import java.util.Scanner;

class NilaiLari {
    private String nama;
    private String npm;
    private int jamMulai, menitMulai, detikMulai;
    private int jamSelesai, menitSelesai, detikSelesai;

    public NilaiLari(String nama, String npm, int jamMulai, int menitMulai, int detikMulai, int jamSelesai, int menitSelesai, int detikSelesai) {
        this.nama = nama;
        this.npm = npm;
        this.jamMulai = jamMulai;
        this.menitMulai = menitMulai;
        this.detikMulai = detikMulai;
        this.jamSelesai = jamSelesai;
        this.menitSelesai = menitSelesai;
        this.detikSelesai = detikSelesai;
    }

    public NilaiLari() {
        nama = "";
        npm = "";
        jamMulai = 0;
        menitMulai = 0;
        detikMulai = 0;
        jamSelesai = 0;
        menitSelesai = 0;
        detikSelesai = 0;
    }

    // Getter dan Setter
    public String getNama() { 
        return this.nama; 
    }

    public void setNama(String nama) {
         this.nama = nama; 
    }

    public String getNpm() { 
        return this.npm; 
    }

    public void setNpm(String npm) { 
        this.npm = npm; 
    }

    public int getJamMulai() { 
        return this.jamMulai; 
    }

    public void setJamMulai(int jam) { 
        this.jamMulai = jam; 
    }

    public int getMenitMulai() { 
        return this.menitMulai; 
    }

    public void setMenitMulai(int menit) { 
        this.menitMulai = menit; 
    }

    public int getDetikMulai() { 
        return this.detikMulai; 
    }

    public void setDetikMulai(int detik) { 
        this.detikMulai = detik; 
    }

    public int getJamSelesai() { 
        return this.jamSelesai; 
    }

    public void setJamSelesai(int jam) { 
        this.jamSelesai = jam; 
    }

    public int getMenitSelesai() { 
        return this.menitSelesai; 
    }

    public void setMenitSelesai(int menit) { 
        this.menitSelesai = menit; 
    }

    public int getDetikSelesai() { 
        return this.detikSelesai; 
    }

    public void setDetikSelesai(int detik) { 
        this.detikSelesai = detik; 
    }

    public int hitungWaktuMulai() {
        return jamMulai * 3600 + menitMulai * 60 + detikMulai;
    }

    public int hitungWaktuSelesai() {
        return jamSelesai * 3600 + menitSelesai * 60 + detikSelesai;
    }

    public int hitungDurasi() {
        return hitungWaktuSelesai() - hitungWaktuMulai();
    }

    public int getDurasiJam() {
        return hitungDurasi() / 3600;
    }

    public int getDurasiMenit() {
        return (hitungDurasi() % 3600) / 60;
    }

    public int getDurasiDetik() {
        return hitungDurasi() % 60;
    }

    public String getHurufMutu() {
        double durasiMenit = hitungDurasi() / 60.0;
        if (durasiMenit < 7.5) {
            return "A";
        } else if (durasiMenit < 12.5) {
            return "B";
        } else if (durasiMenit < 30) {
            return "C";
        } else {
            return "D";
        }
    }

    public String getStatusLulus() {
        String hurufMutu = getHurufMutu();
        return (hurufMutu.equals("A") || hurufMutu.equals("B") || hurufMutu.equals("C")) ? "Lulus" : "Gagal";
    }

    public void tampilkanHasil() {
        int durasi = hitungDurasi();
        int durasiJam = durasi / 3600;
        int durasiMenit = (durasi % 3600) / 60;
        int durasiDetik = durasi % 60;

        System.out.println("\nNama: " + getNama());
        System.out.println("NPM: " + getNpm());
        System.out.printf("Waktu Mulai: %02d:%02d:%02d%n", getJamMulai(), getMenitMulai(), getDetikMulai());
        System.out.printf("Waktu Selesai: %02d:%02d:%02d%n", getJamSelesai(), getMenitSelesai(), getDetikSelesai());
        System.out.printf("Durasi: %d Jam %d Menit %d Detik%n", durasiJam, durasiMenit, durasiDetik);
        System.out.println("Huruf Mutu: " + getHurufMutu());
        System.out.println("Status Kelulusan: " + getStatusLulus());
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        setNama(scanner.nextLine());
        System.out.print("Masukkan NPM: ");
        setNpm(scanner.nextLine());

        System.out.print("Masukkan Jam Mulai: ");
        setJamMulai(scanner.nextInt());
        System.out.print("Masukkan Menit Mulai: ");
        setMenitMulai(scanner.nextInt());
        System.out.print("Masukkan Detik Mulai: ");
        setDetikMulai(scanner.nextInt());

        System.out.print("Masukkan Jam Selesai: ");
        setJamSelesai(scanner.nextInt());
        System.out.print("Masukkan Menit Selesai: ");
        setMenitSelesai(scanner.nextInt());
        System.out.print("Masukkan Detik Selesai: ");
        setDetikSelesai(scanner.nextInt());
    }
}

public class TPB {
    public static void main(String[] args) {
        NilaiLari method1 = new NilaiLari("Yono", "140810230001", 20, 20, 20, 20, 30, 45);
        NilaiLari method2 = new NilaiLari();
        NilaiLari method3 = new NilaiLari();
        int pilihan, pilihanInput, pilihanOutput;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n==Menu Utama==");
            System.out.println("1. Input Data");
            System.out.println("2. Cetak Data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    do {
                        System.out.println("\n==Menu Input Data==");
                        System.out.println("1. Input Data via constructor");
                        System.out.println("2. Input dari luar class");
                        System.out.println("3. Input dari dalam class");
                        System.out.println("0. Keluar");
                        System.out.print("Pilihan: ");
                        pilihanInput = scanner.nextInt();

                        switch (pilihanInput) {
                            case 1:
                                System.out.println("DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR");
                                break;
                            case 2:
                                scanner.nextLine(); 
                                System.out.print("Masukkan Nama: ");
                                method2.setNama(scanner.nextLine());
                                System.out.print("Masukkan NPM: ");
                                method2.setNpm(scanner.nextLine());
                                System.out.print("Masukkan Jam Mulai: ");
                                method2.setJamMulai(scanner.nextInt());
                                System.out.print("Masukkan Menit Mulai: ");
                                method2.setMenitMulai(scanner.nextInt());
                                System.out.print("Masukkan Detik Mulai: ");
                                method2.setDetikMulai(scanner.nextInt());
                                System.out.print("Masukkan Jam Selesai: ");
                                method2.setJamSelesai(scanner.nextInt());
                                System.out.print("Masukkan Menit Selesai: ");
                                method2.setMenitSelesai(scanner.nextInt());
                                System.out.print("Masukkan Detik Selesai: ");
                                method2.setDetikSelesai(scanner.nextInt());
                                break;
                            case 3:
                                method3.inputData();
                                break;
                            case 0:
                                System.out.println("Kembali ke Menu Utama");
                                break;
                            default:
                                System.out.println("Masukkan pilihan yang sesuai!");
                                break;
                        }

                    } while (pilihanInput != 0);
                    break;

                case 2:
                    do {
                        System.out.println("\n==Menu Cetak Data==");
                        System.out.println("1. Cetak Data via constructor");
                        System.out.println("2. Cetak dari luar class");
                        System.out.println("3. Cetak dari dalam class");
                        System.out.println("0. Keluar");
                        System.out.print("Pilihan: ");
                        pilihanOutput = scanner.nextInt();

                        switch (pilihanOutput) {
                            case 1:
                                String onama = method1.getNama();
                                System.out.println("Nama: " + onama);
                                String onpm = method1.getNpm();
                                System.out.println("NPM: " + onpm);
                                int ojamMulai = method1.getJamMulai();
                                int omenitMulai = method1.getMenitMulai();
                                int odetikMulai = method1.getDetikMulai();
                                System.out.printf("Waktu Mulai: %02d:%02d:%02d%n", ojamMulai, omenitMulai, odetikMulai);
                                int ojamSelesai = method1.getJamSelesai();
                                int omenitSelesai = method1.getMenitSelesai();
                                int odetikSelesai = method1.getDetikSelesai();
                                System.out.printf("Waktu Selesai: %02d:%02d:%02d%n", ojamSelesai, omenitSelesai, odetikSelesai);
                                int odurasiJam = method1.getDurasiJam();
                                int odurasiMenit = method1.getDurasiMenit();
                                int odurasiDetik = method1.getDurasiDetik();
                                System.out.printf("Durasi: %d Jam %d Menit %d Detik%n", odurasiJam, odurasiMenit, odurasiDetik);
                                String ohurufMutu = method1.getHurufMutu();
                                System.out.println("Huruf Mutu: " + ohurufMutu);
                                String ostatusLulus = method1.getStatusLulus();
                                System.out.println("Status Kelulusan: " + ostatusLulus);
                                break;
                            case 2:
                                System.out.println("Nama: " + method2.getNama());
                                System.out.println("NPM: " + method2.getNpm());
                                System.out.printf("Waktu Mulai: %02d:%02d:%02d%n", method2.getJamMulai(), method2.getMenitMulai(), method2.getDetikMulai());
                                System.out.printf("Waktu Selesai: %02d:%02d:%02d%n", method2.getJamSelesai(), method2.getMenitSelesai(), method2.getDetikSelesai());
                                System.out.printf("Durasi: %d Jam %d Menit %d Detik%n", method2.getDurasiJam(), method2.getDurasiMenit(), method2.getDurasiDetik());
                                System.out.println("Huruf Mutu: " + method2.getHurufMutu());
                                System.out.println("Status Kelulusan: " + method2.getStatusLulus());
                                break;
                            case 3:
                                method3.tampilkanHasil();
                                break;
                            case 0:
                                System.out.println("Kembali ke Menu Utama");
                                break;
                            default:
                                System.out.println("Masukkan pilihan yang sesuai!");
                                break;
                        }

                    } while (pilihanOutput != 0);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
