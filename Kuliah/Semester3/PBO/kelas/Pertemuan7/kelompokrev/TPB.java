package Kuliah.Semester3.PBO.kelas.Pertemuan7.kelompokrev;

import java.util.Scanner;

class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public Waktu() {
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;
    }

    public int ubahDetik() {
        return jam * 3600 + menit * 60 + detik;
    }

    public void tampilkanWaktu() {
        System.out.printf("%02d:%02d:%02d%n", jam, menit, detik);
    }

    public static int hitungDurasi(Waktu mulai, Waktu selesai) {
        return selesai.ubahDetik() - mulai.ubahDetik();
    }

    // Input untuk class Waktu
    public void inputWaktu(String label) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan " + label + ":");
        System.out.print("Jam: ");
        this.jam = input.nextInt();
        System.out.print("Menit: ");
        this.menit = input.nextInt();
        System.out.print("Detik: ");
        this.detik = input.nextInt();
        System.out.println();
    }

    // Setters dan Getters
    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }
}

class UjianLari {
    private String nama;
    private String npm;
    private Waktu waktuMulai;
    private Waktu waktuSelesai;

    public UjianLari(String nama, String npm, Waktu waktuMulai, Waktu waktuSelesai) {
        this.nama = nama;
        this.npm = npm;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
    }

    public UjianLari() {
        this.nama = "";
        this.npm = "";
        this.waktuMulai = new Waktu(); 
        this.waktuSelesai = new Waktu(); 
    }

    // Setters and Getters
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setWaktuMulai(Waktu waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public void setWaktuSelesai(Waktu waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public Waktu getWaktuMulai() {
        return waktuMulai;
    }

    public Waktu getWaktuSelesai() {
        return waktuSelesai;
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NPM: ");
        npm = input.nextLine();
        System.out.println();

        // Input Waktu Mulai
        waktuMulai.inputWaktu("Waktu Mulai");

        // Input Waktu Selesai
        do {
            waktuSelesai.inputWaktu("Waktu Selesai");

            // Validasi Waktu
            if (waktuSelesai.ubahDetik() < waktuMulai.ubahDetik()) {
                System.out.println("Waktu selesai tidak boleh lebih kecil dari waktu mulai. Silakan coba lagi.");
            }
        } while (waktuSelesai.ubahDetik() < waktuMulai.ubahDetik());
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
        if (hurufMutu == "A" || hurufMutu == "B" || hurufMutu == "C")
            return "Lulus";
        else
            return "Gagal";
    }

    public int hitungDurasi() {
        return Waktu.hitungDurasi(waktuMulai, waktuSelesai);
    }

    public void tampilkanHasil() {
        int durasi = hitungDurasi();
        int durasiJam = durasi / 3600;
        int durasiMenit = (durasi % 3600) / 60;
        int durasiDetik = durasi % 60;

        System.out.println("\nNama: " + getNama());
        System.out.println("NPM: " + getNpm());
        System.out.print("Waktu Mulai: ");
        waktuMulai.tampilkanWaktu();
        System.out.print("Waktu Selesai: ");
        waktuSelesai.tampilkanWaktu();
        System.out.printf("Durasi: %d Jam %d Menit %d Detik%n", durasiJam, durasiMenit, durasiDetik);
        System.out.println("Huruf Mutu: " + getHurufMutu());
        System.out.println("Status Kelulusan: " + getStatusLulus());
    }
}

public class TPB {
    public static void main(String[] args) {
        UjianLari method1 = new UjianLari("Yono", "140810230001", new Waktu(20, 20, 20), new Waktu(20, 30, 45));
        UjianLari method2 = new UjianLari();
        UjianLari method3 = new UjianLari();
        int pilihan, pilihanInput, pilihanOutput;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n==Menu Utama==");
            System.out.println("1. Input Data");
            System.out.println("2. Cetak Data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    do {
                        System.out.println("\n==Menu Input Data==");
                        System.out.println("1. Input Data via constructor");
                        System.out.println("2. Input dari luar class");
                        System.out.println("3. Input dari dalam class");
                        System.out.println("0. Keluar");
                        System.out.print("Pilihan: ");
                        pilihanInput = input.nextInt();

                        switch (pilihanInput) {
                            case 1:
                                System.out.println("DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR");
                                System.out.print("Nama: Yono\n");
                                System.out.print("NPM: 140810230001\n");
                                System.out.println();

                                System.out.print("Jam Mulai: 20\n");
                                System.out.print("Menit Mulai: 20\n");
                                System.out.print("Detik Mulai: 20\n");
                                System.out.println();

                                System.out.print("Jam Selesai: 20\n");
                                System.out.print("Menit Selesai: 30\n");
                                System.out.print("Detik Selesai: 45\n");
                                System.out.println();
                                break;
                            case 2:
                                method2.inputData();
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
                        System.out.println("2. Cetak Data dari luar class");
                        System.out.println("3. Cetak Data dari dalam class");
                        System.out.println("0. Keluar");
                        System.out.print("Pilihan: ");
                        pilihanOutput = input.nextInt();

                        switch (pilihanOutput) {
                            case 1:
                                method1.tampilkanHasil();
                                break;
                            case 2:
                                method2.tampilkanHasil();
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
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Masukkan pilihan yang sesuai!");
                    break;
            }
        } while (pilihan != 0);
        input.close();
    }
}
