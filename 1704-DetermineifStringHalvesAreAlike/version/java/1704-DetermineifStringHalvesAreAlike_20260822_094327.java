// Last updated: 8/22/2026, 9:43:27 AM
1public class Solution {
2    public boolean halvesAreAlike(String s) {
3        Set<Character> vowels = new HashSet<>();
4        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
5        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
6
7        int vowelsCount = 0;
8        int midIndex = s.length() / 2;
9
10        for (int i = 0; i < midIndex; i++) {
11            char charA = s.charAt(i);
12            char charB = s.charAt(midIndex + i);
13            if (vowels.contains(charA)) vowelsCount++;
14            if (vowels.contains(charB)) vowelsCount--;
15        }
16
17        return vowelsCount == 0;
18    }
19}
20
21