import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        String input = "";
        int nilai = 0;
        try {
            System.out.print("Masukkan Nama anda : ");
            name = dataIn.readLine();
            System.out.print("Masukkan Nilai : ");
            input = dataIn.readLine();
            nilai = Integer.valueOf(input).intValue();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello " + name + " !");
        System.out.println("Nilai = " + nilai + " !");
    }
}
