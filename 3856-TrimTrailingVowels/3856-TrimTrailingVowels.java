// Last updated: 9/29/2026, 10:34:17 PM
class Solution {
    public String trimTrailingVowels(String s) {
        int i = s.length() - 1;

    while (i >= 0 && isVowel(s.charAt(i))) {
        i--;
    }

    return s.substring(0, i + 1);
}

static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' ||
           c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' ||
           c == 'O' || c == 'U';
}
}