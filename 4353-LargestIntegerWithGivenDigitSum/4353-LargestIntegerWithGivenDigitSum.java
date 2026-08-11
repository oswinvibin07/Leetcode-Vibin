// Last updated: 8/11/2026, 2:51:40 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s>n*9){
            return -1;
        }
        int result=0;
        for(int i=0;i<n;i++){
            int digit=Math.min(9,s);
            result=result*10+digit;
            s-=digit;
        }
        return result;
    }
}