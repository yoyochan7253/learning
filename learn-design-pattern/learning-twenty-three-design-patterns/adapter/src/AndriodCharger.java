/**
 * 安卓手机充电器
 *
 * @ClassName: AndriodCharger
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/12 10:44
 */
public class AndriodCharger implements IMicroUsbInterface {

    @Override
    public void chargeWithMicroUsbInterface() {
        System.out.println("用Microusb头充电中");
    }
}
