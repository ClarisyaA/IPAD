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
    
    def get_tgl_berangkat(self):
        return self.tglBerangkat

    def set_tgl_berangkat(self, tgl):
        self.tglBerangkat = tgl

    def get_bulan_berangkat(self):
        return self.bulanBerangkat

    def set_bulan_berangkat(self, bulan):
        self.bulanBerangkat = bulan

    def get_tahun_berangkat(self):
        return self.tahunBerangkat

    def set_tahun_berangkat(self, tahun):
        self.tahunBerangkat = tahun

    def get_jam_berangkat(self):
        return self.jamBerangkat

    def set_jam_berangkat(self, jam):
        if jam < 0:
            raise ValueError("Jam Berangkat tidak boleh negatif.")
        self.jamBerangkat = jam

    def get_menit_berangkat(self):
        return self.menitBerangkat

    def set_menit_berangkat(self, menit):
        if menit < 0:
            raise ValueError("Menit Berangkat tidak boleh negatif.")
        self.menitBerangkat = menit

    def get_detik_berangkat(self):
        return self.detikBerangkat

    def set_detik_berangkat(self, detik):
        if detik < 0:
            raise ValueError("Detik Berangkat tidak boleh negatif.")
        self.detikBerangkat = detik

    def get_tgl_kedatangan(self):
        return self.tglKedatangan

    def set_tgl_kedatangan(self, tgl):
        self.tglKedatangan = tgl

    def get_bulan_kedatangan(self):
        return self.bulanKedatangan

    def set_bulan_kedatangan(self, bulan):
        self.bulanKedatangan = bulan

    def get_tahun_kedatangan(self):
        return self.tahunKedatangan

    def set_tahun_kedatangan(self, tahun):
        self.tahunKedatangan = tahun

    def get_jam_kedatangan(self):
        return self.jamKedatangan

    def set_jam_kedatangan(self, jam):
        if jam < 0:
            raise ValueError("Jam Kedatangan tidak boleh negatif.")
        self.jamKedatangan = jam

    def get_menit_kedatangan(self):
        return self.menitKedatangan

    def set_menit_kedatangan(self, menit):
        if menit < 0:
            raise ValueError("Menit Kedatangan tidak boleh negatif.")
        self.menitKedatangan = menit

    def get_detik_kedatangan(self):
        return self.detikKedatangan

    def set_detik_kedatangan(self, detik):
        if detik < 0:
            raise ValueError("Detik Kedatangan tidak boleh negatif.")
        self.detikKedatangan = detik

    def hitung_waktu_berangkat(self):
        return (self.detikBerangkat + self.menitBerangkat * 60 + 
                self.jamBerangkat * 3600 + self.tglBerangkat * 86400)

    def hitung_waktu_kedatangan(self):
        return (self.detikKedatangan + self.menitKedatangan * 60 + 
                self.jamKedatangan * 3600 + self.tglKedatangan * 86400)

    def hitung_durasi(self):
        return self.hitung_waktu_kedatangan() - self.hitung_waktu_berangkat()

    def get_selisih_hari(self):
        selisih = self.hitung_durasi()
        return selisih // 86400

    def get_selisih_jam(self):
        selisih = self.hitung_durasi()
        return (selisih % 86400) // 3600

    def get_selisih_menit(self):
        selisih = self.hitung_durasi()
        return (selisih % 3600) // 60

    def get_selisih_detik(self):
        selisih = self.hitung_durasi()
        return selisih % 60

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


