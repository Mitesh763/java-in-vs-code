package clg_Program_5Sem_ADA;

public class Practical_16 {
    // Define prime number for hashing
    private static final int PRIME = 101;

    public static void search(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int patternHash = calculateHash(pattern, patternLength);
        int textHash = calculateHash(text, patternLength);

        for (int i = 0; i <= textLength - patternLength; i++) {
            if (patternHash == textHash && checkEquals(text, pattern, i)) {
                System.out.println("Pattern found at index " + i);
            }
            if (i < textLength - patternLength) {
                textHash = recalculateHash(text, textHash, i, patternLength);
            }
        }
    }

    private static int calculateHash(String str, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash += (int) str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private static int recalculateHash(String str, int oldHash, int oldIndex, int patternLength) {
        int newHash = oldHash - (int) str.charAt(oldIndex);
        newHash = newHash / PRIME;
        newHash += (int) str.charAt(oldIndex + patternLength) * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    private static boolean checkEquals(String text, String pattern, int startIndex) {
        for (int i = 0; i < pattern.length(); i++) {
            if (text.charAt(startIndex + i) != pattern.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "ABABCABABABABCABAB";
        String pattern = "ABAB";
        System.out.println("Pattern matching positions:");
        search(text, pattern);
    }
}
