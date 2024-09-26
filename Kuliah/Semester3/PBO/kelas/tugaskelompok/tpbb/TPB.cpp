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

#include <iostream>
#include <stdexcept>

using namespace std;

class NilaiLari {
private:
    string nama;
    string npm;
    int jamMulai, menitMulai, detikMulai;
    int jamSelesai, menitSelesai, detikSelesai;

public:
    // Constructor kosong
    NilaiLari(string Nama, string Npm, int JamMulai, int MenitMulai, int DetikMulai, int JamSelesai, int MenitSelesai, int DetikSelesai){
        nama = Nama;
        npm = Npm;
        jamMulai = JamMulai;
        menitMulai = MenitMulai;
        detikMulai = DetikMulai;
        jamSelesai = JamSelesai;
        menitSelesai = MenitSelesai;
        detikSelesai = DetikSelesai;
    }

    NilaiLari() {
        string nama = "";
        string npm = "";
        jamMulai = 0;
        menitMulai = 0;
        detikMulai = 0;
        jamSelesai = 0;
        menitSelesai = 0;
        detikSelesai = 0;
    }

    // Setter dan Getter
    string getNama() {
        return nama;
    }

    void setNama(string n) {
        nama = n;
    }

    string getNpm() {
        return npm;
    }

    void setNpm(string n) {
        npm = n;
    }

    int getJamMulai() {
        return jamMulai;
    }

    void setJamMulai(int jam) {
        if (jam < 0) {
            throw invalid_argument("Jam Mulai tidak boleh negatif.");
        }
        jamMulai = jam;
    }

    int getMenitMulai() {
        return menitMulai;
    }

    void setMenitMulai(int menit) {
        if (menit < 0) {
            throw invalid_argument("Menit Mulai tidak boleh negatif.");
        }
        menitMulai = menit;
    }

    int getDetikMulai() {
        return detikMulai;
    }

    void setDetikMulai(int detik) {
        if (detik < 0) {
            throw invalid_argument("Detik Mulai tidak boleh negatif.");
        }
        detikMulai = detik;
    }

    int getJamSelesai() {
        return jamSelesai;
    }

    void setJamSelesai(int jam) {
        if (jam < 0) {
            throw invalid_argument("Jam Selesai tidak boleh negatif.");
        }
        jamSelesai = jam;
    }

    int getMenitSelesai() {
        return menitSelesai;
    }

    void setMenitSelesai(int menit) {
        if (menit < 0) {
            throw invalid_argument("Menit Selesai tidak boleh negatif.");
        }
        menitSelesai = menit;
    }

    int getDetikSelesai() {
        return detikSelesai;
    }

    void setDetikSelesai(int detik) {
        if (detik < 0) {
            throw invalid_argument("Detik Selesai tidak boleh negatif.");
        }
        detikSelesai = detik;
    }

    // Input data lari
    void inputData() {
        cout << "\nMasukkan Nama: ";
        cin >> nama;
        cout << "Masukkan NPM: ";
        cin >> npm;

        try {
            cout << "Masukkan Jam Mulai: ";
            cin >> jamMulai;
            setJamMulai(jamMulai);

            cout << "Masukkan Menit Mulai: ";
            cin >> menitMulai;
            setMenitMulai(menitMulai);

            cout << "Masukkan Detik Mulai: ";
            cin >> detikMulai;
            setDetikMulai(detikMulai);

            cout << "\nMasukkan Jam Selesai: ";
            cin >> jamSelesai;
            setJamSelesai(jamSelesai);

            cout << "Masukkan Menit Selesai: ";
            cin >> menitSelesai;
            setMenitSelesai(menitSelesai);

            cout << "Masukkan Detik Selesai: ";
            cin >> detikSelesai;
            setDetikSelesai(detikSelesai);
        } catch (const invalid_argument& e) {
            cout << "Error: " << e.what() << endl;
        }
    }

    // Hitung durasi dalam detik
    int hitungWaktuMulai() {
        return (jamMulai * 3600) + (menitMulai * 60) + detikMulai;
    }


    int hitungWaktuSelesai() {
        return (jamSelesai * 3600) + (menitSelesai * 60) + detikSelesai;
    }

    int HitungDurasi() {
        return hitungWaktuSelesai() - hitungWaktuMulai();
    }

    int getDurasiJam (){
        int durasi = HitungDurasi();
        int durasiJam = durasi / 3600;
        return durasiJam;
    }

    int getDurasiMenit (){
        int durasi = HitungDurasi();
        int durasiMenit = (durasi % 3600) / 60;
        return durasiMenit;
    }

    int getDurasiDetik (){
        int durasi = HitungDurasi();
        int durasiDetik = durasi % 60;
        return durasiDetik;
    }

