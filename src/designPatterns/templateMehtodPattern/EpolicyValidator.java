package designPatterns.templateMehtodPattern;

/**
 * 电子保单验证器，是个抽象类，用来定义模板方法
 *
 * @author trevor.zhao
 * @date 2021/7/5
 */
public abstract class EpolicyValidator {
    public final void validateEpolicy() {
        generate();
        if (isCheckDB()) {
            loadDBData();
        }
        checkRules();
        sendMessage();

    }
    //具体方法，在抽象类中已经实现，子类可以继承或重写它
    public void generate() {
        System.out.println("生成电子保单");
    }

    public void loadDBData() {
        System.out.println("从数据库读取数据");
    }

    //抽象方法，子类中实现
    public abstract void checkRules();


    //钩子方法，通过子类重写来控制流程
    public Boolean isCheckDB(){
        return true;
    }

    //钩子方法，提供一个空的实现，让子类重写
    public void sendMessage(){

    }


}
