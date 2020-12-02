/**
 * 运算工厂类（抽象工厂类）
 *
 * @ClassName: AbstractOperatorFactory
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/22 10:50
 */
public abstract class AbstractOperatorFactory {

    /**
     * 抽象工厂
     * @return
     */
    abstract AbstractOperator createOperator();
}
