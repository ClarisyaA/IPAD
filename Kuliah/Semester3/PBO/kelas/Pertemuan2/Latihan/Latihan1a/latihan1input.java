/*
Nama Program    : latihan1.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : HelloWorld
*/


package Latihan.Latihan1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1input {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        
        try {
            System.out.print("Masukkan Nama anda : ");
            name = dataIn.readLine();

        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Selamat Datang di Dunia Pemrograman " + name + " !");
    }
    
}
