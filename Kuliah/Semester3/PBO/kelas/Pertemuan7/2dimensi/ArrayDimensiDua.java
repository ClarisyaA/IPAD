package Kuliah.Semester3.PBO.kelas.Pertemuan7.2dimensi;

public class ArrayDimensiDua {
    public static void main(String[] args) {
        int[][] piksel = new int[5][3];
        // Mengisi elemen tertentu
        piksel[0][1] = 70;
        piksel[1][1] = 18;
        piksel[1][2] = 45;
        piksel[2][1] = 75;
        piksel[3][1] = 66;
        piksel[4][0] = 89;
        // Menampilkan elemen array
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(piksel[i][j] + " ");
            System.out.println(""); // Pindah baris
        }
    }
}