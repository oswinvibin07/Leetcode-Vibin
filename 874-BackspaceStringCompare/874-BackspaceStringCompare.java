// Last updated: 8/11/2026, 2:54:00 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> str=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
                continue;
            }
            else{
                st.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#'){
                if(!str.isEmpty()){
                    str.pop();
                }
                continue;
            }
            else{
                str.push(ch);
            }
        }
        return str.equals(st);
    }
}