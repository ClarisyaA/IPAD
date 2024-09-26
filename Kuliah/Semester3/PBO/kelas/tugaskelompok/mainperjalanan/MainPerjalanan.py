# Anggota Kelompok    :   - Clarisya Adeline (140810230017)  
#                         - Nazwa Nashatasya (140810230019)
#                         - Ammara Azwadiena Alfiantie (140810230073)
# Kelas               : A
# Tanggal             : Minggu, 22 September 2024
# Deskripsi           : SOAL 2 Phyton

# Buat program mencari lama perjalanan seseorang :
#     • Input tgl Berangkat, tgl kedatangan, jam berangkat, jam kedatangan
#     • Tanggal (tglhari, bulan, tahun)
#     • Waktu (jam, menit, detik)
# Tampilan :
# Berangkat 
#     • Tanggal       : 1
#     • Bulan         : 1
#     • Tahun         : 2023
#     • Jam           : 10
#     • Menit         : 10
#     • Detik         : 10
# Kedatangan 
#     • Tanggal       : 3
#     • Bulan         : 1
#     • Tahun         : 2023
#     • Jam           : 9
#     • Menit         : 10
#     • Detik         : 10
# Lama Perjalanan     : 1 hari 23 Jam

class Perjalanan:
    def __init__(self, tglB=0, blnB=0, thnB=0, jamB=0, menitB=0, detikB=0, tglK=0, blnK=0, thnK=0, jamK=0, menitK=0, detikK=0):
        self.tglBerangkat = tglB
        self.bulanBerangkat = blnB
        self.tahunBerangkat = thnB
        self.jamBerangkat = jamB
        self.menitBerangkat = menitB
        self.detikBerangkat = detikB
        self.tglKedatangan = tglK
        self.bulanKedatangan = blnK
        self.tahunKedatangan = thnK
        self.jamKedatangan = jamK
        self.menitKedatangan = menitK
        self.detikKedatangan = detikK

    def input_data(self):
        self.tglBerangkat = int(input("Masukkan Tanggal Berangkat: "))
        self.bulanBerangkat = int(input("Masukkan Bulan Berangkat: "))
        self.tahunBerangkat = int(input("Masukkan Tahun Berangkat: "))
        self.jamBerangkat = int(input("Masukkan Jam Berangkat: "))
        self.menitBerangkat = int(input("Masukkan Menit Berangkat: "))
        self.detikBerangkat = int(input("Masukkan Detik Berangkat: "))

        self.tglKedatangan = int(input("\nMasukkan Tanggal Kedatangan: "))
        self.bulanKedatangan = int(input("Masukkan Bulan Kedatangan: "))
        self.tahunKedatangan = int(input("Masukkan Tahun Kedatangan: "))
        self.jamKedatangan = int(input("Masukkan Jam Kedatangan: "))
        self.menitKedatangan = int(input("Masukkan Menit Kedatangan: "))
        self.detikKedatangan = int(input("Masukkan Detik Kedatangan: "))

    def tampilkan_data(self):
        print("\nWaktu Berangkat: ")
        print(f"{self.tglBerangkat}/{self.bulanBerangkat}/{self.tahunBerangkat}")
        print(f"{self.jamBerangkat}:{self.menitBerangkat}:{self.detikBerangkat}")

        print("\nWaktu Kedatangan: ")
        print(f"{self.tglKedatangan}/{self.bulanKedatangan}/{self.tahunKedatangan}")
        print(f"{self.jamKedatangan}:{self.menitKedatangan}:{self.detikKedatangan}")

        print("\nLama Perjalanan: ")
        print(f"{self.get_selisih_hari()} Hari {self.get_selisih_jam()} Jam {self.get_selisih_menit()} Menit {self.get_selisih_detik()} Detik")

    def hitung_waktu_berangkat(self):
        return (self.detikBerangkat + self.menitBerangkat * 60 + self.jamBerangkat * 3600 + self.tglBerangkat * 86400)

    def hitung_waktu_kedatangan(self):
        return (self.detikKedatangan + self.menitKedatangan * 60 + self.jamKedatangan * 3600 + self.tglKedatangan * 86400)

    def hitung_durasi(self):
        return self.hitung_waktu_kedatangan() - self.hitung_waktu_berangkat()

    def get_selisih_hari(self):
        return self.hitung_durasi() // 86400

    def get_selisih_jam(self):
        return (self.hitung_durasi() % 86400) // 3600

    def get_selisih_menit(self):
        return (self.hitung_durasi() % 3600) // 60

    def get_selisih_detik(self):
        return self.hitung_durasi() % 60

def main():
    method1 = Perjalanan(1, 1, 2023, 10, 10, 10, 3, 1, 2023, 9, 10, 10)  # Via constructor
    method2 = Perjalanan()  # Via setter
    method3 = Perjalanan()  # Via input langsung

    while True:
        print("\n== Menu Utama ==")
        print("1. Cetak Data Input via Constructor")
        print("2. Input Data via Setter")
        print("3. Input Data dari Luar")
        print("4. Cetak Data via Getter")
        print("5. Cetak Data dari Luar")
        print("0. Keluar")
        pilihan = int(input("Pilihan: "))

        if pilihan == 1:
            print("Cetak Data via Constructor")
            method1.tampilkan_data()

        elif pilihan == 2:
            print("Input Data via Setter")
            tglBerangkat = int(input("Masukkan Tanggal Berangkat: "))
            method2.tglBerangkat = tglBerangkat
            blnBerangkat = int(input("Masukkan Bulan Berangkat: "))
            method2.bulanBerangkat = blnBerangkat
            thnBerangkat = int(input("Masukkan Tahun Berangkat: "))
            method2.tahunBerangkat = thnBerangkat
            jamBerangkat = int(input("Masukkan Jam Berangkat: "))
            method2.jamBerangkat = jamBerangkat
            menitBerangkat = int(input("Masukkan Menit Berangkat: "))
            method2.menitBerangkat = menitBerangkat
            detikBerangkat = int(input("Masukkan Detik Berangkat: "))
            method2.detikBerangkat = detikBerangkat
            tglKedatangan = int(input("\nMasukkan Tanggal Kedatangan: "))
            method2.tglKedatangan = tglKedatangan
            blnKedatangan = int(input("Masukkan Bulan Kedatangan: "))
            method2.bulanKedatangan = blnKedatangan
            thnKedatangan = int(input("Masukkan Tahun Kedatangan: "))
            method2.tahunKedatangan = thnKedatangan
            jamKedatangan = int(input("Masukkan Jam Kedatangan: "))
            method2.jamKedatangan = jamKedatangan
            menitKedatangan = int(input("Masukkan Menit Kedatangan: "))
            method2.menitKedatangan = menitKedatangan
            detikKedatangan = int(input("Masukkan Detik Kedatangan: "))
            method2.detikKedatangan = detikKedatangan
            print("Data berhasil diinput via Setter.")

        elif pilihan == 3:
            print("Input Data dari Luar")
            method3.input_data()

        elif pilihan == 4:
            print("Cetak Data via Getter")
            method2.tampilkan_data()

        elif pilihan == 5:
            print("Cetak Data dari Luar")
            method3.tampilkan_data()

        elif pilihan == 0:
            print("Program selesai.")
            break

        else:
            print("Pilihan tidak valid!")


main()
