import java.util.Scanner;

public class AnagramChecker {

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {

        // Step 1: Agar length hi alag hai, to definitely anagram nahi ho sakte
        if (str1.length() != str2.length()) return false;

        int xor = 0;                 // XOR ka variable, initially 0
        int[] freq = new int[256];  // Har ASCII character ke liye frequency array

        // Step 2: Dono strings ke characters ko ek saath process karte hain
        for (int i = 0; i < str1.length(); i++) {
            xor ^= str1.charAt(i) ^ str2.charAt(i);  // Dono characters ka XOR lete hain
            freq[str1.charAt(i)]++;                  // str1 ke char ki count +1
            freq[str2.charAt(i)]--;                  // str2 ke char ki count -1
        }

        // Step 3: Agar XOR 0 nahi hai, to mismatch hai
        if (xor != 0) return false;

        // Step 4: Frequency array check karte hain - har element 0 hona chahiye
        for (int count : freq) {
            if (count != 0) return false;
        }

        // Agar sab sahi nikla, to ye anagram hain
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner class se input lete hain

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();  // Pehla string input

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();  // Dusra string input

        // Anagram check kar rahe hain
        if (areAnagrams(str1, str2)) {
            System.out.println("✅ Strings are anagrams.");
        } else {
            System.out.println("❌ Strings are not anagrams.");
        }

        scanner.close(); // Scanner band karna good practice hai
    }
}