    // Tentukan huruf mutu
    string getHurufMutu() {
        double durasiMenit = HitungDurasi() / 60.0;
        if (durasiMenit < 7.5)
            return "A";
        else if (durasiMenit < 12.5)
            return "B";
        else if (durasiMenit < 30)
            return "C";
        else
            return "D";
    }

    string getStatusLulus() {
        string hurufMutu = getHurufMutu();
        if (hurufMutu == "A" || hurufMutu == "B" || hurufMutu == "C")
            return "Lulus";
        else
            return "Gagal";
    }

    // Tampilkan hasil
    void tampilkanHasil() {
        cout << "\nNama: " << getNama() << endl;
        cout << "NPM: " << getNpm() << endl;
        cout << "Waktu Mulai: " << getJamMulai() << ":" << getMenitMulai() << ":" << getDetikMulai() << endl;
        cout << "Waktu Selesai: " << getJamSelesai() << ":" << getMenitSelesai() << ":" << getDetikSelesai() << endl;
        cout << "Durasi: " << getDurasiJam() << " Jam " << getDurasiMenit() << " Menit " << getDurasiDetik() << " Detik" << endl;
        cout << "Huruf Mutu: " << getHurufMutu() << endl;
        cout << "Status Kelulusan: " << getStatusLulus() << endl;
    }

        
};

int main() {
    NilaiLari method1("Yono", "140810230001", 20, 20, 20, 20, 30, 45);
    NilaiLari method2;
    NilaiLari method3;
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
                            string inama;
                            string inpm;
                            int ijamMulai, imenitMulai, idetikMulai;
                            int ijamSelesai, imenitSelesai, idetikSelesai;
                            cout << "Masukkan Nama : ";
                            cin >> inama;
                            method2.setNama(inama);
                            cout << "Masukkan NPM : ";
                            cin >> inpm;
                            method2.setNpm(inpm);
                            cout << "Masukkan Jam Mulai : ";
                            cin >> ijamMulai;
                            method2.setJamMulai(ijamMulai);
                            cout << "Masukkan Menit Mulai : ";
                            cin >> imenitMulai;
                            method2.setMenitMulai(imenitMulai);
                            cout << "Masukkan Detik Mulai : ";
                            cin >> idetikMulai;
                            method2.setDetikMulai(idetikMulai);
                            cout << "Masukkan Jam Selesai : ";
                            cin >> ijamSelesai;
                            method2.setJamSelesai(ijamSelesai);
                            cout << "Masukkan Menit Selesai : ";
                            cin >> imenitSelesai;
                            method2.setMenitSelesai(imenitSelesai);
                            cout << "Masukkan Detik Selesai : ";
                            cin >> idetikSelesai;
                            method2.setDetikSelesai(idetikSelesai);
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
                            string onama = method1.getNama();
                            cout << "Nama : " << onama << endl;
                            string onpm = method1.getNpm();
                            cout << "Npm : " << onpm << endl;
                            int ojamMulai = method1.getJamMulai();
                            int omenitMulai = method1.getMenitMulai();
                            int odetikMulai = method1.getDetikMulai();
                            cout << "Waktu Mulai: " << ojamMulai<< ":" << omenitMulai << ":" << odetikMulai << endl;
                            int ojamSelesai = method1.getJamSelesai();
                            int omenitSelesai = method1.getMenitSelesai();
                            int odetikSelesai = method1.getDetikSelesai();
                            cout << "Waktu Selesai: " << ojamSelesai<< ":" << omenitSelesai << ":" << odetikSelesai << endl;
                            int odurasiJam = method1.getDurasiJam();
                            int odurasiMenit = method1.getDurasiMenit();
                            int odurasiDetik = method1.getDurasiDetik();
                            cout << "Durasi: " << odurasiJam<< ":" << odurasiMenit << ":" << odurasiDetik << endl;
                            string ohurufMutu = method1.getHurufMutu();
                            cout << "Huruf Mutu: " << ohurufMutu << endl;
                            string ostatusLulus  = method1.getStatusLulus();
                            cout << "Status Kelulusan: " << ostatusLulus << endl;
                        }
                            break;
                        case 2:
                            cout << "Nama : " << method2.getNama() << endl;
                            cout << "Npm : " << method2.getNpm() << endl;
                            cout << "Waktu Mulai: " << method2.getJamMulai() << ":" << method2.getMenitMulai() << ":" << method2.getDetikMulai() << endl;
                            cout << "Waktu Selesai: " << method2.getJamSelesai() << ":" << method2.getMenitSelesai() << ":" << method2.getDetikSelesai() << endl;
                            cout << "Durasi: " << method2.getDurasiJam() << " Jam " << method2.getDurasiMenit() << " Menit " << method2.getDurasiDetik() << " Detik" << endl;
                            cout << "Huruf Mutu: " << method2.getHurufMutu() << endl;
                            cout << "Status Kelulusan: " << method2.getStatusLulus() << endl;
                            break;
                        case 3:
                            method3.tampilkanHasil();
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