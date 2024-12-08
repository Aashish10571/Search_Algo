/*
 Write a program to find weather the pattern exists in the string or not.
*/

public class KpmAlgorithmFindingPattern {
    static void search(String str, String pattern) {
        int strI = 0;
        int strP = 0;

        while (strI < str.length() && strP < pattern.length()) {
            if (str.charAt(strI) == pattern.charAt(strP)) {
                strI++;
                strP++;
            } else {
                while (strP >= 0) {
                    if (pattern.charAt(strP) == str.charAt(strI))
                        break;
                    else
                        strP--;
                }
                strI++;
            }

            if (strP == pattern.length() - 1) {
                System.out.println("Pattern found");
                return;
            }
        }

        System.out.println("pattern not found");
    }

    public static void main(String[] args) {
        System.out.println();

        String str = "Aashish";
        String s = "shi";

        search(str, s);
    }
}
