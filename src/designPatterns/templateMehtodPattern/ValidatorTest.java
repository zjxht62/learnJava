package designPatterns.templateMehtodPattern;

/**
 * 测试类
 *
 * @author trevor.zhao
 * @date 2021/7/5
 */
public class ValidatorTest {
    public static void main(String[] args) {
        //声明的类型是抽象类
        EpolicyValidator doc1Validator = new Doc1Validator();
        doc1Validator.validateEpolicy();
        //生成电子保单
        //执行DOC2保单验证逻辑
        //发送邮件通知


        EpolicyValidator doc2Validator = new Doc2Validator();
        doc2Validator.validateEpolicy();
        //生成电子保单
        //从数据库读取数据
        //执行DOC2保单验证逻辑
        //发送钉钉通知
    }

}
