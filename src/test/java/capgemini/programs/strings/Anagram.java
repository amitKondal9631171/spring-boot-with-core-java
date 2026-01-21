package capgemini.programs.strings;

/**
 * Two strings are anagrams if they are written using the same exact letters,
 * ignoring space, punctuation, and capitalization. Each letter should have the same
 * count in both strings. For example, the Army and Mary are an anagram of each other.
 */
public class Anagram {

    static boolean isAnagram(String s1, String s2) {

        //ignoring space, punctuation (special characters, commas etc), and capitalization.
        String regularExp = "[^a-zA-Z]";
        s1 = s1.toLowerCase().replaceAll(regularExp,"");
        s2 = s2.toLowerCase().replaceAll(regularExp,"");

        if (s1.length() != s2.length()) {
            return false;
        }

        for (char c : s1.toLowerCase().toCharArray()) {
            //This if condition means string s1 character not found in string s2
            if (! s2.contains(String.valueOf(c)))
                return false;

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Is Anagram ? " + isAnagram("Ar m y . >", "2 m 1 a r y?") );
        System.out.println("Is Anagram ? " + isAnagram("Vr m y . >", "2 m 1 a r y?") );

    }
}

