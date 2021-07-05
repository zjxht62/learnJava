package designPatterns.templateMehtodPattern;

/**
 * Doc1电子保单验证器，不需要验证数据库，发送邮件通知
 *
 * @author trevor.zhao
 * @date 2021/7/5
 */
public class Doc1Validator extends EpolicyValidator {

    @Override
    public void checkRules() {
        System.out.println("执行DOC2保单验证逻辑");
    }

    @Override
    public Boolean isCheckDB() {
        return false;
    }

    @Override
    public void sendMessage() {
        System.out.println("发送邮件通知");
    }
}
