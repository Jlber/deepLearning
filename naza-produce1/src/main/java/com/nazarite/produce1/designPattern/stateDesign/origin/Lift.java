package com.nazarite.produce1.designPattern.stateDesign.origin;

/**
 * @Author:elbert
 * @Date:2019-08-16
 *
 *
 *
 * 缺点：若要增加状态 则每个switch都要增加代码  1扩展性 可维护性很差 2代码太长
 *   若维修时 stop状态要什么都能干，就要增加一个switch
 */

public class Lift implements ILift {
    private int state;
    @Override
    public void setState(int state) {
                this.state=state;
    }

    @Override
    public void close() {
        switch (this.state){
            case OPENNING_STATE :
                closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE :
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }



    }

    @Override
    public void open() {
        //选择可以开门的状态
        switch (this.state){
            case OPENNING_STATE :
                break;
            case CLOSING_STATE :
                openWithoutLogic();
                this.setState(OPENNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENNING_STATE);
                break;
        }

    }

    @Override
    public void run() {
        //选择可以上下运行的状态
        switch (this.state){
            case OPENNING_STATE :
                break;
            case CLOSING_STATE : //门关闭了可以运行
                runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }

    }

    @Override
    public void stop() {

        switch (this.state){
            case OPENNING_STATE :
                stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case CLOSING_STATE : //门关闭了可以停止
                stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }

    }

    private void closeWithoutLogic() {
        System.out.println("电梯关门咯-");
    }
    private void openWithoutLogic() {
        System.out.println("电梯开门了哦~");
    }

    private void runWithoutLogic() {
        System.out.println("电梯开始运行咯..");
    }
    private void stopWithoutLogic() {
        System.out.println("电梯停止运行啦！");
    }


}
