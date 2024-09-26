
#  Nama Program   :Soal1.java
#  Nama           :Clarisya Adeline
#  NPM            :140810230017
#  Kelas          :A
#  Tanggal        :12 September 2024
#  Deskripsi      :Koordinat kartesian dengan java, cpp dan python
#                  T.titikTengah1(A,B)
#                  T=B.titikTengah2(A)
#                  C.cerminX(A)
#                  D=A.cerminY()

class Koordinat:
    def __init__(self, absis=0, ordinat=0):
        """Constructor untuk menginisialisasi absis dan ordinat."""
        self.absis = absis  # Atribut untuk nilai absis (X)
        self.ordinat = ordinat  # Atribut untuk nilai ordinat (Y)

    def get_absis(self):
        """Getter untuk absis."""
        return self.absis

    def set_absis(self, absis):
        """Setter untuk absis."""
        self.absis = absis

    def get_ordinat(self):
        """Getter untuk ordinat."""
        return self.ordinat

    def set_ordinat(self, ordinat):
        """Setter untuk ordinat."""
        self.ordinat = ordinat

    def input_koordinat(self):
        """Metode untuk memasukkan koordinat dari input pengguna."""
        self.absis = float(input("Masukkan absis: "))
        self.ordinat = float(input("Masukkan ordinat: "))

    def print_koordinat(self):
        """Metode untuk menampilkan koordinat."""
        print(f"Nilai Absis = {self.absis}")
        print(f"Nilai Ordinat = {self.ordinat}")

    def titik_tengah(self, P):
        """Metode untuk menghitung titik tengah dengan objek lain."""
        return Koordinat((self.absis + P.absis) / 2, (self.ordinat + P.ordinat) / 2)

    def cermin_x(self):
        """Metode untuk mencerminkan koordinat terhadap sumbu X."""
        return Koordinat(self.absis, -self.ordinat)

    def cermin_y(self):
        """Metode untuk mencerminkan koordinat terhadap sumbu Y."""
        return Koordinat(-self.absis, self.ordinat)


def main():
    ttk1 = Koordinat(2, 1)  # Membuat objek ttk1 dengan koordinat (2, 1)
    ttk2 = Koordinat()       # Membuat objek ttk2 tanpa inisialisasi
    ttk3 = Koordinat()       # Objek untuk titik tengah
    ttk4 = Koordinat()       # Objek untuk pencerminan

    # Menampilkan Titik Pertama
    print("Titik Pertama")
    ttk1.print_koordinat()
    print()

    # Menampilkan Titik Kedua
    print("Titik Kedua")
    ttk2.set_ordinat(6)  # Mengatur ordinat ttk2
    ttk2.set_absis(3)    # Mengatur absis ttk2
    ttk2.print_koordinat()
    print()

    # Mencari titik tengah
    print("Titik Tengah")
    ttk3 = ttk2.titik_tengah(ttk1)  # Menghitung titik tengah dari ttk1 dan ttk2
    ttk3.print_koordinat()
    print()

    print("---------------------------")
    print("Titik untuk dicerminkan")
    ttk4.input_koordinat()  # Memasukkan koordinat untuk pencerminan
    ttk4.print_koordinat()
    print()

    # Pencerminan terhadap sumbu X
    print("Pencerminan sumbu X")
    cermin_x_result = ttk4.cermin_x()  # Mencerminkan ttk4 terhadap sumbu X
    cermin_x_result.print_koordinat()
    print()

    # Pencerminan terhadap sumbu Y
    print("Pencerminan sumbu Y")
    cermin_y_result = ttk4.cermin_y()  # Mendapatkan hasil pencerminan terhadap sumbu Y
    cermin_y_result.print_koordinat()
    print()


if __name__ == "__main__":
    main()
