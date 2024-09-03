import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Selamat Belajar Java, input dari keyboard....");
            System.out.print("Masukkan nama anda (string) : ");
            String str = input.nextLine();
            System.out.print("Masukkan nilai (integer) : ");
            int x = input.nextInt();
            System.out.print("Masukkan nilai IPK (float) : ");
            float y = input.nextFloat();
            System.out.println("Yang diinput adalah : ");
            System.out.println("Nama : " + str);
            System.out.println("Nilai : " + x);
            System.out.println("IPK : " + y);
        } finally {
            input.close();  // Close the scanner to avoid resource leaks
        }
    }
}
