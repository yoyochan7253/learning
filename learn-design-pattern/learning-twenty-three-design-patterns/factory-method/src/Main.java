/**
 * 工厂方法模式实际调用
 *
 * @ClassName: Main
 * @author: yoyochen
 * @since: 2019/7/22 11:01
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 加法工厂生产调用
         */
        AbstractOperatorFactory addFactory = new AddOperatorFactory();
        AbstractOperator addOperator = addFactory.createOperator();

        addOperator.getResult(1,2);

        /**
         * 减法工厂生产调用
         */
        AbstractOperatorFactory subFactory = new SubOperatorFactory();
        AbstractOperator subOperator = subFactory.createOperator();

        subOperator.getResult(5,3);
    }
}
