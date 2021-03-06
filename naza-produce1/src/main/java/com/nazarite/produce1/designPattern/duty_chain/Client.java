package com.nazarite.produce1.designPattern.duty_chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author:elbert
 * @Date:2019-09-02
 *
 * 责任链模式
 *                                                                                                                                               
 */

public class Client {

    public static void main(String[] args) {
        List<IWomen> list=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<3;i++){
            int l= random.nextInt(10);
            System.out.println("添加了 "+l);
            list.add(new Woman(l,"我要借钱"));
        }
        Handle father=new FatherHandle();
        Handle husband=new HusbandHandle();
        Handle son=new SonHandle();

        father.setNextHandle(husband);
        husband.setNextHandle(son);
        for (IWomen women:list
             ) {
            father.handleMessage(women);
        }

    }
}
