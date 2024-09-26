/*
Nama Program    : Tugas 2
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Selasa, 10 September 2024
Deskripsi       : Buat program untuk menyelesaikan contoh soal metode Regula Falsi
                  f(x) = -6x^(3) - 5x^(2) + 3x + 2
                  a = 0, b = 3
                  Lakukan iterasi sebanyak 5 kali,
                  screenshot hasilnya dan masukkan ke dalam dokumen pdf beserta kode programnya
                  c = b − (f(b)(b−a)/f(b)−f(a))
*/


#include <iostream>
using namespace std;


double pangkat(double basis, int eksponen) {
    double hasil = 1.0;
    for (int i = 0; i < eksponen; ++i) {
        hasil *= basis;
    }
    return hasil;
}


double mutlak(double nilai) {
    return (nilai < 0) ? -nilai : nilai;
}


double f(double x) {
    return -6 * pangkat(x, 3) - 5 * pangkat(x, 2) + 3 * x + 2;
}




void regulaFalsi(double a, double b, int iterasi) {
    double c;
    for (int i = 1; i <= iterasi; i++) {
        c = b - (f(b) * (b - a)) / (f(b) - f(a));
        cout << "Iterasi ke - " << i << endl;
        cout << "(a,b) = (" << a << ", " << b << ")\n"
             << "f(a)\t= " << f(a) << '\n'
             << "f(b)\t= " << f(b) << '\n'
             << "c\t= " << c << '\n'
             << "f(c)\t= " << f(c) << "\n\n";


        if (mutlak(f(c)) < 1e-6) {
            cout << "Akar ditemukan pada x = " << c << " dengan f(c) mendekati 0, f(c) = " << f(c) << endl;
            break;
        }


        if (f(c) * f(a) < 0) {
            b = c;  // b diperbarui jika f(c) dan f(𝑎) memiliki tanda yang berlawanan
        } else {
            a = c;  // a diperbarui jika f(c) dan f(b) memiliki tanda yang berlawanan
        }


        // Menampilkan nilai a dan b yang baru iterasi selesai
        cout << "Nilai a dan b setelah iterasi ke-" << i << ": \n" << "a = " << a << ", b = " << b << "\n";
        cout << "------------------------------------------------------" << endl;
    }
}


int main() {
    double a,b;
    int iterasi;


    cout << "Masukkan Nilai awal a (a,b) = "; cin >> a;
    cout << "Masukkan Nilai awal b (a,b) = "; cin >> b;
    cout << "Masukkan jumlah iterasi = "; cin >> iterasi;


    cout << "\nMencari akar menggunakan metode Regula Falsi:\n\n";
    regulaFalsi(a, b, iterasi);


}


