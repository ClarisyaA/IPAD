/*
  Nama	    : Clarisya Adeline
  NPM		    : 140810230017
  Kelas		  : A
  Tanggal	  : 22 September 2024
  Deskripsi	: Class jawaban exercise-05 soal-01
*/

public class Test {
  public static void main(String[] args) {
      CaesarCipher Cipher1 = new CaesarCipher();
      System.out.println(Cipher1.encrypt("PemrogramanBerorientasiObjek", 5)); 
      System.out.println(Cipher1.decrypt("WIVKBHWBSBOKBHLTWHA", 7));           

      Cipher Cipher2 = new CaesarCipher();
      
      System.out.println(Cipher2.encrypt("KAGIQDQQJBQOFUZSMFQJFNGFUFIMEYQPUA", 12)); 
      System.out.println(Cipher2.decrypt("YIWG!!!", 12));
  }
}