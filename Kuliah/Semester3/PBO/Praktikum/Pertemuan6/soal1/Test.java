interface Cipher {
    public String encrypt(String n, int key);
    public String decrypt(String n, int key);
}

class CaesarCipher implements Cipher {
    protected String n;
    protected int key;

    public CaesarCipher() {
        n = " ";
        key = 0;
    }

    public CaesarCipher(String n, int key) {
        this.n = n;
        this.key = key;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getN() {
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
        char[] charArray = new char[n.length()];
        
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (Character.isLetter(ch)){
              char acuan = Character.isLowerCase(ch) ? 'a' : 'A';
              charArray[i] = (char) ((ch + key - acuan + 26) % 26 + acuan);
            } else {
              charArray[i] = ch; 
            }
        }
        
        return new String(charArray);
    }

    @Override
    public String decrypt(String n, int key) {
      char[] charArray = new char[n.length()];
        
      for (int i = 0; i < n.length(); i++) {
          char ch = n.charAt(i);
          if (Character.isLetter(ch)){
            char acuan = Character.isLowerCase(ch) ? 'a' : 'A';
            charArray[i] = (char) ((ch - key - acuan + 26) % 26 + acuan);
          } else {
            charArray[i] = ch; 
          }
      }
      
      return new String(charArray);
    }
}

public class Test {
    public static void main(String[] args) {
        CaesarCipher Cipher1 = new CaesarCipher();
        System.out.println(Cipher1.encrypt("PemrogramanBerorientasiObjek", 5));
        System.out.println(Cipher1.decrypt("WIVKBHWBSBOKBHLTWHA", 7)); 
        CaesarCipher Cipher2 = new CaesarCipher();
        System.out.println(Cipher2.encrypt("KAGIQDQQJBQOFUZSMFQJFNGFUFIMEYQPUA", 12));
    }
}
