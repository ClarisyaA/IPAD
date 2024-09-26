class Waktu:
    def __init__(self, jam=0, menit=0, detik=0):
        self.jam = jam
        self.menit = menit
        self.detik = detik

    def ubah_detik(self):
        return self.jam * 3600 + self.menit * 60 + self.detik

    def tampilkan_waktu(self):
        print(f"{self.jam:02}:{self.menit:02}:{self.detik:02}")

    @staticmethod
    def hitung_durasi(mulai, selesai):
        return selesai.ubah_detik() - mulai.ubah_detik()

    def input_waktu(self, label):
        print(f"Masukkan {label}:")
        self.jam = int(input("Jam: "))
        self.menit = int(input("Menit: "))
        self.detik = int(input("Detik: "))
        print()

class UjianLari:
    def __init__(self, nama="", npm="", waktu_mulai=None, waktu_selesai=None):
        self.nama = nama
        self.npm = npm
        self.waktu_mulai = waktu_mulai if waktu_mulai else Waktu()
        self.waktu_selesai = waktu_selesai if waktu_selesai else Waktu()

    def input_data(self):
        self.nama = input("Masukkan Nama: ")
        self.npm = input("Masukkan NPM: ")
        print()

        # Input Waktu Mulai
        self.waktu_mulai.input_waktu("Waktu Mulai")

        # Input Waktu Selesai
        while True:
            self.waktu_selesai.input_waktu("Waktu Selesai")
            if self.waktu_selesai.ubah_detik() >= self.waktu_mulai.ubah_detik():
                break
            print("Waktu selesai tidak boleh lebih kecil dari waktu mulai. Silakan coba lagi.")

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

    def hitung_durasi(self):
        return Waktu.hitung_durasi(self.waktu_mulai, self.waktu_selesai)

    def tampilkan_hasil(self):
        durasi = self.hitung_durasi()
        durasi_jam = durasi // 3600
        durasi_menit = (durasi % 3600) // 60
        durasi_detik = durasi % 60

        print(f"\nNama: {self.nama}")
        print(f"NPM: {self.npm}")
        print("Waktu Mulai: ", end="")
        self.waktu_mulai.tampilkan_waktu()
        print("Waktu Selesai: ", end="")
        self.waktu_selesai.tampilkan_waktu()
        print(f"Durasi: {durasi_jam} Jam {durasi_menit} Menit {durasi_detik} Detik")
        print(f"Huruf Mutu: {self.get_huruf_mutu()}")
        print(f"Status Kelulusan: {self.get_status_lulus()}")

def main():
    method1 = UjianLari("Yono", "140810230001", Waktu(20, 20, 20), Waktu(20, 30, 45))
    method2 = UjianLari()
    method3 = UjianLari()

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
                    print("Nama: Yono")
                    print("NPM: 140810230001")
                    print("\nJam Mulai: 20")
                    print("Menit Mulai: 20")
                    print("Detik Mulai: 20\n")
                    print("Jam Selesai: 20")
                    print("Menit Selesai: 30")
                    print("Detik Selesai: 45\n")
                elif pilihan_input == 2:
                    method2.input_data()
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
                print("2. Cetak Data dari luar class")
                print("3. Cetak Data dari dalam class")
                print("0. Keluar")
                pilihan_output = int(input("Pilihan: "))

                if pilihan_output == 1:
                    method1.tampilkan_hasil()
                elif pilihan_output == 2:
                    method2.tampilkan_hasil()
                elif pilihan_output == 3:
                    method3.tampilkan_hasil()
                elif pilihan_output == 0:
                    print("Kembali ke Menu Utama")
                    break
                else:
                    print("Masukkan pilihan yang sesuai!")

        elif pilihan == 0:
            print("Terima kasih!")
            break

        else:
            print("Masukkan pilihan yang sesuai!")

if __name__ == "__main__":
    main()
