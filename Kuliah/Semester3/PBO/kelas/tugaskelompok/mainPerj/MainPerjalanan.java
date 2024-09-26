package Kuliah.Semester3.PBO.kelas.tugaskelompok.mainPerj;

/*
Anggota Kelompok    :   - Clarisya Adeline (140810230017)  
                        - Nazwa Nashatasya (140810230019)
                        - Ammara Azwadiena Alfiantie (140810230073)
Kelas               : A
Tanggal             : Minggu, 22 September 2024
Deskripsi           : SOAL 2 Java

Buat program mencari lama perjalanan seseorang :
    • Input tgl Berangkat, tgl kedatangan, jam berangkat, jam kedatangan
    • Tanggal (tglhari, bulan, tahun)
    • Waktu (jam, menit, detik)
Tampilan :
Berangkat 
    • Tanggal       : 1
    • Bulan         : 1
    • Tahun         : 2023
    • Jam           : 10
    • Menit         : 10
    • Detik         : 10
Kedatangan 
    • Tanggal       : 3
    • Bulan         : 1
    • Tahun         : 2023
    • Jam           : 9
    • Menit         : 10
    • Detik         : 10
Lama Perjalanan     : 1 hari 23 Jam
*/

import java.util.Scanner;

class Perjalanan {
    // Variabel untuk data keberangkatan dan kedatangan
    private int tglBerangkat, bulanBerangkat, tahunBerangkat, jamBerangkat, menitBerangkat, detikBerangkat;
    private int tglKedatangan, bulanKedatangan, tahunKedatangan, jamKedatangan, menitKedatangan, detikKedatangan;

    // Constructor tanpa argumen
    public Perjalanan() {
        this.tglBerangkat = 0;
        this.bulanBerangkat = 0;
        this.tahunBerangkat = 0;
        this.jamBerangkat = 0;
        this.menitBerangkat = 0;
        this.detikBerangkat = 0;
        this.tglKedatangan = 0;
        this.bulanKedatangan = 0;
        this.tahunKedatangan = 0;
        this.jamKedatangan = 0;
        this.menitKedatangan = 0;
        this.detikKedatangan = 0;
    }

    // Constructor dengan argumen untuk menginisialisasi objek Perjalanan
    public Perjalanan(int tglBerangkat, int bulanBerangkat, int tahunBerangkat, int jamBerangkat, int menitBerangkat, int detikBerangkat,
                      int tglKedatangan, int bulanKedatangan, int tahunKedatangan, int jamKedatangan, int menitKedatangan, int detikKedatangan) {
        this.tglBerangkat = tglBerangkat;
        this.bulanBerangkat = bulanBerangkat;
        this.tahunBerangkat = tahunBerangkat;
        this.jamBerangkat = jamBerangkat;
        this.menitBerangkat = menitBerangkat;
        this.detikBerangkat = detikBerangkat;
        this.tglKedatangan = tglKedatangan;
        this.bulanKedatangan = bulanKedatangan;
        this.tahunKedatangan = tahunKedatangan;
        this.jamKedatangan = jamKedatangan;
        this.menitKedatangan = menitKedatangan;
        this.detikKedatangan = detikKedatangan;
    }

    // Getter dan Setter untuk data keberangkatan
    public int getTglBerangkat() {
        return tglBerangkat;
    }
    public void setTglBerangkat(int tglBerangkat) {
        this.tglBerangkat = tglBerangkat;
    }
    public int getBulanBerangkat() {
        return bulanBerangkat;
    }
    public void setBulanBerangkat(int bulanBerangkat) {
        this.bulanBerangkat = bulanBerangkat;
    }
    public int getTahunBerangkat() {
        return tahunBerangkat;
    }
    public void setTahunBerangkat(int tahunBerangkat) {
        this.tahunBerangkat = tahunBerangkat;
    }
    public int getJamBerangkat() {
        return jamBerangkat;
    }
    public void setJamBerangkat(int jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }
    public int getMenitBerangkat() {
        return menitBerangkat;
    }
    public void setMenitBerangkat(int menitBerangkat) {
        this.menitBerangkat = menitBerangkat;
    }
    public int getDetikBerangkat() {
        return detikBerangkat;
    }
    public void setDetikBerangkat(int detikBerangkat) {
        this.detikBerangkat = detikBerangkat;
    }

