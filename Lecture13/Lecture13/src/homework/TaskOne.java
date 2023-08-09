package homework;

/* Create two methods String encrypt(String s, int n) and String decrypt (String s, int n).
   Method encrypt should take a string and return coded string where every letter is moved on
   n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value. */

public class TaskOne {
    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + n) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }
    public static void main(String[] args) {
        String text = "abc";
        int shift = 3;

        String encryptedText = encrypt(text, shift);
        System.out.println("Encryption is: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decryption is: " + decryptedText);
    }
}
