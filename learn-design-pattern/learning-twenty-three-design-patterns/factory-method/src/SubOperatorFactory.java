/**
 * 减法运算工厂类（具体工厂类）
 *
 * @ClassName: SubOperatorFactory
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/22 11:17
 */
public class SubOperatorFactory extends AbstractOperatorFactory{
    @Override
    AbstractOperator createOperator() {
        System.out.println("我是专门创造减法的工厂哦~");
        return new SubOperator();
    }
}
