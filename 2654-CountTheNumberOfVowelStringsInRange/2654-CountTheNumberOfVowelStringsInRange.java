// Last updated: 5/25/2026, 11:04:06 AM
class Solution{
        public int vowelStrings(String[] words, int left, int right) {
                int count = 0;
                        String vowels = "aeiou";

                                for(int i = left; i <= right; i++) {
                                            String s = words[i];

                                                        char first = s.charAt(0);
                                                                    char last = s.charAt(s.length() - 1);

                                                                                if(vowels.indexOf(first) != -1 && vowels.indexOf(last) != -1) {
                                                                                                count++;
                                                                                                            }
                                                                                                                    }

                                                                                                                            return count;
        }}
        