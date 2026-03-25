class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] S1count=new int[26];
        int[] window=new int[26];

        for(char a:s1.toCharArray()){
            S1count[a-'a']++;

        }
        int k=s1.length();

        for(int i=0;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;

            if(i>=k)
            window[s2.charAt(i-k)-'a']--;

            if(match(window,S1count))
            return true;
        }
        return false;
    }
    

    boolean match(int[] a, int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}
