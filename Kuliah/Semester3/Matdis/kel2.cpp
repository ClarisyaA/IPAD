/*
Nama Program :Torema Chinese Remainder
Kelompok     :8
Nama         :Adelia Felisha Putri, Clarisya Adeline, Martha Meslina, Keyna Fatima A, Ammara Azwadiena Alfiantie
NPM          :140810230003, 140810230017, 140810230037, 140810230067, 140810230073
Tanggal Buat :25 Agustus 2024
Deskripsi    :Membuat program mencari PBB dan Invers Modulo dengan Teorema Chinese Remainder Theorem
----------------------------------------------------------------------------*/

#include <iostream>
using namespace std;

struct Bilangan {
    int a;
    int m;
    int mod;
    int y;
};

int hasilModulus(const Bilangan &bil1, const Bilangan &bil2, const Bilangan &bil3);
void hasilM(Bilangan &bil1, Bilangan &bil2, Bilangan &bil3, int modulus);
int inversModulus(int a, int m);
void hasilY(Bilangan &bil1, Bilangan &bil2, Bilangan &bil3);
int hasilAkhir(const Bilangan &bil1, const Bilangan &bil2, const Bilangan &bil3, int modulus);
void inputData(Bilangan &bil1, Bilangan &bil2, Bilangan &bil3, int &modulus);
void menu();

int main() {
    menu();
    return 0;
}

void inputData(Bilangan &bil1, Bilangan &bil2, Bilangan &bil3, int &modulus) {
    cout << "Masukkan bilangan pertama : ";
    cin >> bil1.a;
    cout << "Masukkan modulo pertama : ";
    cin >> bil1.m;
    cout << "Masukkan bilangan kedua : ";
    cin >> bil2.a;
    cout << "Masukkan modulo kedua : ";
    cin >> bil2.m;
    cout << "Masukkan bilangan ketiga : ";
    cin >> bil3.a;
    cout << "Masukkan modulo ketiga : ";
    cin >> bil3.m;
    modulus = hasilModulus(bil1, bil2, bil3); 
    hasilM(bil1, bil2, bil3, modulus);     
    hasilY(bil1, bil2, bil3);                
}

int hasilModulus(const Bilangan &bil1, const Bilangan &bil2, const Bilangan &bil3) {
    return bil1.m * bil2.m * bil3.m;
}

void hasilM(Bilangan &bil1, Bilangan &bil2, Bilangan &bil3, int modulus) {
    bil1.mod = modulus / bil1.m;
    bil2.mod = modulus / bil2.m;
    bil3.mod = modulus / bil3.m;
}

int inversModulus(int a, int m) {
    for (int x = 1; x < m; x++) {
        if ((a * x) % m == 1) {
            return x;
        }
    }
    return -1;
}

void hasilY(Bilangan &bil1, Bilangan &bil2, Bilangan &bil3) {
    bil1.y = inversModulus(bil1.mod, bil1.m);
    bil2.y = inversModulus(bil2.mod, bil2.m);
    bil3.y = inversModulus(bil3.mod, bil3.m);
}

int hasilAkhir(const Bilangan &bil1, const Bilangan &bil2, const Bilangan &bil3, int modulus) {
    int hasil = (bil1.a * bil1.mod * bil1.y) + (bil2.a * bil2.mod * bil2.y) + (bil3.a * bil3.mod * bil3.y);
    return hasil % modulus;
}

void menu() {
    int pilihan;
    Bilangan bil1, bil2, bil3;
    int modulus = 0;
    int x;
    cout << "Program dimulai..." << endl;

    do {
        cout << endl;
        cout << "Menu" << endl;
        cout << "1. Input Data" << endl;
        cout << "2. Hasil Modulus" << endl;
        cout << "3. Hasil  M1, M2, dan M3" << endl;
        cout << "4. Hasil y1, y2, dan y3" << endl;
        cout << "5. Hasil Akhir" << endl;
        cout << "6. Keluar" << endl;
        cout << "Pilihan : ";
        cin >> pilihan;

        switch (pilihan) {
        case 1:
            cout << "Memulai Proses Penginputan Data" << endl;
            inputData(bil1, bil2, bil3, modulus);
            cout << endl;
            cout << "Data yang diinput : " << endl;
            cout << "X = " << bil1.a << " (mod " << bil1.m << ")" << endl;
            cout << "X = " << bil2.a << " (mod " << bil2.m << ")" << endl;
            cout << "X = " << bil3.a << " (mod " << bil3.m << ")" << endl;
            break;
        case 2:
            if (modulus == 0) {
                cout << "Belum ada data input!" << endl;
            } else {
                cout << "Modulus : " << modulus << endl;
            }
            break;
        case 3:
            if (modulus == 0) {
                cout << "Belum ada data input!" << endl;
            } else {
                cout << "M1 = " << bil1.mod << endl;
                cout << "M2 = " << bil2.mod << endl;
                cout << "M3 = " << bil3.mod << endl;
            }
            break;
        case 4:
            if (modulus == 0) {
                cout << "Belum ada data input!" << endl;
            } else {
                cout << "y1 = " << bil1.y << endl;
                cout << "y2 = " << bil2.y << endl;
                cout << "y3 = " << bil3.y << endl;
            }
            break;
        case 5:
            if (modulus == 0) {
                cout << "Belum ada data input!" << endl;
            } else {
                x = hasilAkhir(bil1, bil2, bil3, modulus);
                cout << "X = " << x << " (mod " << modulus << ")" << endl;
            }
            break;
        case 6:
            cout << "Program selesai..." << endl;
            break;
        default:
            cout << "Masukkan pilihan yang sesuai!" << endl;
            break;
        }
    } while (pilihan != 6);
}

