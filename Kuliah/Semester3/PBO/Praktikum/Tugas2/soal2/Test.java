package Kuliah.Semester3.PBO.Praktikum.Tugas2.soal2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import Kuliah.Semester3.PBO.Praktikum.Tugas2.soal2.furniture;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<furniture> daftarBarang = new ArrayList<>();

        System.out.print("Total Perabotan : ");
        int total = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= total; i++) {
            System.out.print("Perabotan ke - " +  i  + ": ");
            String nama = input.nextLine();
            
            System.out.print("Harga : ");
            int harga = input.nextInt();
            input.nextLine();
            
            System.out.print("Warna : ");
            String warna = input.nextLine();
            System.out.println();

            furniture barang = new furniture(nama, harga, warna);
            daftarBarang.add(barang);
        }
        
        System.out.println("-------------------------------------");
        for (int i = 0; i < daftarBarang.size(); i++) {
            daftarBarang.get(i).tampilkanDeskripsi(i+1);
        }
        
        input.close();
    }
}
