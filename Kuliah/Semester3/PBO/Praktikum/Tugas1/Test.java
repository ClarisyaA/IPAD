/*	
  Nama	    : Clarisya Adeline
  NPM		: 1408102300917
  Kelas		: A
  Tanggal	: 4 September 2024
  Deskripsi	: Class jawaban exercise-01 soal-01
*/

package Kuliah.Semester3.PBO.Praktikum.Tugas1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n (number of strings to input)
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] inputs = new String[n];
        boolean hasEmptyString = false;

        // Read n strings
        for (int i = 0; i < n; i++) {
            inputs[i] = scanner.nextLine();
            if (inputs[i].isEmpty()) {
                hasEmptyString = true;
            }
        }

        if (hasEmptyString) {
            System.out.println("Error, ada string kosong");
        } else {
            StringBuilder concatenatedString = new StringBuilder();
            for (String s : inputs) {
                concatenatedString.append(s).append(" ");
            }
            String result = concatenatedString.toString().trim();

            System.out.println(result);
            System.out.println(result.toUpperCase().replaceAll(" ", ""));
        }

        scanner.close();
    }

    {

    }
}