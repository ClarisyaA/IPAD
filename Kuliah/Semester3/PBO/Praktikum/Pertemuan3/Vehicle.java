package Kuliah.Semester3.PBO.Praktikum.Pertemuan3;

public class Vehicle {
    protected String warna;
    protected int jmlRoda;

    // Constructor
    public Vehicle(String warna, int jmlRoda) {
        this.warna = warna;
        this.jmlRoda = jmlRoda;
    }

    public void setJmlRoda(int n) {
        this.jmlRoda = n;
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setWarna(String n) {
        this.warna = n;
    }

    public String getWarna() {
        return warna;
    }
}
