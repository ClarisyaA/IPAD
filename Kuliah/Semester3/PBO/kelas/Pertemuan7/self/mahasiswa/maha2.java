package Kuliah.Semester3.PBO.kelas.Pertemuan7.self.mahasiswa;

class LarikMahasiswa {
    private Mahasiswa[] mhs;
    private int ukuran;

    public LarikMahasiswa(int ukuran) {
        this.ukuran = ukuran;
        mhs = new Mahasiswa[ukuran];
    }

    public void input() {
        mhs[0] = new Mahasiswa(1, "Rudi");
        mhs[1] = new Mahasiswa(2, "Ishak");
        mhs[2] = new Mahasiswa(3, "Ali");
        mhs[3] = new Mahasiswa(4, "Ida");
        mhs[4] = new Mahasiswa(5, "Uci");
    }

    public void isiLarik(){
    for (int i=0;i<ukuran;i++){
    System.out.print(" Masukkan nilai ke-"+(i+1)+" =
    ");
    nilai[i].inputMahasiswa();
    }
    }

    public void output() {
        for (int i = 0; i < ukuran; i++)
            System.out.println("Element ke " + i + " :"
                    + mhs[i].getNPM() + " "
                    + mhs[i].getNama());
    }
}

public class maha2 {
    public static void main(String[] args) {
        LarikMahasiswa lm = new LarikMahasiswa(5);
        lm.input(); // atau lm.isiLarik
        lm.output();
    }
}
