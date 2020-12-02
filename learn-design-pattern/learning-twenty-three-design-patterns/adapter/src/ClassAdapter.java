/**
 * 适配器(类适配模式，类适配模式采用的是泛化关系即继承)
 *
 * @ClassName: ClassAdapter
 * @author: yoyochen
 * @since: 2019/7/12 15:18
 */
public class ClassAdapter extends AndriodCharger implements ILightingInterface{

    @Override
    public void chargeWithLightingInterface() {
        System.out.println("我是继承安卓充电器的小弟，我有两个头，开始转换接口了：microUsbInterface->lightingInterface");
        chargeWithMicroUsbInterface();
    }
}
