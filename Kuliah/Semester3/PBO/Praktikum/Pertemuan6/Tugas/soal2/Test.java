abstract class Cipher {
    protected String n;
    protected int key;

    public Cipher() {
        this.n = " ";
        this.key = 0;
    }

    public Cipher(String n, int key) {
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

    public abstract String encrypt(String n, int key);
    public abstract String decrypt(String n, int key);
}

class CaesarCipher extends Cipher {
    
    public CaesarCipher() {
        super();
        n = "";
        key = 0;
    }

    public CaesarCipher(String n, int key) {
        super(n, key);
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

public class Test {
    public static void main(String[] args) {
        CaesarCipher Cipher1 = new CaesarCipher();
        System.out.println(Cipher1.encrypt("AWBUUIRSDOB", 12));
        System.out.println(Cipher1.decrypt("YIWG!!!", 14));
    }
}
