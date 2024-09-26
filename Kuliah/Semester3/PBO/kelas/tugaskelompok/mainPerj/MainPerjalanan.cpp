/*
Anggota Kelompok    :   - Clarisya Adeline (140810230017)  
                        - Nazwa Nashatasya (140810230019)
                        - Ammara Azwadiena Alfiantie (140810230073)
Kelas               : A
Tanggal             : Minggu, 22 September 2024
Deskripsi           : SOAL 2 C++

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

#include <iostream>
using namespace std;

class Perjalanan {
private:
    int tglBerangkat, bulanBerangkat, tahunBerangkat, jamBerangkat, menitBerangkat, detikBerangkat;
    int tglKedatangan, bulanKedatangan, tahunKedatangan, jamKedatangan, menitKedatangan, detikKedatangan;

public:
    // Konstruktor kosong
    Perjalanan() {
        tglBerangkat = 0;
        bulanBerangkat = 0;
        tahunBerangkat= 0;
        jamBerangkat = 0;
        menitBerangkat = 0;
        detikBerangkat = 0;
        tglKedatangan = 0;
        bulanKedatangan = 0,
        tahunKedatangan = 0;
        jamKedatangan = 0;
        menitKedatangan= 0;
        detikKedatangan = 0;              
    }

    // Konstruktor dengan parameter
    Perjalanan(int tglB, int blnB, int thnB, int jamB, int menitB, int detikB,int tglK, int blnK, int thnK, int jamK, int menitK, int detikK) {
        tglBerangkat = tglB;
        bulanBerangkat = blnB;
        tahunBerangkat = thnB;
        jamBerangkat = jamB;
        menitBerangkat = menitB;
        detikBerangkat = detikB;
        tglKedatangan = tglK;
        bulanKedatangan = blnK;
        tahunKedatangan = thnK;
        jamKedatangan = jamK;
        menitKedatangan = menitK;
        detikKedatangan = detikK;
    }

    int getTglBerangkat (){
        return tglBerangkat;
    }

    void setTglBerangkat(int tgl){
        tglBerangkat = tgl;
    }

    int getBulanBerangkat (){
        return bulanBerangkat;
    }

    void setBulanBerangkat(int bulan){
        bulanBerangkat = bulan;
    }

    int getTahunBerangkat (){
        return tahunBerangkat;
    }

    void setTahunBerangkat(int tahun){
        tahunBerangkat = tahun;
    }

    int getJamBerangkat() {
        return jamBerangkat;
    }

    void setJamBerangkat(int jam) {
        if (jam < 0) {
            throw invalid_argument("Jam Berangkat tidak boleh negatif.");
        }
        jamBerangkat = jam;
    }

    int getMenitBerangkat() {
        return menitBerangkat;
    }

    void setMenitBerangkat(int menit) {
        if (menit < 0) {
            throw invalid_argument("Menit Berangkat tidak boleh negatif.");
        }
        menitBerangkat = menit;
    }

    int getDetikBerangkat() {
        return detikBerangkat;
    }

    void setDetikBerangkat(int detik) {
        if (detik < 0) {
            throw invalid_argument("Detik Berangkat tidak boleh negatif.");
        }
        detikBerangkat = detik;
    }

    int getTglKedatangan (){
        return tglKedatangan;
    }

    void setTglKedatangan(int tgl){
        tglKedatangan = tgl;
    }

    int getBulanKedatangan (){
        return bulanKedatangan;
    }

    void setBulanKedatangan(int bulan){
        bulanKedatangan = bulan;
    }

    int getTahunKedatangan (){
        return tahunKedatangan;
    }

    void setTahunKedatangan(int tahun){
        tahunKedatangan = tahun;
    }

    int getJamKedatangan() {
        return jamKedatangan;
    }

    void setJamKedatangan(int jam) {
        if (jam < 0) {
            throw invalid_argument("Jam Kedatangan tidak boleh negatif.");
        }
        jamKedatangan = jam;
    }

    int getMenitKedatangan() {
        return menitKedatangan;
    }

    void setMenitKedatangan(int menit) {
        if (menit < 0) {
            throw invalid_argument("Menit Kedatangan tidak boleh negatif.");
        }
        menitKedatangan = menit;
    }

    int getDetikKedatangan() {
        return detikKedatangan;
    }

    void setDetikKedatangan(int detik) {
        if (detik < 0) {
            throw invalid_argument("Detik Kedatangan tidak boleh negatif.");
        }
        detikKedatangan = detik;
    }

    int hitungWaktuBerangkat (){
        return (detikBerangkat + menitBerangkat * 60 + jamBerangkat * 3600 + tglBerangkat * 86400);
    }

    int hitungWaktuKedatangan (){
        return (detikKedatangan + menitKedatangan * 60 + jamKedatangan * 3600 + tglKedatangan * 86400);
    }

    int hitungDurasi(){
        return hitungWaktuKedatangan() - hitungWaktuBerangkat();
    }

    int getSelisihHari (){
        int selisih = hitungDurasi();
        int selisihHari = selisih / 86400;
        return selisihHari;
    }

    int getSelisihJam (){
        int selisih = hitungDurasi();
        int selisihJam = (selisih % 86400) / 3600;
        return selisihJam;
    }

    int getSelisihMenit (){
        int selisih = hitungDurasi();
        int selisihMenit = (selisih % 3600)/ 60;
        return selisihMenit;
    }

    int getSelisihDetik (){
        int selisih = hitungDurasi();
        int selisihDetik = selisih % 60;
        return selisihDetik;
    }

    void inputData() {
        try {
            cout << "Masukkan Tanggal Berangkat: ";
            cin >> tglBerangkat;
            setTglBerangkat(tglBerangkat);
            cout << "Masukkan Bulan Berangkat: ";
            cin >> bulanBerangkat;
            setBulanBerangkat(bulanBerangkat);
            cout << "Masukkan Tahun Berangkat: ";
            cin >> tahunBerangkat;
            setTahunBerangkat(tahunBerangkat);
            cout << "Masukkan Jam Berangkat: ";
            cin >> jamBerangkat;
            setMenitBerangkat(jamBerangkat);
            cout << "Masukkan Menit Berangkat: ";
            cin >> menitBerangkat;
            setMenitBerangkat(menitBerangkat);
            cout << "Masukkan Detik Berangkat: ";
            cin >> detikBerangkat;
            setDetikBerangkat(detikBerangkat);

            cout << "\nMasukkan Tanggal Kedatangan: ";
            cin >> tglKedatangan;
            setTglKedatangan(tglKedatangan);
            cout << "Masukkan Bulan Kedatangan: ";
            cin >> bulanKedatangan;
            setBulanKedatangan(bulanKedatangan);
            cout << "Masukkan Tahun Kedatangan: ";
            cin >> tahunKedatangan;
            setTahunKedatangan(tahunKedatangan);
            cout << "Masukkan Jam Kedatangan: ";
            cin >> jamKedatangan;
            setMenitKedatangan(jamKedatangan);
            cout << "Masukkan Menit Kedatangan: ";
            cin >> menitKedatangan;
            setMenitKedatangan(menitKedatangan);
            cout << "Masukkan Detik Kedatangan: ";
            cin >> detikKedatangan;
            setDetikKedatangan(detikKedatangan);
        } catch (const invalid_argument& e) {
            cout << "Error: " << e.what() << endl;
        }
    }


    // Method untuk menghitung selisih waktu perjalanan
    void tampilkanData() {
        cout << "\nWaktu Berangkat : \n" ;
        cout << getTglBerangkat() << "/" << getBulanBerangkat() << "/" << getTahunBerangkat() << endl;
        cout << getJamBerangkat() << ":" << getBulanBerangkat() << ":" << getDetikBerangkat() << endl;

        cout << "\nWaktu Kedatangan : \n" ;
        cout << getTglKedatangan() << "/" << getBulanKedatangan() << "/" << getTahunKedatangan() << endl;
        cout << getJamKedatangan() << ":" << getBulanKedatangan() << ":" << getDetikKedatangan() << endl;

        cout << "\nLama Perjalanan : \n";
        cout << getSelisihHari() << " Hari " << getSelisihJam() << " Jam " << getSelisihMenit() << " Menit " << getSelisihDetik() << " Detik" << endl;  
        
    }
};

int main() {
    Perjalanan method1(1, 1, 2023, 10, 10, 10, 3, 1, 2023, 9, 10, 10);
    Perjalanan method2;
    Perjalanan method3;
    int pilihan, pilihanInput, pilihanOutput;
        do {
            cout << "\n==Menu Utama==\n";
            cout << "1. Input Data\n";
            cout << "2. Cetak Data\n";
            cout << "0. Keluar\n";
            cout << "Pilihan: ";
            cin >> pilihan;

            switch (pilihan) {
            case 1:
                do{
                    cout << "\n==Menu Input Data==\n";
                    cout << "1. Input Data via constructor\n";
                    cout << "2. Input dari luar class\n";
                    cout << "3. Input dari dalam class\n";
                    cout << "0. Keluar\n";
                    cout << "Pilihan: ";
                    cin >> pilihanInput;

                    switch(pilihanInput){
                        case 1:
                            cout << "DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR" << endl;
                            break;
                        case 2: {
                            int tglBerangkat, blnBerangkat, thnBerangkat, jamBerangkat, menitBerangkat, detikBerangkat;
                            int tglKedatangan, blnKedatangan, thnKedatangan, jamKedatangan, menitKedatangan, detikKedatangan;
                            cout << "Masukkan Tanggal Berangkat : ";
                            cin >> tglBerangkat;
                            method2.setTglBerangkat(tglBerangkat);
                            cout << "Masukkan Bulan Berangkat : ";
                            cin >> blnBerangkat;
                            method2.setBulanBerangkat(blnBerangkat);
                            cout << "Masukkan Tahun Berangkat : ";
                            cin >> thnBerangkat;
                            method2.setTahunBerangkat(thnBerangkat);
                            cout << "Masukkan Jam Berangkat : ";
                            method2.setJamBerangkat(jamBerangkat);
                            cin >> jamBerangkat;
                            cout << "Masukkan Menit Berangkat : ";
                            cin >> menitBerangkat;
                            method2.setMenitBerangkat(menitBerangkat);
                            cout << "Masukkan Detik Berangkat : ";
                            cin >> detikBerangkat;
                            method2.setDetikBerangkat(detikBerangkat);

                            cout << "\nMasukkan Tanggal Kedatangan : ";
                            cin >> tglKedatangan;
                            method2.setTglKedatangan(tglKedatangan);
                            cout << "Masukkan Bulan Kedatangan : ";
                            cin >> blnKedatangan;
                            method2.setBulanKedatangan(blnKedatangan);
                            cout << "Masukkan Tahun Kedatangan : ";
                            cin >> thnKedatangan;
                            method2.setTahunKedatangan(thnKedatangan);
                            cout << "Masukkan Jam Kedatangan : ";
                            method2.setJamKedatangan(jamKedatangan);
                            cin >> jamKedatangan;
                            cout << "Masukkan Menit Kedatangan : ";
                            cin >> menitKedatangan;
                            method2.setMenitKedatangan(menitKedatangan);
                            cout << "Masukkan Detik Kedatangan : ";
                            cin >> detikKedatangan;
                            method2.setDetikKedatangan(detikKedatangan);
                        }
                            break;
                        case 3:
                            method3.inputData();
                            break;
                        case 0:
                            cout << "Kembali ke Menu Utama" << endl;
                            break;
                        default:
                            cout << "Masukkan pilihan yang sesuai!" << endl;
                            break;
                    }

                } while (pilihanInput != 0);
                break;

            case 2:
                 do{
                    cout << "\n==Menu Cetak Data==\n";
                    cout << "1. Cetak Data via constructor\n";
                    cout << "2. Cetak dari luar class\n";
                    cout << "3. Cetak dari dalam class\n";
                    cout << "0. Keluar\n";
                    cout << "Pilihan: ";
                    cin >> pilihanOutput;

                    switch(pilihanOutput){
                        case 1:{
                            int tglBerangkat = method1.getTglBerangkat();
                            int blnBerangkat = method1.getBulanBerangkat();
                            int thnBerangkat = method1.getTahunBerangkat();
                            int jamBerangkat = method1.getJamBerangkat();
                            int menitBerangkat = method1.getMenitBerangkat();
                            int detikBerangkat = method1.getDetikBerangkat();
                            cout << "\nWaktu Berangkat : \n" ;
                            cout << tglBerangkat << "/" << blnBerangkat << "/" << thnBerangkat << endl;
                            cout << jamBerangkat << ":" << menitBerangkat << ":" << detikBerangkat << endl;

                            int tglKedatangan = method1.getTglKedatangan();
                            int blnKedatangan = method1.getBulanKedatangan();
                            int thnKedatangan = method1.getTahunKedatangan();
                            int jamKedatangan = method1.getJamKedatangan();
                            int menitKedatangan = method1.getMenitKedatangan();
                            int detikKedatangan = method1.getDetikKedatangan();
                            cout << "\nWaktu Kedatangan : \n" ;
                            cout << tglKedatangan << "/" << blnKedatangan << "/" << thnKedatangan << endl;
                            cout << jamKedatangan << ":" << menitKedatangan << ":" << detikKedatangan << endl;

                            cout << "\nLama Perjalanan : \n";
                            cout << method1.getSelisihHari() << " Hari " << method1.getSelisihJam() << " Jam " << method1.getSelisihMenit() << " Menit " << method1.getSelisihDetik() << " Detik" << endl;
                        }
                            break;
                        case 2:
                            cout << "\nWaktu Berangkat : \n" ;
                            cout << method2.getTglBerangkat() << "/" << method2.getBulanBerangkat() << "/" << method2.getTahunBerangkat() << endl;
                            cout << method2.getJamBerangkat() << ":" << method2.getBulanBerangkat() << ":" << method2.getDetikBerangkat() << endl;

                            cout << "\nWaktu Kedatangan : \n" ;
                            cout << method2.getTglKedatangan() << "/" << method2.getBulanKedatangan() << "/" << method2.getTahunKedatangan() << endl;
                            cout << method2.getJamKedatangan() << ":" << method2.getBulanKedatangan() << ":" << method2.getDetikKedatangan() << endl;

                            cout << "\nLama Perjalanan : \n";
                            cout << method2.getSelisihHari() << " Hari " << method2.getSelisihJam() << " Jam " << method2.getSelisihMenit() << " Menit " << method2.getSelisihDetik() << " Detik" << endl;    
                            break;
                        case 3:
                            method3.tampilkanData();
                            break;
                        case 0:
                            cout << "Kembali ke Menu Utama" << endl;
                            break;
                        default:
                            cout << "Masukkan pilihan yang sesuai!" << endl;
                            break;
                    }

                } while (pilihanOutput != 0);
                break;

            case 0:
                cout << "Program selesai." << endl;
                break;
            default:
                cout << "Pilihan tidak valid!" << endl;
                break;
            }
        } while (pilihan != 0);

    return 0;
}
