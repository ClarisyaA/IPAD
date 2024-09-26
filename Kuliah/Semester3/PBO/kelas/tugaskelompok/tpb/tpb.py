# Anggota Kelompok    :   - Clarisya Adeline (140810230017)  
#                         - Nazwa Nashatasya (140810230019)
#                         - Ammara Azwadiena Alfiantie (140810230073)
# Kelas               : A
# Tanggal             : Minggu, 22 September 2024
# Deskripsi           : SOAL 1 Java

# Nilai dan Lama Ujian TPB Lari 3 keliling lapangan bola (2 class)
# Input : Nama, NPM, waktu mulai, waktu selesai
# Berikan juga status “lulus” pada output A, B, C; selain itu beri status : “gagal”

# Tentukan dan tampilkan juga hasil huruf mutu dengan ketentuan :
# 0 menit 	    <= lama  <    7.5 menit	    : HM = “A”, status = “Lulus”
# 7.5 menit 	<= lama  <    12.5 menit	: HM = “B”, status = “Lulus”
# 12.5 menit 	<= lama  <    30 menit		: HM = “C”, status = “Lulus”
# 30 menit 	    <= lama 			        : HM = “D”, status = “Lulus”
# Hitung lama Ujian lari
# Tampilkan : Nama, NPM, HM, status lulus, waktu mulai, waktu selesai dan lama lari

class NilaiLari:
    def __init__(self, nama="", npm="", jam_mulai=0, menit_mulai=0, detik_mulai=0, jam_selesai=0, menit_selesai=0, detik_selesai=0):
        self.__nama = nama
        self.__npm = npm
        self.__jam_mulai = jam_mulai
        self.__menit_mulai = menit_mulai
        self.__detik_mulai = detik_mulai
        self.__jam_selesai = jam_selesai
        self.__menit_selesai = menit_selesai
        self.__detik_selesai = detik_selesai

    # Getter dan Setter
    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_npm(self):
        return self.__npm

    def set_npm(self, npm):
        self.__npm = npm

    def get_jam_mulai(self):
        return self.__jam_mulai

    def set_jam_mulai(self, jam):
        self.__jam_mulai = jam

    def get_menit_mulai(self):
        return self.__menit_mulai

    def set_menit_mulai(self, menit):
        self.__menit_mulai = menit

    def get_detik_mulai(self):
        return self.__detik_mulai

    def set_detik_mulai(self, detik):
        self.__detik_mulai = detik

    def get_jam_selesai(self):
        return self.__jam_selesai

    def set_jam_selesai(self, jam):
        self.__jam_selesai = jam

    def get_menit_selesai(self):
        return self.__menit_selesai

    def set_menit_selesai(self, menit):
        self.__menit_selesai = menit

    def get_detik_selesai(self):
        return self.__detik_selesai

    def set_detik_selesai(self, detik):
        self.__detik_selesai = detik

    def hitung_waktu_mulai(self):
        return self.__jam_mulai * 3600 + self.__menit_mulai * 60 + self.__detik_mulai

    def hitung_waktu_selesai(self):
        return self.__jam_selesai * 3600 + self.__menit_selesai * 60 + self.__detik_selesai

    def hitung_durasi(self):
        return self.hitung_waktu_selesai() - self.hitung_waktu_mulai()

    def get_durasi_jam(self):
        durasi = self.hitung_durasi()
        durasi_jam = durasi // 3600
        return durasi_jam

    def get_durasi_menit(self):
        durasi = self.hitung_durasi()
        durasi_menit = (durasi % 3600) // 60
        return durasi_menit

    def get_durasi_detik(self):
        durasi = self.hitung_durasi()
        durasi_detik = durasi % 60
        return durasi_detik

    def get_huruf_mutu(self):
        durasi_menit = self.hitung_durasi() / 60.0
        if durasi_menit < 7.5:
            return "A"
        elif durasi_menit < 12.5:
            return "B"
        elif durasi_menit < 30:
            return "C"
        else:
            return "D"

    def get_status_lulus(self):
        huruf_mutu = self.get_huruf_mutu()
        return "Lulus" if huruf_mutu in ["A", "B", "C"] else "Gagal"

    def tampilkan_hasil(self):
        durasi = self.hitung_durasi()
        durasi_jam = durasi // 3600
        durasi_menit = (durasi % 3600) // 60
        durasi_detik = durasi % 60
        
        print(f"\nNama: {self.get_nama()}")
        print(f"NPM: {self.get_npm()}")
        print(f"Waktu Mulai: {self.get_jam_mulai()}:{self.get_menit_mulai()}:{self.get_detik_mulai()}")
        print(f"Waktu Selesai: {self.get_jam_selesai()}:{self.get_menit_selesai()}:{self.get_detik_selesai()}")
        print(f"Durasi: {durasi_jam} Jam {durasi_menit} Menit {durasi_detik} Detik")
        print(f"Huruf Mutu: {self.get_huruf_mutu()}")
        print(f"Status Kelulusan: {self.get_status_lulus()}")

    def input_data(self):
        self.set_nama(input("Masukkan Nama: "))
        self.set_npm(input("Masukkan NPM: "))
        
        self.set_jam_mulai(int(input("Masukkan Jam Mulai: ")))
        self.set_menit_mulai(int(input("Masukkan Menit Mulai: ")))
        self.set_detik_mulai(int(input("Masukkan Detik Mulai: ")))

        self.set_jam_selesai(int(input("Masukkan Jam Selesai: ")))
        self.set_menit_selesai(int(input("Masukkan Menit Selesai: ")))
        self.set_detik_selesai(int(input("Masukkan Detik Selesai: ")))

