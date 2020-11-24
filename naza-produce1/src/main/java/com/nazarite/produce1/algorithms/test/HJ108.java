package com.nazarite.produce1.algorithms.test;
import java.util.*;

/**
 * @Author: jeq
 * @Date: 2020/11/23 下午3:29
 *
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数
 *
 * 输入两个正整数A和B。  (a*b)/最大公约数
 * 输出A和B的最小公倍数。 3 30   30 3  6(2,3) 16(2,2,2,2)    36(2,2,3,3) 54(2,3,3,3)
 */
public class HJ108 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
          Integer  a =  Integer.valueOf(sc.next());
          Integer  b  =  Integer.valueOf(sc.next());
          if (a==0||b==0){
              System.out.println(0);
          }

          int j= a*b;
          if (a<=b){ //16 6   6 4    4 2
              Integer tmp=a;
              a=b;
              b=tmp;
          }
              while (b!=0){
              int c = a%b;
                a =b;
                b= c;
              }
              int max= j/a;
              System.out.println(max);


        }


    }
}
