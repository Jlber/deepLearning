package com.nazarite.produce1.reflect;

import javax.validation.constraints.AssertTrue;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-09-01
 *
 * 模仿ResolverUtil  写一个找符合我女朋友要求的类
 */

public class GirlResolverUtil {

    public interface  Require{

        boolean match(Object content);
        String getType();
    }

    public  static class HightRequire implements Require{
        private Integer hight;

        public HightRequire(Integer hight) {
           this.hight = hight;
        }

        @Override
        public boolean match(Object content) {
            return this.hight.intValue()<170&&this.hight.intValue()>155;
        }
        @Override
        public String getType(){
            return "身高";
        }
    }

    public static class WeightRequire implements Require{

        private Integer weight;

        public WeightRequire(Integer weight) {
            this.weight = weight;
        }

        @Override
        public boolean match(Object content) {
            return this.weight.intValue()>85&&this.weight.intValue()<115;
        }
        @Override
        public String getType(){
            return "体重";
        }
    }

    public static void main(String[] args) {
        List<Require> requires=new ArrayList<>();
        requires.add( new WeightRequire(new Integer(100)));
        requires.add(new HightRequire(new Integer(176)));

        for (Require r:requires){
           if (r.match(new Object())){
               System.out.println(r.getType()+"符合要求");
           }
        }

    }


}
