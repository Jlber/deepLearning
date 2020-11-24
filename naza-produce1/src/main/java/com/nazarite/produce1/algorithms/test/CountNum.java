package com.nazarite.produce1.algorithms.test;

import java.io.*;

/**
 * @Author: jeq
 * @Date: 2020/11/20 上午10:58
 * HJ2
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，
 * 然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * 输入 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 * 输出  输出输入字符串中含有该字符的个数。
 */
public class CountNum {

    public static void main(String[] args)  throws Exception{
        BufferedReader bf   =new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while ((str=bf.readLine())!=null){
         char[] chars  =  str.toLowerCase().toCharArray();
         String key =  bf.readLine().toLowerCase();
          int count=0;
          for (char c:chars){
//              if ((c>'a'&&c<'z')||(c>'A'&&c<'Z')){
//                  count++;
//              }
              if(key.equals(String.valueOf(c))){
                  count++;
              }
          }
            System.out.println(count);
        }

    }
}
