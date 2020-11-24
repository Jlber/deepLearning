package com.nazarite.produce1.ali;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * @Author: jeq
 * @Date: 2020/11/23 下午9:07
 * 阿里远程题练习
 *
 * 给定一个数组[1-100]，要求遍历数组，使用三个线程A、B、C，其中线程A打印3的倍数，
 * B打印5的倍数，C打印其他数字
 *
 * 要求四个线程，每一个线程执行一个打印方法。
 */
public class MuitlPrinter {
   static Semaphore sp=new Semaphore(3);

    public static void main(String[] args) {
        Map map=new HashMap();
        Object aa= map.put("11","222");
        Object bb= map.put("11","333");
        System.out.println(aa==null);//第一次put 返回null  Hashset 就用这个去重的
        System.out.println(bb==null);


    }
    public static void printer(int [] array){
        Runnable threadA=()->{
            sp.tryAcquire();
        };
    }

}
