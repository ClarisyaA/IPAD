package Kuliah.Semester3.PBO.Praktikum.Pertemuan3;

public class Mobil extends Vehicle {
    protected String bahanBakar;
    protected int kapasitasMesin;

    // Constructor
    public Mobil(String warna, int jmlRoda, String bahanBakar, int kapasitasMesin) {
        super(warna, jmlRoda); // Constructor
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(String n) {
        this.bahanBakar = n;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int n) {
        this.kapasitasMesin = n;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }
}
