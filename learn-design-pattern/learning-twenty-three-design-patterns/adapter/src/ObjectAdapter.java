/**
 * 适配器(对象适配模式，对象适配模式采用的是组合关系)
 *
 * @ClassName: ObjectAdapter
 * @author: yoyochen 代码参考HollisChuang
 * @since: 2019/7/12 12:02
 */
public class ObjectAdapter implements ILightingInterface {
    private IMicroUsbInterface microUsbInterface;

    public ObjectAdapter(IMicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightingInterface() {
        System.out.println("我来转换下接口：microUsbInterface->lightingInterface");
        microUsbInterface.chargeWithMicroUsbInterface();
    }

    public IMicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(IMicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
