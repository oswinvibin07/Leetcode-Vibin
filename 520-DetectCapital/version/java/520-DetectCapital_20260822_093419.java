// Last updated: 8/22/2026, 9:34:19 AM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        if(word.length() == 0 || word.length() == 1) return true;
4        
5        if(Character.isUpperCase(word.charAt(0))){
6            boolean isFirstCharacter = Character.isUpperCase(word.charAt(1));
7            for(int i = 2; i < word.length(); i++){
8                boolean currentCharState = Character.isUpperCase(word.charAt(i));
9                if(currentCharState != isFirstCharacter) return false;
10            }
11        }else{
12            for(int i = 1; i < word.length(); i++){
13                if(Character.isUpperCase(word.charAt(i))) return false;
14            }
15        }
16        return true;
17    }
18}