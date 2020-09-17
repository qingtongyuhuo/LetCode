package zn.zyl.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * 第三题 最长不重复字符串
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        Set<Character> set = new HashSet<>();
        int j = 0;
        for(int i = 0 ; i<chars.length ; i++){
            char cahri = chars[i];
            for(;j<chars.length ; j++){
                char charj = chars[j];
                 int temp = j-i +1;
                if(set.contains(chars[j])){
                    break ;
                }

                if(temp > length ){
                    length = temp;
                }
                set.add(chars[j]);
            }
            set.remove(chars[i]);
        }
         return length ;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbd"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
