package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public class DeletePageCommind extends Command {
    public DeletePageCommind() {
        super(new PageGroup());
    }
    public DeletePageCommind(Group group) {
        super(group);
    }

    @Override
    protected void execute() {
        super.group.find();
        super.group.delete();
        super.group.plan();
    }
}
