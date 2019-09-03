package com.nazarite.produce1.designPattern.duty_chain;

/**
 * @Author:elbert
 * @Date:2019-09-02
 */

public abstract class Handle {

    public static int FATHER_LEVEL=0;
    public static  int HUSBAND_LEVEL=1;
    public static int SON_LEVEL=2;

    private int level=0;

    private Handle nextHandle;

    public Handle(int level) {
        this.level = level;
    }

    public  final void handleMessage(IWomen iWomen){
        if (iWomen.getType()==this.level){
             this.response(iWomen);
        } else {
            if (this.nextHandle!=null){
                this.nextHandle.handleMessage(iWomen);
            }else {
                System.out.println("没人可以处理啦。。。");
            }

        }
        
    }

    protected void setNextHandle(Handle handle){
        this.nextHandle=handle;

    }


    protected abstract void response(IWomen iWomen);
}