    // Getter dan Setter untuk data kedatangan
    public int getTglKedatangan() {
        return tglKedatangan;
    }
    public void setTglKedatangan(int tglKedatangan) {
        this.tglKedatangan = tglKedatangan;
    }
    public int getBulanKedatangan() {
        return bulanKedatangan;
    }
    public void setBulanKedatangan(int bulanKedatangan) {
        this.bulanKedatangan = bulanKedatangan;
    }
    public int getTahunKedatangan() {
        return tahunKedatangan;
    }
    public void setTahunKedatangan(int tahunKedatangan) {
        this.tahunKedatangan = tahunKedatangan;
    }
    public int getJamKedatangan() {
        return jamKedatangan;
    }
    public void setJamKedatangan(int jamKedatangan) {
        this.jamKedatangan = jamKedatangan;
    }
    public int getMenitKedatangan() {
        return menitKedatangan;
    }
    public void setMenitKedatangan(int menitKedatangan) {
        this.menitKedatangan = menitKedatangan;
    }
    public int getDetikKedatangan() {
        return detikKedatangan;
    }
    public void setDetikKedatangan(int detikKedatangan) {
        this.detikKedatangan = detikKedatangan;
    }

        // Calculate travel time in seconds
        public int hitungWaktuBerangkat() {
            return (detikBerangkat + menitBerangkat * 60 + jamBerangkat * 3600 + tglBerangkat * 86400);
        }
    
        public int hitungWaktuKedatangan() {
            return (detikKedatangan + menitKedatangan * 60 + jamKedatangan * 3600 + tglKedatangan * 86400);
        }
    
        public int hitungDurasi() {
            return hitungWaktuKedatangan() - hitungWaktuBerangkat();
        }
    
        public int getSelisihHari() {
            return hitungDurasi() / 86400;
        }
    
        public int getSelisihJam() {
            return (hitungDurasi() % 86400) / 3600;
        }
    
        public int getSelisihMenit() {
            return (hitungDurasi() % 3600) / 60;
        }
    
        public int getSelisihDetik() {
            return hitungDurasi() % 60;
        }

    // Method untuk input data keberangkatan dari dalam class
    public void inputKeberangkatan(Scanner input) {
        System.out.print("Tanggal : ");
        this.tglBerangkat = input.nextInt();
        System.out.print("Bulan   : ");
        this.bulanBerangkat = input.nextInt();
        System.out.print("Tahun   : ");
        this.tahunBerangkat = input.nextInt();
        System.out.print("Jam     : ");
        this.jamBerangkat = input.nextInt();
        System.out.print("Menit   : ");
        this.menitBerangkat = input.nextInt();
        System.out.print("Detik   : ");
        this.detikBerangkat = input.nextInt();
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Berangkat: ");
        tglBerangkat = sc.nextInt();
        System.out.print("Masukkan Bulan Berangkat: ");
        bulanBerangkat = sc.nextInt();
        System.out.print("Masukkan Tahun Berangkat: ");
        tahunBerangkat = sc.nextInt();
        System.out.print("Masukkan Jam Berangkat: ");
        jamBerangkat = sc.nextInt();
        System.out.print("Masukkan Menit Berangkat: ");
        menitBerangkat = sc.nextInt();
        System.out.print("Masukkan Detik Berangkat: ");
        detikBerangkat = sc.nextInt();

        System.out.print("\nMasukkan Tanggal Kedatangan: ");
        tglKedatangan = sc.nextInt();
        System.out.print("Masukkan Bulan Kedatangan: ");
        bulanKedatangan = sc.nextInt();
        System.out.print("Masukkan Tahun Kedatangan: ");
        tahunKedatangan = sc.nextInt();
        System.out.print("Masukkan Jam Kedatangan: ");
        jamKedatangan = sc.nextInt();
        System.out.print("Masukkan Menit Kedatangan: ");
        menitKedatangan = sc.nextInt();
        System.out.print("Masukkan Detik Kedatangan: ");
        detikKedatangan = sc.nextInt();
    }

