/**
 * 加法运算操作（具体产品类）
 *
 * @ClassName: AddOperator
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/22 10:29
 */
public class AddOperator extends AbstractOperator {

    /**
     * 加法运算获取结果
     * @param number1 数字1
     * @param number2 数字2
     */
    @Override
    public void getResult(int number1, int number2){
        System.out.println(String.format("实现加法:%d+%d=%d", number1, number2, number1 + number2));
    }
}
