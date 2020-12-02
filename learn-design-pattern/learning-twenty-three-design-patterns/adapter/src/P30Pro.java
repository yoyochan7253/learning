/**
 * 华为P30Pro
 *
 * @ClassName: P30Pro
 * @author: yoyochen
 * @since: 2019/7/12 10:36
 */
public class P30Pro {

    private IMicroUsbInterface microUsbInterface;

    public P30Pro(IMicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge(){
        System.out.println("开始给P30Pro充电啦");
        microUsbInterface.chargeWithMicroUsbInterface();
        System.out.println("给P30Pro充电完成");
    }

    public IMicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(IMicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
