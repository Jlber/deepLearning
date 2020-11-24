package com.nazarite.produce1.algorithms.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: jeq
 * @Date: 2020/11/24 上午10:08
 *3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3
 *
 * pwwkew  3
 */
public class Leet03 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("abcbacdb"));
    }


    /**
     * 滑动窗口进行优化
     * 时间复杂度：O(n)
     * abcbacbb  ab  abc  abcb-->  cb  cba cbac==> bac
     * map里存储每个字符最新的下标
     * @param s
     * @return
     * 8 ms  在所有 Java 提交中击败了66%的用户
     * 内存38MB
     *
     */
    public  static int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int left=0;
        int max=0;
        for (int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max= Math.max(max,i-left+1);

        }
        return max;
    }


    /**自己的第一次的暴力解法
     * 执行用时：
     * 1075 ms  在所有 Java 提交中击败了5.00%的用户
     * 内存消耗：39.1 MB 在所有 Java 提交中击败了 35.58%的用户
     * 时间复杂度：O(n3)
     * @param s
     * @return
     */

    public  static int lengthOfLongestSubstring(String s) {
        int max=0;
        char[] charArray=s.toCharArray();
        for (int i=0; i<charArray.length;i++ ){
           char[]  array2=s.substring(i).toCharArray();
            Set set=new HashSet();
            for (int j=0;j<array2.length;j++){
                char c = array2[j];
                boolean result= set.add(c);
                if (result){
                    if (j==(array2.length-1)){
                        if ((j+1)>max){
                            max=(j+1);
                        }
                    }
                    continue;
                }else {
                    if (j>max){
                        max=j;
                    }
                    break;
                }
            }

        }

        return max;
    }
    // 这里用了Set只能按顺序找出无重复子串
//    public  static int lengthOfLongestSubstring(String s) {
//        Set set=new HashSet();
//        char[] charArray=s.toCharArray();
//        for (int i=0; i<charArray.length;i++ ){
//           char c = charArray[i];
//           boolean result= set.add(c);
//           if (result){
//               if (i==(charArray.length-1)){
//                   return i+1;
//               }
//               continue;
//           }else {
//              return i;
//           }
//        }
//
//
//
//
//        return 0;
//    }
}
