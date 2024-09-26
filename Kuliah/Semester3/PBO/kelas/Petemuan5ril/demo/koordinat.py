class Koordinat:
    def __init__(self, absis, ordinat):
        self.__absis = absis
        self.__ordinat = ordinat

    # Method Input
    def setKoordinat(self, pAbsis, pOrdinat):
        self.__absis = pAbsis
        self.__ordinat = pOrdinat

    def setAbsis(self, pAbsis):
        self.__absis = pAbsis

    def setOrdinat(self, pOrdinat):
        self.__ordinat = pOrdinat

    def inputKoordinat(self):
        absis = input("Masukkan absis: ")
        ordinat = input("Masukkan ordinat: ")
        self.__absis = float(absis)
        self.__ordinat = float(ordinat)

    # Method Output
    def getAbsis(self):
        return self.__absis

    def getOrdinat(self):
        return self.__ordinat

    def printKoordinat(self):
        print("Nilai Absis =", self.__absis)
        print("Nilai Ordinat =", self.__ordinat)

    def printKoordinat2(self):
        print(f"({self.__absis}; {self.__ordinat})")

    # Proses
    def titikTengah(self, P1, P2):
        self.__absis = (P1.__absis + P2.__absis) / 2
        self.__ordinat = (P1.__ordinat + P2.__ordinat) / 2

    def titikTengah2(self, P):
        pHasil = Koordinat(0, 0)
        pHasil.__absis = (P.__absis + self.__absis) / 2
        pHasil.__ordinat = (P.__ordinat + self.__ordinat) / 2
        return pHasil


# Program Utama (main)
ttk1 = Koordinat(2, 1)
ttk2 = Koordinat(0, 0)
ttk3 = Koordinat(0, 0)
ttk4 = Koordinat(0, 0)

print("Titik Pertama")
print("Nilai Absis =", ttk1.getAbsis())  # 2
print("Nilai Ordinat =", ttk1.getOrdinat())  # 1

print("Titik Kedua")
ttk2.setKoordinat(6, 3)
ttk2.printKoordinat()  # (6,3)

print("Titik Tengah Cara void --> ttk1 dan ttk2")
ttk4.titikTengah(ttk1, ttk2)  # (2,1) dan (6,3)
ttk4.printKoordinat()  # (4,2)

print("Titik Ketiga")
ttk3.inputKoordinat()
print("Koordinat Titik Ketiga:")
ttk3.printKoordinat()

print("Titik Tengah Cara fungsi return --> ttk1 dan ttk3")
ttk4 = ttk1.titikTengah2(ttk3)
ttk4.printKoordinat()  # (4,3)
