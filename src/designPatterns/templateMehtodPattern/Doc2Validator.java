package designPatterns.templateMehtodPattern;

/**
 * Doc2电子保单验证器，需要验证数据库，并发送钉钉通知
 *
 * @author trevor.zhao
 * @date 2021/7/5
 */
public class Doc2Validator extends EpolicyValidator {

    @Override
    public void checkRules() {
        System.out.println("执行DOC2保单验证逻辑");
    }

    @Override
    public void sendMessage() {
        System.out.println("发送钉钉通知");
    }
}