    public void tampilkanData() {
        System.out.println("\nWaktu Berangkat: ");
        System.out.println(tglBerangkat + "/" + bulanBerangkat + "/" + tahunBerangkat);
        System.out.println(jamBerangkat + ":" + menitBerangkat + ":" + detikBerangkat);

        System.out.println("\nWaktu Kedatangan: ");
        System.out.println(tglKedatangan + "/" + bulanKedatangan + "/" + tahunKedatangan);
        System.out.println(jamKedatangan + ":" + menitKedatangan + ":" + detikKedatangan);

        System.out.println("\nLama Perjalanan: ");
        System.out.println(getSelisihHari() + " Hari " + getSelisihJam() + " Jam " + getSelisihMenit() + " Menit " + getSelisihDetik() + " Detik");
    }
}

public class MainPerjalanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perjalanan method1 = new Perjalanan(1, 1, 2023, 10, 10, 10, 3, 1, 2023, 9, 10, 10);
        Perjalanan method2 = new Perjalanan();
        Perjalanan method3 = new Perjalanan();

        while (true) {
            System.out.println("\n== Menu Utama ==");
            System.out.println("1. Input Data");
            System.out.println("2. Cetak Data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                while (true) {
                    System.out.println("\n== Menu Input Data ==");
                    System.out.println("1. Input Data via constructor");
                    System.out.println("2. Input dari luar class");
                    System.out.println("3. Input dari dalam class");
                    System.out.println("0. Kembali");
                    System.out.print("Pilihan: ");
                    int pilihanInput = sc.nextInt();

                    if (pilihanInput == 1) {
                        System.out.println("DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR");
                    } else if (pilihanInput == 2) {
                        System.out.print("Masukkan Tanggal Berangkat: ");
                        int tglBerangkat = sc.nextInt();

                        method2.setTglBerangkat(tglBerangkat);
                        System.out.print("Masukkan Bulan Berangkat: ");
                        int blnBerangkat = sc.nextInt();
                        method2.setBulanBerangkat(blnBerangkat);

                        System.out.print("Masukkan Tahun Berangkat: ");
                        int thnBerangkat = sc.nextInt();
                        method2.setTahunBerangkat(thnBerangkat);

                        System.out.print("Masukkan Jam Berangkat: ");
                        int jamBerangkat = sc.nextInt();
                        method2.setJamBerangkat(jamBerangkat);

                        System.out.print("Masukkan Menit Berangkat: ");
                        int menitBerangkat = sc.nextInt();
                        method2.setMenitBerangkat(menitBerangkat);

                        System.out.print("Masukkan Detik Berangkat: ");
                        int detikBerangkat = sc.nextInt();
                        method2.setDetikBerangkat(detikBerangkat);

                        // Input data kedatangan
                        System.out.print("\nMasukkan Tanggal Kedatangan: ");
                        int tglKedatangan = sc.nextInt();
                        method2.setTglKedatangan(tglKedatangan);

                        System.out.print("Masukkan Bulan Kedatangan: ");
                        int blnKedatangan = sc.nextInt();
                        method2.setBulanKedatangan(blnKedatangan);

                        System.out.print("Masukkan Tahun Kedatangan: ");
                        int thnKedatangan = sc.nextInt();
                        method2.setTahunKedatangan(thnKedatangan);

                        System.out.print("Masukkan Jam Kedatangan: ");
                        int jamKedatangan = sc.nextInt();
                        method2.setJamKedatangan(jamKedatangan);

                        System.out.print("Masukkan Menit Kedatangan: ");
                        int menitKedatangan = sc.nextInt();
                        method2.setMenitKedatangan(menitKedatangan);

                        System.out.print("Masukkan Detik Kedatangan: ");
                        int detikKedatangan = sc.nextInt();
                        method2.setDetikKedatangan(detikKedatangan);
                    } else if (pilihanInput == 3) {
                        method3.inputData();
                    } else if (pilihanInput == 0) {
                        break;
                    }
                }
            } else if (pilihan == 2) {
                while (true) {
                    System.out.println("\n== Menu Cetak Data ==");
                    System.out.println("1. Cetak data dari constructor");
                    System.out.println("2. Cetak data dari luar class");
                    System.out.println("3. Cetak data dari dalam class");
                    System.out.println("0. Kembali");
                    System.out.print("Pilihan: ");
                    int pilihanCetak = sc.nextInt();

                    if (pilihanCetak == 1) {
                        int tglBerangkat = method1.getTglBerangkat();
                        int blnBerangkat = method1.getBulanBerangkat();
                        int thnBerangkat = method1.getTahunBerangkat();
                        int jamBerangkat = method1.getJamBerangkat();
                        int menitBerangkat = method1.getMenitBerangkat();
                        int detikBerangkat = method1.getDetikBerangkat();

                        System.out.println("\nWaktu Berangkat:");
                        System.out.println(tglBerangkat + "/" + blnBerangkat + "/" + thnBerangkat);
                        System.out.println(jamBerangkat + ":" + menitBerangkat + ":" + detikBerangkat);

                        int tglKedatangan = method1.getTglKedatangan();
                        int blnKedatangan = method1.getBulanKedatangan();
                        int thnKedatangan = method1.getTahunKedatangan();
                        int jamKedatangan = method1.getJamKedatangan();
                        int menitKedatangan = method1.getMenitKedatangan();
                        int detikKedatangan = method1.getDetikKedatangan();

                        System.out.println("\nWaktu Kedatangan:");
                        System.out.println(tglKedatangan + "/" + blnKedatangan + "/" + thnKedatangan);
                        System.out.println(jamKedatangan + ":" + menitKedatangan + ":" + detikKedatangan);

                        System.out.println("\nLama Perjalanan:");
                        System.out.println(method1.getSelisihHari() + " Hari " + method1.getSelisihJam() + " Jam " + method1.getSelisihMenit() + " Menit " + method1.getSelisihDetik() + " Detik");
                    } else if (pilihanCetak == 2) {
                        System.out.println("\nWaktu Berangkat:");
                        System.out.println(method2.getTglBerangkat() + "/" + method2.getBulanBerangkat() + "/" + method2.getTahunBerangkat());
                        System.out.println(method2.getJamBerangkat() + ":" + method2.getMenitBerangkat() + ":" + method2.getDetikBerangkat());

                        System.out.println("\nWaktu Kedatangan:");
                        System.out.println(method2.getTglKedatangan() + "/" + method2.getBulanKedatangan() + "/" + method2.getTahunKedatangan());
                        System.out.println(method2.getJamKedatangan() + ":" + method2.getMenitKedatangan() + ":" + method2.getDetikKedatangan());

                        System.out.println("\nLama Perjalanan:");
                        System.out.println(method2.getSelisihHari() + " Hari " + method2.getSelisihJam() + " Jam " + method2.getSelisihMenit() + " Menit " + method2.getSelisihDetik() + " Detik");
                    } else if (pilihanCetak == 3) {
                        method3.tampilkanData();
                    } else if (pilihanCetak == 0) {
                        break;
                    }
                }
            } else if (pilihan == 0) {
                System.out.println("Keluar dari program.");
                break;
            }
        }

        sc.close();
    }
}

