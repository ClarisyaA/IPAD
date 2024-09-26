
#  Nama Program   :soal1.py
#  Nama           :Clarisya Adeline
#  NPM            :140810230017
#  Kelas          :A
#  Tanggal        :29 Agustus 2024
#  Deskripsi      :Soal 1

def inputNilai():
    n = int(input("Masukkan nilai n: "))
    r = int(input("Masukkan nilai r: "))
    return n, r

def faktorial(nilai):
    hasil = 1
    for i in range(2, nilai + 1):
        hasil *= i
    return hasil

def kombinasi(n, r):
    return faktorial(n) / (faktorial(n - r) * faktorial(r))

def outputHasil(perhitungan, hasil):
    print(f"Hasil {perhitungan}: {hasil}")

def menu():
    while True:
        print("\nMenu:")
        print("1. Cari Faktorial")
        print("2. Cari Kombinasi")
        print("3. Selesai")
        choice = int(input("Pilih menu: "))

        if choice == 1:
            nilai = int(input("Masukkan nilai untuk faktorial: "))
            hasilFak = faktorial(nilai)
            outputHasil("Faktorial", hasilFak)
        elif choice == 2:
            n, r = inputNilai()
            hasilKomb = kombinasi(n, r)
            outputHasil("Kombinasi", hasilKomb)
        elif choice == 3:
            print("Selesai")
            break
        else:
            print("Pilihan tidak valid, coba lagi.")

if __name__ == "__main__":
    menu()
