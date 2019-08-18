package com.nazatite.springcloudgateway.queue;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author:elbert
 * @Date:2019-08-13
 */

public class LinkedBlockingQueueTest {

    private static final LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(100);


    public static void main(String[] args) {
        Executors.newFixedThreadPool(5).execute(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    String time = LocalTime.now().toString();
                    queue.put("现在是" + time);
                    System.out.println(time + "已经put了");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        ExecutorService service= Executors.newFixedThreadPool(5);
        for (int i=0;i<199;i++){
            service .execute(() -> {
                while (true) {
                    try {
                        String s = queue.take();
                        System.out.println(s + "已经take了"+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });
        }



    }


}
