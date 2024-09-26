/*
  Nama	    : Clarisya Adeline
  NPM		: 140810230017
  Kelas		: A
  Tanggal	: 22 September 2024
  Deskripsi	: Class jawaban exercise-05 soal-02
*/

abstract class Cipher {
    protected int key;   
    protected String n;

    public abstract String encrypt(String n, int key);
    public abstract String decrypt(String n, int key);
}

class CaesarCipher extends Cipher {

    public CaesarCipher() {
        this.key = 0;
        this.n = "";
    }

    public CaesarCipher(int key, String n) {
        this.key = key;
        this.n = n;
    }

    public void setn(String n) {
        this.n = n;
    }

    public String getn() {
        return this.n;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    @Override
    public String encrypt(String n, int key) {
        String encryptedText = "";

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch + key - 'A') % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch + key - 'a') % 26 + 'a');
            }

            encryptedText += ch;
        }

        return encryptedText;
    }

    @Override
    public String decrypt(String n, int key) {
        return encrypt(n, 26 - (key % 26));
    }
}

class Test {
    public static void main(String[] args) {
      CaesarCipher Cipher1 = new CaesarCipher();
      System.out.println(Cipher1.encrypt("AWBUUIRSDOB", 12));
      System.out.println(Cipher1.decrypt("YIWG!!!", 14));
    }
  }
  