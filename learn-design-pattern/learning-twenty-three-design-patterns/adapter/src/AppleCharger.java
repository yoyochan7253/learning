/**
 * 苹果手机充电器
 *
 * @ClassName: AppleCharger
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/12 10:44
 */
public class AppleCharger implements ILightingInterface{

    @Override
    public void chargeWithLightingInterface() {
        System.out.println("用Lighting头充电中");
    }
}
