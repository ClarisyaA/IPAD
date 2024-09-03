#include <iostream>
using namespace std;

double hitungPi() {
    return 3.141592653589793;
}

double derajatKeRadian(double derajat) {
    return derajat * (hitungPi() / 180.0);
}

double faktorial(int n) {
    double hasil = 1.0;
    for (int i = 1; i <= n; ++i) {
        hasil *= i;
    }
    return hasil;
}

double pangkat(double basis, int eksponen) {
    double hasil = 1.0;
    for (int i = 0; i < eksponen; ++i) {
        hasil *= basis;
    }
    return hasil;
}

double mutlak(double nilai) {
    if (nilai < 0) {
        double nilaiPositif = nilai * -1;
        return nilaiPositif;
    } else {
        return nilai;
    }
}

double taylorSin(double x, double toleransi) {
    double suku = x; 
    double hasilSin = suku;
    int n = 1;

    while (mutlak(suku) > toleransi) {
        suku *= -x * x / ((2 * n) * (2 * n + 1));
        hasilSin += suku;
        ++n;
    }

    return hasilSin;
}

double galatRelatif(double nilaiAproksimak, double nilaiPendekatan) {
    return mutlak(nilaiAproksimak - nilaiPendekatan) / mutlak(nilaiAproksimak);
}

int main() {
    double derajat, toleransi;

    
    cout << "Masukkan sudut dalam derajat: ";
    cin >> derajat;

    cout << "Masukkan toleransi galat (contoh: 0.000001): ";
    cin >> toleransi;

 
    double x = derajatKeRadian(derajat);

    double hasilSin = taylorSin(x, toleransi);

    double nilaiAproksimak = 0.0;
    int tanda = 1;  

    for (int i = 0; i < 10; ++i) {
        nilaiAproksimak += tanda * pangkat(x, 2 * i + 1) / faktorial(2 * i + 1);
        tanda *= -1;  
    }

    double galat = galatRelatif(nilaiAproksimak, hasilSin);

    cout << "Nilai sin(" << derajat << " derajat) menggunakan deret Taylor: " << hasilSin << endl;
    cout << "Nilai sin(" << derajat << " derajat) (dengan 10 suku): " << nilaiAproksimak << endl;
    cout << "Galat relatif: " << galat << endl;
}