// Last updated: 8/22/2026, 9:34:55 AM
1public class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+"); 
4        StringBuilder reversed = new StringBuilder();
5        for (String word : words) {
6            StringBuilder reversedWord = new StringBuilder(word);
7            reversedWord.reverse(); 
8            reversed.append(reversedWord).append(" "); 
9        }
10        return reversed.toString().trim();
11    }
12}