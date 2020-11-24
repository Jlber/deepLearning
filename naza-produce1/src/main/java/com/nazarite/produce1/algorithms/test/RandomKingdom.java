package com.nazarite.produce1.algorithms.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: jeq
 * HJ3
 * @Date: 2020/11/20 下午1:47
 */
public class RandomKingdom {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line = br.readLine())!= null){
            StringBuilder sb = new StringBuilder(line);

            while(sb.length()>8){
                System.out.println(sb.substring(0,8));
                sb.delete(0,8);
            }
            if(sb.length()<=8 && sb.length()>0){
                sb.append("00000000");
                System.out.println(sb.substring(0,8));
            }
        }

    }
}
