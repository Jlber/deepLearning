package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public class AddRequirementCommand extends Command {

    public AddRequirementCommand() {
        super(new RequirementGroup());
    }

    public  AddRequirementCommand(Group group){
        super(group);
    }

    @Override
    protected void execute() {
        super.group.find();
        super.group.add();
        super.group.plan();

    }
}
