#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class Waktu {
private:
    int jam;
    int menit;
    int detik;

public:
    // Constructor default
    Waktu() : jam(0), menit(0), detik(0) {}

    // Constructor dengan parameter
    Waktu(int jam, int menit, int detik) : jam(jam), menit(menit), detik(detik) {}

    // Mengubah waktu ke detik
    int ubahDetik() const {
        return jam * 3600 + menit * 60 + detik;
    }

    // Menampilkan waktu
    void tampilkanWaktu() const {
        cout << setfill('0') << setw(2) << jam << ":"
             << setfill('0') << setw(2) << menit << ":"
             << setfill('0') << setw(2) << detik << endl;
    }

    // Menghitung durasi
    static int hitungDurasi(const Waktu& mulai, const Waktu& selesai) {
        return selesai.ubahDetik() - mulai.ubahDetik();
    }

    // Input waktu
    void inputWaktu(const string& label) {
        cout << "Masukkan " << label << ":" << endl;
        cout << "Jam: "; cin >> jam;
        cout << "Menit: "; cin >> menit;
        cout << "Detik: "; cin >> detik;
        cout << endl;
    }

    // Setter dan Getter
    void setJam(int jam) { this->jam = jam; }
    void setMenit(int menit) { this->menit = menit; }
    void setDetik(int detik) { this->detik = detik; }
    int getJam() const { return jam; }
    int getMenit() const { return menit; }
    int getDetik() const { return detik; }
};

class UjianLari {
private:
    string nama;
    string npm;
    Waktu waktuMulai;
    Waktu waktuSelesai;

public:
    // Constructor default
    UjianLari() : nama(""), npm(""), waktuMulai(Waktu()), waktuSelesai(Waktu()) {}

    // Constructor dengan parameter
    UjianLari(const string& nama, const string& npm, const Waktu& waktuMulai, const Waktu& waktuSelesai)
        : nama(nama), npm(npm), waktuMulai(waktuMulai), waktuSelesai(waktuSelesai) {}

    // Input data
    void inputData() {
        cout << "Masukkan Nama: ";
        cin.ignore(); // To ignore the newline character left in the buffer
        getline(cin, nama);
        cout << "Masukkan NPM: ";
        getline(cin, npm);
        cout << endl;

        // Input Waktu Mulai
        waktuMulai.inputWaktu("Waktu Mulai");

        // Input Waktu Selesai
        do {
            waktuSelesai.inputWaktu("Waktu Selesai");
            if (waktuSelesai.ubahDetik() < waktuMulai.ubahDetik()) {
                cout << "Waktu selesai tidak boleh lebih kecil dari waktu mulai. Silakan coba lagi." << endl;
            }
        } while (waktuSelesai.ubahDetik() < waktuMulai.ubahDetik());
    }

    // Mendapatkan huruf mutu
    string getHurufMutu() const {
        double durasiMenit = hitungDurasi() / 60.0;
        if (durasiMenit < 7.5) return "A";
        else if (durasiMenit < 12.5) return "B";
        else if (durasiMenit < 30) return "C";
        else return "D";
    }

    // Mendapatkan status kelulusan
    string getStatusLulus() const {
        string hurufMutu = getHurufMutu();
        if (hurufMutu == "A" || hurufMutu == "B" || hurufMutu == "C") return "Lulus";
        else return "Gagal";
    }

    // Menghitung durasi
    int hitungDurasi() const {
        return Waktu::hitungDurasi(waktuMulai, waktuSelesai);
    }

    // Menampilkan hasil
    void tampilkanHasil() const {
        int durasi = hitungDurasi();
        int durasiJam = durasi / 3600;
        int durasiMenit = (durasi % 3600) / 60;
        int durasiDetik = durasi % 60;

        cout << "\nNama: " << nama << endl;
        cout << "NPM: " << npm << endl;
        cout << "Waktu Mulai: ";
        waktuMulai.tampilkanWaktu();
        cout << "Waktu Selesai: ";
        waktuSelesai.tampilkanWaktu();
        cout << "Durasi: " << durasiJam << " Jam " << durasiMenit << " Menit " << durasiDetik << " Detik" << endl;
        cout << "Huruf Mutu: " << getHurufMutu() << endl;
        cout << "Status Kelulusan: " << getStatusLulus() << endl;
    }

    // Setter dan Getter untuk atribut UjianLari
    void setNama(const string& nama) { this->nama = nama; }
    void setNpm(const string& npm) { this->npm = npm; }
    void setWaktuMulai(const Waktu& waktu) { this->waktuMulai = waktu; }
    void setWaktuSelesai(const Waktu& waktu) { this->waktuSelesai = waktu; }
    
    string getNama() const { return nama; }
    string getNpm() const { return npm; }
    Waktu getWaktuMulai() const { return waktuMulai; }
    Waktu getWaktuSelesai() const { return waktuSelesai; }
};

int main() {
    UjianLari method1("Yono", "140810230001", Waktu(20, 20, 20), Waktu(20, 30, 45));
    UjianLari method2;
    UjianLari method3;

    int pilihan, pilihanInput, pilihanOutput;

    do {
        cout << "\n==Menu Utama==" << endl;
        cout << "1. Input Data" << endl;
        cout << "2. Cetak Data" << endl;
        cout << "0. Keluar" << endl;
        cout << "Pilihan: "; cin >> pilihan;

        switch (pilihan) {
            case 1:
                do {
                    cout << "\n==Menu Input Data==" << endl;
                    cout << "1. Input Data via constructor" << endl;
                    cout << "2. Input dari luar class" << endl;
                    cout << "3. Input dari dalam class" << endl;
                    cout << "0. Keluar" << endl;
                    cout << "Pilihan: "; cin >> pilihanInput;

                    switch (pilihanInput) {
                        case 1:
                            cout << "DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR" << endl;
                            cout << "Nama: Yono" << endl;
                            cout << "NPM: 140810230001" << endl;
                            cout << endl;
                            cout << "Jam Mulai: 20" << endl;
                            cout << "Menit Mulai: 20" << endl;
                            cout << "Detik Mulai: 20" << endl;
                            cout << endl;
                            cout << "Jam Selesai: 20" << endl;
                            cout << "Menit Selesai: 30" << endl;
                            cout << "Detik Selesai: 45" << endl;
                            cout << endl;
                            break;
                        case 2:
                            method2.inputData();
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
                do {
                    cout << "\n==Menu Cetak Data==" << endl;
                    cout << "1. Cetak Data via constructor" << endl;
                    cout << "2. Cetak Data dari luar class" << endl;
                    cout << "3. Cetak Data dari dalam class" << endl;
                    cout << "0. Keluar" << endl;
                    cout << "Pilihan: "; cin >> pilihanOutput;

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
                            cout << "Kembali ke Menu Utama" << endl;
                            break;
                        default:
                            cout << "Masukkan pilihan yang sesuai!" << endl;
                            break;
                    }

                } while (pilihanOutput != 0);
                break;

            case 0:
                cout << "Keluar dari program." << endl;
                break;

            default:
                cout << "Masukkan pilihan yang sesuai!" << endl;
                break;
        }

    } while (pilihan != 0);

    return 0;
}