def main():
    method1 = NilaiLari("Yono", "140810230001", 20, 20, 20, 20, 30, 45)
    method2 = NilaiLari()
    method3 = NilaiLari()

    while True:
        print("\n==Menu Utama==")
        print("1. Input Data")
        print("2. Cetak Data")
        print("0. Keluar")
        pilihan = int(input("Pilihan: "))

        if pilihan == 1:
            while True:
                print("\n==Menu Input Data==")
                print("1. Input Data via constructor")
                print("2. Input dari luar class")
                print("3. Input dari dalam class")
                print("0. Keluar")
                pilihan_input = int(input("Pilihan: "))

                if pilihan_input == 1:
                    print("DATA DIINPUT SECARA OTOMATIS VIA CONSTRUCTOR")
                elif pilihan_input == 2:
                    inama = input("Masukkan Nama: ")
                    method2.set_nama(inama)
                    inpm = input("Masukkan NPM: ")
                    method2.set_npm(inpm)

                    method2.set_jam_mulai(int(input("Masukkan Jam Mulai: ")))
                    method2.set_menit_mulai(int(input("Masukkan Menit Mulai: ")))
                    method2.set_detik_mulai(int(input("Masukkan Detik Mulai: ")))

                    method2.set_jam_selesai(int(input("Masukkan Jam Selesai: ")))
                    method2.set_menit_selesai(int(input("Masukkan Menit Selesai: ")))
                    method2.set_detik_selesai(int(input("Masukkan Detik Selesai: ")))
                elif pilihan_input == 3:
                    method3.input_data()  
                elif pilihan_input == 0:
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
                    onama = method1.get_nama()
                    print(f"Nama: {onama}")
                    onpm = method1.get_npm()
                    print(f"NPM: {onpm}")
                    ojam_mulai = method1.get_jam_mulai()
                    omenit_mulai = method1.get_menit_mulai()
                    odetik_mulai = method1.get_detik_mulai()
                    print(f"Waktu Mulai: {ojam_mulai}:{omenit_mulai}:{odetik_mulai}")
                    ojam_selesai = method1.get_jam_selesai()
                    omenit_selesai = method1.get_menit_selesai()
                    odetik_selesai = method1.get_detik_selesai()
                    print(f"Waktu Selesai: {ojam_selesai}:{omenit_selesai}:{odetik_selesai}")
                    odurasi = method1.hitung_durasi()
                    odurasi_jam = odurasi // 3600
                    odurasi_menit = (odurasi % 3600) // 60
                    odurasi_detik = odurasi % 60
                    print(f"Durasi: {odurasi_jam}:{odurasi_menit}:{odurasi_detik}")
                    ohuruf_mutu = method1.get_huruf_mutu()
                    print(f"Huruf Mutu: {ohuruf_mutu}")
                    ostatus_lulus = method1.get_status_lulus()
                    print(f"Status Kelulusan: {ostatus_lulus}")
                                        
                elif pilihan_output == 2:
                    print(f"Nama: {method2.get_nama()}")
                    print(f"NPM: {method2.get_npm()}")
                    print(f"Waktu Mulai: {method2.get_jam_mulai()}:{method2.get_menit_mulai()}:{method2.get_detik_mulai()}")
                    print(f"Waktu Selesai: {method2.get_jam_selesai()}:{method2.get_menit_selesai()}:{method2.get_detik_selesai()}")
                    print(f"Durasi: {method2.get_durasi_jam()} Jam {method2.get_durasi_menit()} Menit {method2.get_durasi_detik()} Detik")
                    print(f"Huruf Mutu: {method2.get_huruf_mutu()}")
                    print(f"Status Kelulusan: {method2.get_status_lulus()}")
                
                elif pilihan_output == 3:
                    method3.tampilkan_hasil()
                    
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
