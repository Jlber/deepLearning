package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 * 命令模式
 */

public class Client {

    public static void main(String[] args) {

        Invoker invoker=new Invoker();
        Command command=new AddRequirementCommand();
      //  Command command=new DeletePageCommind();
        invoker.setCommand(command);
        invoker.action();

    }
}