def main():
    method1 = Perjalanan(1, 1, 2023, 10, 10, 10, 3, 1, 2023, 9, 10, 10)
    method2 = Perjalanan()
    method3 = Perjalanan()

    while True:
        print("\n== Menu Utama ==")
        print("1. Input Data")
        print("2. Cetak Data")
        print("0. Keluar")
        pilihan = int(input("Pilihan: "))

        if pilihan == 1:
            while True:
                print("\n== Menu Input Data ==")
                print("1. Input Data via constructor")
                print("2. Input dari luar class")
                print("3. Input dari dalam class")
                print("0. Keluar")
                pilihanInput = int(input("Pilihan: "))

                if pilihanInput == 1:
                    print("DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR")
                    
                elif pilihanInput == 2:
                    tglBerangkat = int(input("Masukkan Tanggal Berangkat: "))
                    method2.set_tgl_berangkat(tglBerangkat)
                    blnBerangkat = int(input("Masukkan Bulan Berangkat: "))
                    method2.set_bulan_berangkat(blnBerangkat)
                    thnBerangkat = int(input("Masukkan Tahun Berangkat: "))
                    method2.set_tahun_berangkat(thnBerangkat)
                    jamBerangkat = int(input("Masukkan Jam Berangkat: "))
                    method2.set_jam_berangkat(jamBerangkat)
                    menitBerangkat = int(input("Masukkan Menit Berangkat: "))
                    method2.set_menit_berangkat(menitBerangkat)
                    detikBerangkat = int(input("Masukkan Detik Berangkat: "))
                    method2.set_detik_berangkat(detikBerangkat)
                    tglKedatangan = int(input("\nMasukkan Tanggal Kedatangan: "))
                    method2.set_tgl_kedatangan(tglKedatangan)
                    blnKedatangan = int(input("Masukkan Bulan Kedatangan: "))
                    method2.set_bulan_kedatangan(blnKedatangan)
                    thnKedatangan = int(input("Masukkan Tahun Kedatangan: "))
                    method2.set_tahun_kedatangan(thnKedatangan)
                    jamKedatangan = int(input("Masukkan Jam Kedatangan: "))
                    method2.set_jam_kedatangan(jamKedatangan)
                    menitKedatangan = int(input("Masukkan Menit Kedatangan: "))
                    method2.set_menit_kedatangan(menitKedatangan)
                    detikKedatangan = int(input("Masukkan Detik Kedatangan: "))
                    method2.set_detik_kedatangan(detikKedatangan)
                    
                elif pilihanInput == 3:
                    method3.input_data()
                    
                elif pilihanInput == 0:
                    print("Kembali ke Menu Utama")
                    break
                else:
                    print("Masukkan pilihan yang sesuai!")
        elif pilihan == 2:
            while True:
                print("\n==Menu Cetak Data==")
                print("1. Cetak Data via constructor")
                print("2. Cetak dari luar class")
                print("3. Cetak dari dalam class")
                print("0. Keluar")
                pilihan_output = int(input("Pilihan: "))

                if pilihan_output == 1:
                    tgl_berangkat = method1.get_tgl_berangkat()
                    bln_berangkat = method1.get_bulan_berangkat()
                    thn_berangkat = method1.get_tahun_berangkat()
                    jam_berangkat = method1.get_jam_berangkat()
                    menit_berangkat = method1.get_menit_berangkat()
                    detik_berangkat = method1.get_detik_berangkat()
                    print("\nWaktu Berangkat :")
                    print(f"{tgl_berangkat}/{bln_berangkat}/{thn_berangkat}")
                    print(f"{jam_berangkat}:{menit_berangkat}:{detik_berangkat}")
                    tgl_kedatangan = method1.get_tgl_kedatangan()
                    bln_kedatangan = method1.get_bulan_kedatangan()
                    thn_kedatangan = method1.get_tahun_kedatangan()
                    jam_kedatangan = method1.get_jam_kedatangan()
                    menit_kedatangan = method1.get_menit_kedatangan()
                    detik_kedatangan = method1.get_detik_kedatangan()
                    print("\nWaktu Kedatangan :")
                    print(f"{tgl_kedatangan}/{bln_kedatangan}/{thn_kedatangan}")
                    print(f"{jam_kedatangan}:{menit_kedatangan}:{detik_kedatangan}")
                    print("\nLama Perjalanan :")
                    print(f"{method1.get_selisih_hari()} Hari {method1.get_selisih_jam()} Jam {method1.get_selisih_menit()} Menit {method1.get_selisih_detik()} Detik")

                elif pilihan_output == 2:
                    print("\nWaktu Berangkat :")
                    print(f"{method2.get_tgl_berangkat()}/{method2.get_bulan_berangkat()}/{method2.get_tahun_berangkat()}")
                    print(f"{method2.get_jam_berangkat()}:{method2.get_menit_berangkat()}:{method2.get_detik_berangkat()}")
                    print("\nWaktu Kedatangan :")
                    print(f"{method2.get_tgl_kedatangan()}/{method2.get_bulan_kedatangan()}/{method2.get_tahun_kedatangan()}")
                    print(f"{method2.get_jam_kedatangan()}:{method2.get_menit_kedatangan()}:{method2.get_detik_kedatangan()}")
                    print("\nLama Perjalanan :")
                    print(f"{method2.get_selisih_hari()} Hari {method2.get_selisih_jam()} Jam {method2.get_selisih_menit()} Menit {method2.get_selisih_detik()} Detik")

                elif pilihan_output == 3:
                    method3.tampilkan_data()

                elif pilihan_output == 0:
                    print("Kembali ke Menu Utama")
                    break

                else:
                    print("Masukkan pilihan yang sesuai!")
                    
        elif pilihan == 0:
            print("Program selesai.")
            break
        else:
            print("Pilihan tidak valid!")


main()
