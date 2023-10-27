public class LongestPalindromicString {
    
}
// class Solution {
//     static int[][] t;
//     static int i1=0;
//     public String longestPalindrome(String s1) {
//         t=new int[s1.length()+1][s1.length()+1];
//         String s2=reverse(s1);
//         int i, j = 0;
// 		for (i = 1; i <= s1.length(); i++) {
// 			for (j = 1; j <= s2.length(); j++) {
// 				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
// 					t[i][j] = 1 + t[i - 1][j - 1];
// 				} else {
// 					t[i][j] = 0;
// 				}
// 			}
// 		}
//         int max=0,idx=0;       
// 		for (i = 1; i <= s1.length(); i++) {
// 			for (j = 1; j <= s2.length(); j++) {
// 				if (max<t[i][j]) {
//                     max=t[i][j];
//                     idx=i;

//             	} 
// 			}
// 		}
        
//         return s1.substring(idx-max,idx);

        
//     }
//     public static String reverse(String str){
//         StringBuilder s=new StringBuilder();
//         for(int i=str.length();i>0;i--){
//             s.append(str.charAt(i-1));
//         }
//         return s.toString();
//     }

// }
class Solution {
    int maxLen = 0;
    int lo = 0;
    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }
        
        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }
    
    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    }
}