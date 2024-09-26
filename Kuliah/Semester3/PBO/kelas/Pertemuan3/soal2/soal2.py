#  Nama Program   :Soal2.java
#  Nama           :Clarisya Adeline
#  NPM            :140810230017
#  Kelas          :A
#  Tanggal        :10 September 2024
#  Deskripsi      :Soal 2

def main():
    print("Masukkan baris :")
    tinggi = int(input())  # Misalnya tinggi = 3
    
    # Total baris = tinggi * 2 - 1
    for i in range(tinggi * 2 - 1):
        # Mengatur jumlah bintang pada setiap baris berdasarkan kondisi
        for j in range(tinggi):
            # Jika baris i < tinggi (sebelum atau di tengah)
            if i < tinggi:
                if j < tinggi - i:
                    print("*", end="")
            # Jika baris i >= tinggi (setelah tengah)
            else:
                if j < i - tinggi + 2:
                    print("*", end="")
        print()  # Pindah ke baris berikutnya

main()
