package com.nazarite.produce1.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public abstract class CarModel {

    //模型的各个方法执行顺序
    private List<String>  sequence=new ArrayList<>();
    //模型开始启动
    protected abstract void start();

    protected abstract void stop();

    //滴滴声
    protected abstract void   alarm();

    //引擎响起
    protected abstract void engineBoom();

    final  public void run(){
        for (int i=0;i<sequence.size();i++){
            String name=sequence.get(i);
            if (name.equalsIgnoreCase("start")){
                this.start();
            }else if (name.equalsIgnoreCase("stop")){
                this.stop();
            }else if (name.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if (name.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }


        }
    }
    final public void setSequence(ArrayList list){
              this.sequence=list;
    }


}
