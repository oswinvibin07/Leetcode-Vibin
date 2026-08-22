// Last updated: 8/22/2026, 9:49:48 AM
1class Solution {
2    public boolean makeEqual(String[] words) {
3      if (words.length == 1) {
4			return true;
5		}
6		int totalCharCount = 0;
7		for (String s : words) {
8			totalCharCount += s.length();
9		}
10		if (totalCharCount % words.length != 0) {
11			return false;
12		}
13
14		int[] myMap = new int[26];
15		for (String s : words) {
16			for (char c : s.toCharArray()) {
17				myMap[c - 'a']++;
18			}
19		}
20		for (int i : myMap) {
21			if (i % words.length != 0) {
22				return false;
23			}
24		}
25		return true; 
26    }
27}