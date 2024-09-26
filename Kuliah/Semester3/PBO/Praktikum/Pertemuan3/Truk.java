package Kuliah.Semester3.PBO.Praktikum.Pertemuan3;

public  class Truk extends Mobil {
    protected int muatanMaks;

    // Constructor
    public Truk(String warna, int jmlRoda, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        super(warna, jmlRoda, bahanBakar, kapasitasMesin); // Constructor
        this.muatanMaks = muatanMaks;
    }

    public void setMuatanMaks(int n) {
        this.muatanMaks = n;
    }

    public int getMuatanMaks() {
        return muatanMaks;
    }
}