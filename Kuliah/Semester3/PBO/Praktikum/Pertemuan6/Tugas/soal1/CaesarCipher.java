public class CaesarCipher implements Cipher {
    private int key;   
    private String n;
  
    public CaesarCipher() {
        this.key = 0;
        this.n = "";
    }

    public CaesarCipher(int key, String n) {
        this.key = key;
        this.n = n;
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
            if (Character.isLetter(ch)) {
                char dasar = Character.isLowerCase(ch) ? 'a' : 'A';
                charArray[i] = (char) ((ch + key - dasar + 26) % 26 + dasar);
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
            if (Character.isLetter(ch)) {
                char dasar = Character.isLowerCase(ch) ? 'a' : 'A';
                charArray[i] = (char) ((ch - key - dasar + 26) % 26 + dasar);
            } else {
                charArray[i] = ch; 
            }
        }

        return new String(charArray);
    }
}
