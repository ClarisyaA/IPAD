package Kuliah.Semester3.PBO.kelas.Pertemuan7.self.array;

public class foreach {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        int[] A = { 4, 5, 6, 7, 8 };
        for (int i : A) {
            System.out.println(i);
        }

        System.out.println();

        int[] B = new int[6];
        B[0] = 6;
        B[1] = 5;
        //B[2 - 5] = 0 (default)
        for (int i : B) {
            System.out.println(i);
        }

    }
}
