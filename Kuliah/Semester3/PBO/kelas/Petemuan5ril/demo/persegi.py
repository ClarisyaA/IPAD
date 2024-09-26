class Persegi:
    def __init__(self, panjang, lebar):
        self.panjang = panjang
        self.__lebar = lebar  # jadi private dg nama atribut pakai __

    def setPersegi(self, panjang, lebar):
        self.panjang = panjang
        self.__lebar = lebar

    def setPanjang(self, panjang):
        self.panjang = panjang

    def setLebar(self, lebar):
        self.__lebar = lebar

    def getPanjang(self):
        return self.panjang

    def getLebar(self):
        return self.__lebar

    def inputPersegi(self):
        panjang = input("Masukkan panjang persegi panjang = ")
        lebar = input("Masukkan lebar persegi panjang = ")
        self.panjang = float(panjang)
        self.__lebar = float(lebar)

    def hitLuas(self):
        return self.panjang * self.__lebar

    def cetakPersegi(self):
        print("Pencetakan di dalam class")
        print("Panjang persegi panjang = ", self.panjang)
        print("Lebar persegi panjang = ", self.__lebar)
        print("Luas persegi panjang = ", self.hitLuas(), "\n")


# Objek 1 via constructor / Init dg constanta
print("Objek 1 via constructor / Init dg constanta")
myPsg1 = Persegi(5, 3)  # objek 1
myPsg1.cetakPersegi()
luas = myPsg1.hitLuas()
print("Panjang persegi panjang (akses dari luar class) = ", myPsg1.panjang)  # Bisa
print("Lebar persegi panjang (akses dari luar class) = ", myPsg1.getLebar())
print("Luas persegi panjang (di luar class) ", luas, "\n")

# ---------------------------------------------------------------------
print("Objek 2 via init, dengan input di luar")
panjang = float(input("Masukkan panjang persegi panjang = "))
lebar = float(input("Masukkan lebar persegi panjang = " ))
myPsg2 = Persegi(panjang, lebar)  # objek 2
print("\n")
print("Luas persegi panjang (di luar class) ", myPsg2.hitLuas())
myPsg2.cetakPersegi()
print("\n")

# -----------------------------------------------------------------
print("Objek 3, dengan input di dalam")
myPsg3 = Persegi(0, 0)  # objek 3
myPsg3.inputPersegi()
myPsg3.cetakPersegi()
