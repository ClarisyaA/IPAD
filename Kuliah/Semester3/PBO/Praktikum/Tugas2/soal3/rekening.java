package Kuliah.Semester3.PBO.Praktikum.Tugas2.soal3;

import java.util.Scanner;

public class rekening {
    private int balance = 0;

    public int getbalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rekening bank= new rekening();

        int op;

        do {
        System.out.println("Menu :");
        System.out.println("1. Get ");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Keluar ");

        System.out.print("Pilih = ");

        op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println("Saldo : " + bank.getbalance());
                System.out.println();
                break;

            case 2:
                System.out.print("Masukkan jumlah deposit : ");
                int depo = input.nextInt();
                bank.deposit(depo);
                System.out.println("Saldo : " + bank.getbalance());
                System.out.println();
                break;

            case 3:
                System.out.print("Masukkan jumlah withdraw : ");
                int withd = input.nextInt();
                bank.withdraw(withd);
                System.out.println("Saldo : " + bank.getbalance());
                System.out.println();
                break;

            case 4:
                System.out.println("Keluar...");
                break;
            
            default:
                System.err.println("Nomor Invalid!");
                break;
         }  
        } while (op != 4);

        input.close();
    }
}
