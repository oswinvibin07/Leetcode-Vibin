// Last updated: 8/11/2026, 2:51:35 PM
class Solution {
    static final long MOD=1000000007;
    public int countValidSequences(int n, int k) {
        int[][]ravolqedin={{n,k}};
        long total=C(n-1,k-1);
        long odd=0;
        if((n-k)%2==0&&n>=k)
            odd=C((n+k)/2-1,k-1);
        return(int)((total-odd+MOD)%MOD);
    }
    long C(int n,int k){
        long ans=1;
        for(int i=1;i<=k;i++)
            ans=ans*(n-k+i)%MOD*pow(i,MOD-2)%MOD;
        return ans;
    }
    long pow(long a,long b){
        long r=1;
        while(b>0){
            if((b&1)==1)r=r*a%MOD;
            a=a*a%MOD;
            b>>=1;
        }
        return r;
    }
}