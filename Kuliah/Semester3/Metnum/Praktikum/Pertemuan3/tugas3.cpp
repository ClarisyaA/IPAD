
#include <iostream>
#include <cmath>
using namespace std;

// f(x) = x^2 + 17x - 4
double f(double x)
{
    return x * x + 17 * x - 4;
}
// f'(x) = 2x + 17
double turunanF(double x)
{
    return 2 * x + 17;
}
// fungsi Newton-Raphson
double newtonRaphson(double x0, double error, int iterasiMaksimum)
{
    double x_n = x0;
    for (int n = 0; n < iterasiMaksimum; ++n)
    {
        double hasilfx = f(x_n);
        double hasilTurunanFX = turunanF(x_n);
        if (fabs(hasilfx) < error)
        {
            cout << "f(x) sudah lebih kecil dari toleransi error yang diberikan " << endl;
                return x_n;
        }
        double x_n1 = (x_n - (hasilfx / hasilTurunanFX));

        cout << "Iterasi " << n + 1 << ": x = " << x_n1 << ", f(x) = " << hasilfx << ", f'(x) = " << hasilTurunanFX << endl;
        if (fabs(x_n1 - x_n) < error)
        {
            cout << "f(x) sudah lebih kecil dari toleransi error yang diberikan " << endl;
                return x_n1;
        }
        x_n = x_n1;
    }
    return x_n;
}
void inputData(double &x0, double &error)
{
    cout << "Masukkan tebakan awal (x0): ";
    cin >> x0;
    cout << "Masukkan toleransi (error): ";
    cin >> error;
}
void hitung(double x0, double error)
{
    int iterasiMaksimum = 100;
    cout << "Menghitung f(x) = x^2 + 17x - 4 dengan metode Newton Rapshon" << endl;
    double akar = newtonRaphson(x0, error, iterasiMaksimum);
    cout << "Akar persamaan: " << akar << endl;
}
void menu()
{
    double x0 = 0, error = 1e-6;
    int pilihan;
    do
    {
        cout << "\nMenu:" << endl;
        cout << "f(x) = x^2 + 17x -4" << endl;
        cout << "1. Input data" << endl;

        cout << "2. Hitung menggunakan metode Newton-Raphson" << endl;
        cout << "3. Keluar dari program" << endl;
        cout << "Pilih opsi: ";
        cin >> pilihan;
        switch (pilihan)
        {
        case 1:
            cout << "PROSES UNPUT DATA" << endl;
            inputData(x0, error);
            cout << endl
                 << "Data yang diinput : " << endl;
            cout << "x0 = " << x0 << endl;
            cout << "Toleransi Error = " << error << endl;
            break;
        case 2:
            hitung(x0, error);
            break;
        case 3:
            cout << "Keluar dari program..." << endl;
            break;
        default:
            cout << "Pilihan tidak valid. Silakan pilih lagi." << endl;
            break;
        }
    } while (pilihan != 3);
}
int main()
{
    menu();
    return 0;
}
