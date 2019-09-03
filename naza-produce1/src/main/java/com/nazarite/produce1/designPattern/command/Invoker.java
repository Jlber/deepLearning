package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Invoker() {
    }
    public  void action(){
        this.command.execute();
    }
}
