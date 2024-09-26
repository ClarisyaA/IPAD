#  Nama Program   :Soal3.py
#  Nama           :Clarisya Adeline
#  NPM            :140810230017
#  Kelas          :A
#  Tanggal        :10 September 2024
#  Deskripsi      :Soal 3

def main():
    ayam = int(input("Banyak anak ayam: "))
    
    for i in range(ayam, 0, -1):
        if i > 1:
            print(f"Anak ayam turunlah {i}")
            print(f"Mati Satu tinggalah {i-1}")
        else:
            print("Mati Satu tinggal induknya.")
main()
