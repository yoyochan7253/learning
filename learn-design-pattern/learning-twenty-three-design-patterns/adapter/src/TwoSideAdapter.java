/**
 * 双向适配模式
 *
 * @ClassName: TwoSideAdapter
 * @author: yoyochen
 * @since: 2019/7/12 16:43
 */
public class TwoSideAdapter implements ILightingInterface, IMicroUsbInterface {

    /**
     * 水果手机充电器
     */
    private AppleCharger appleCharger;

    /**
     * 安卓手机充电器
     */
    private AndriodCharger andriodCharger;

    public TwoSideAdapter(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public TwoSideAdapter(AndriodCharger andriodCharger) {
        this.andriodCharger = andriodCharger;
    }

    @Override
    public void chargeWithLightingInterface() {
        System.out.println("天呐~ 我长了双手双脚耶！转换接口开始：lightingInterface->microUsbInterface");
        andriodCharger.chargeWithMicroUsbInterface();
    }

    @Override
    public void chargeWithMicroUsbInterface() {
        System.out.println("天呐~ 我长了双手双脚耶！转换接口开始：microUsbInterface->lightingInterface");
        appleCharger.chargeWithLightingInterface();
    }
}
