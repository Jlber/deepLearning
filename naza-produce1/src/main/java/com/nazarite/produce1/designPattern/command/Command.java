package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public  abstract class Command {
   // protected CodeGroup codeGroup=new CodeGroup();
   // protected PageGroup pageGroup=new PageGroup();
  //  protected RequirementGroup requirementGroup=new RequirementGroup();
   protected Group group;

    public Command(Group group) {
        this.group = group;
    }

    protected abstract void execute();
    
}
