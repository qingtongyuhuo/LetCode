package zn.zyl.longestPalindrome;

class Solution {
    public static String longestPalindrome(String s) {
        if(s == null ||s.length() == 0){
            return s;
        }
        String ss = s.charAt(0) + "";
        for(int i = 0 ,length = s.length() ;i<length ;i++ ){
            boolean y = true;
            boolean x = true;
             for (int j = 1;;j++){
                 int a = i-j;
                 int b = i+j;
                 int c = a+1;
                 boolean flag = false;
                 if(a >=0 && b<=s.length()-1 && s.charAt(a) == s.charAt(b)){
                     if(y && ss.length() < j*2+1 ){
                         ss = s.substring(a,b+1);
                     }
                     flag = true;
                 }else{
                     y = false;
                 }
                 if(c >=0 && b<=s.length()-1 && s.charAt(c) == s.charAt(b)){
                     if(x&&ss.length() < j*2){
                         ss = s.substring(c,b+1);
                     }
                     flag = true;
                 }else{
                     x = false;
                 }
                 if(!flag)
                 break;
             }
        }
        return ss;
    }

    public static void main(String[] args) {
        System.out.println(Solution.longestPalindrome("aaabaaaa"));
        System.out.println(Solution.longestPalindrome("ccc"));
        System.out.println(Solution.longestPalindrome("bb"));
        System.out.println(Solution.longestPalindrome("babad"));
        System.out.println(Solution.longestPalindrome("cbbd"));
        System.out.println(Solution.longestPalindrome("a"));
    }
}