package hm13;

public class task01 {
    public static class EncryptionExample {
        public static void main(String[] args) {
            String original = "abc";
            int shift = 3;

            String encrypted = encrypt(original, shift);
            System.out.println("Encrypted: " + encrypted);

            String decrypted = decrypt(encrypted, shift);
            System.out.println("Decrypted: " + decrypted);
        }

        public static String encrypt(String s, int n) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i); // Get the character at position i in the string
                if (Character.isLetter(c)) { // Check if the character is a letter
                    char base = Character.isLowerCase(c) ? 'a' : 'A'; // Determine the base letter ('a' or 'A')
                    char encryptedChar = (char) (base + (c - base + n) % 26); // Calculate the shifted character
                    result.append(encryptedChar); // Append the shifted character to the result
                } else {
                    result.append(c); // If not a letter, append the character as is
                }
            }

            return result.toString(); // Convert the StringBuilder to a string and return
        }

        public static String decrypt(String s, int n) {
            return encrypt(s, -n); // Decrypting is the same as encrypting with a negative shift
        }
    }

}