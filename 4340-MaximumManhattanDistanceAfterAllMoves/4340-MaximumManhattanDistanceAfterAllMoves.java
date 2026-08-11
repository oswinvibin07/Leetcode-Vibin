// Last updated: 8/11/2026, 2:51:37 PM
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0;
        int blanks=0;
        for(char ch:moves.toCharArray()){
            switch(ch){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case '_':
                    blanks++;
                    break;
                    
                    
            }
        }
        return Math.abs(x)+Math.abs(y)+blanks;
        
    }
}