package com.nazatite.springcloudgateway.java8Test;

import org.springframework.util.Assert;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @Author:elbert
 * @Date:2019-07-26
 */

public class PredicateDemo {

    /**
     * 使用  Predicate  自定义比较逻辑(该逻辑变成了参数)
     * test  验证传入的参数是否满足函数里的逻辑
     * and  多个逻辑要同时满足
     * or   多个逻辑满足至少一个就可以
     *
     * @param args
     */
//    public static void main(String[] args) {
//        String s1 = "ko";
//        test(s1, (s) -> s.equals("pp"));
//        and(s1, (s3) -> s3.equals("pp"), (s2) -> s2.equals("ko"));
//        or(s1, (s3) -> s3.equals("pp"), (s2) -> s2.equals("ko"));
//
//    }
    public static void main(String[] args) {
       String s="dd";
       testr(s,(o)->o instanceof String);
       testO(s,(o)->o instanceof Object);
       assert Objects.nonNull(s);
       
//       if (s instanceof String){
//           System.out.println("string...");
//       }else if (s instanceof  Object){
//           System.out.println("onbj..");
//       }

    }
    private static<T> void testr(T value, Predicate<T> predicate) {
        if (predicate.test(value)){
            System.out.println("String..");
        }

    }
    private static<T> void testO(T value, Predicate<T> predicate) {
        if (predicate.test(value)){
            System.out.println("Obj...");
        }

    }
    private static void test(String value, Predicate<String> predicate) {
        System.out.println(predicate.test(value));
    }

    private static void and(String value, Predicate<String> predicate1, Predicate<String> predicate2) {
        System.out.println(predicate1.and(predicate2).test(value));
    }

    private static void or(String value, Predicate<String> predicate1, Predicate<String> predicate2) {
        System.out.println(predicate1.or(predicate2).test(value));
    }
}
