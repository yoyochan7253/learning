/**
 * 加法运算工厂类（具体工厂类）
 *
 * @ClassName: AddOperatorFactory
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/22 10:38
 */
public class AddOperatorFactory extends AbstractOperatorFactory {
    @Override
    public AbstractOperator createOperator() {
        System.out.println("我是专门创造加法的工厂哦~");
        return new AddOperator();
    }
}
