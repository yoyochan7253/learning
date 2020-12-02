/**
 * 减法运算操作类(具体产品类)
 *
 * @ClassName: SubOperator
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/22 11:17
 */
public class SubOperator extends AbstractOperator {

    /**
     * 减法运算获取结果
     * @param number1 数字1
     * @param number2 数字2
     */
    @Override
    void getResult(int number1, int number2) {
        if(number1 < number2){
            System.out.println("亲,不支持负数运算哦");
        }
        System.out.println(String.format("实现减法:%d-%d=%d", number1, number2, number1 - number2));
    }
}
