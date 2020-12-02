/**
 * IphoneX类
 *
 * @ClassName: IphoneX
 * @author: yoyochen
 * @since: 2019/7/12 10:35
 */
public class IphoneX {

    /**
     * 接口属于手机的一部分所以是对象(属性)
     */
    private ILightingInterface lightingInterface;

    public IphoneX(ILightingInterface lightingInterface) {
        this.lightingInterface = lightingInterface;
    }

    /**
     * 充电是个行为所以是方法
     */
    public void charge() {
        System.out.println("开始给IphoneX充电啦");
        lightingInterface.chargeWithLightingInterface();
        System.out.println("给IphoneX充电完成");
    }

    public ILightingInterface getLightingInterface() {
        return lightingInterface;
    }

    public void setLightingInterface(ILightingInterface lightingInterface) {
        this.lightingInterface = lightingInterface;
    }
}
