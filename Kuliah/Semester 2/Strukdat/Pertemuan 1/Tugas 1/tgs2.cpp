/*  Nama program : Tugas 2
    Nama         : Clarisya Adeline
    NPM          : 140810230017
    Tanggal buat : Rabu, 28-2-2024
    Deskripsi    : Membuat menu untuk mencari faktorial, permutasi, komnbinasi dengan switch
*/
#include <iostream>
using namespace std;

// Fungsi menampilkan pilihan menu
int menu() {
    int pilihan;
    cout << "Pilih Perhitungan" << endl;
    cout << "1. Faktorial \n2. Permutasi \n3. Kombinasi" << endl;

    cout << "Pilih nomor = ";
    cin >> pilihan;

    return pilihan;
}

// Fungsi inputan nilai n
int input(){
    int n;
    cout << "Masukkan nilai n = ";
    cin >> n;
    return n;
}

// Fungsi menghitung faktorial dengan for
int faktorial(int x){
    int fak = 1;
    for (int i = 1; i <= x; i++) {
        fak *= i;
    }
    return fak;
}

//Fungsi menghitung faktorial dengan while
int faktorial1(int x){
    int fak = 1;    
    int i = 1;
    while (x >= i)
    {
        fak *= i;
        i++;

    }return fak;
    
}

// Fungsi menghitung permutasi
int permutasi(int n){
    int r;

    cout << "Masukkan nilai r = ";
    cin >> r; 

    if (r > n) {
        cout << "Nilai r tidak boleh lebih besar dari n" << endl;
        return -1; //indikator kesalahan
    }

    int kurang = n - r;
    int per = faktorial(n) / faktorial(kurang);
    return per;
}

// Fungsi menghitung kombinasi
int kombinasi(int n){
    int r;

    cout << "Masukkan nilai r = ";
    cin >> r; 

    if (r > n) {
        cout << "Nilai r tidak boleh lebih besar dari n" << endl;
        return -1; // indikator kesalahan
    }

    int kurang = n - r;
    int kom = faktorial1(n) / (faktorial1(kurang) * faktorial1(r));
    return kom;
}

// Fungsi untuk memilih jenis perhitungan
int perhitungan() {
    int pilihan = menu();
    int n;

    switch (pilihan) {
        case 1:
            n = input();
            return faktorial(n);
        case 2:
            n = input();
            return permutasi(n);
        case 3:
            n = input();
            return kombinasi(n);
        default:
            cout << "Pilih nomor 1 - 3!" << endl;
            return perhitungan();
    }
}

// Fungsi untuk mencetak hasil perhitungan
void output(int hasil){
    cout << "Hasil = " << hasil << endl;
}

int main(){
    int hasil = perhitungan(); // Melakukan perhitungan
    output(hasil); // Mencetak hasil
    return 0;
}
