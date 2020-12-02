/**
 * 适配器模式测试
 *
 * @ClassName: Main
 * @author: yoyochen
 * @since: 2019/7/12 13:55
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 水果手机原配充电中
         */
        IphoneX iphoneX = new IphoneX(new AppleCharger());
        iphoneX.charge();

        System.out.println("================我是华丽分割线=================");

        /**
         * 华为手机充电中
         */
        P30Pro p30Pro = new P30Pro(new AndriodCharger());
        p30Pro.charge();

        System.out.println("================我是华丽分割线=================");

        /**
         * 转接头(对象模式)华丽丽登场
         */
        ObjectAdapter objectAdapter = new ObjectAdapter(new AndriodCharger());
        iphoneX = new IphoneX(objectAdapter);
        iphoneX.charge();

        System.out.println("================我是华丽分割线=================");

        /**
         * 转接头(类模式)华丽丽登场
         */
        ClassAdapter classAdapter = new ClassAdapter();
        iphoneX = new IphoneX(classAdapter);
        iphoneX.charge();

        System.out.println("================我是华丽分割线=================");
        p30Pro = new P30Pro(classAdapter);
        p30Pro.charge();

        System.out.println("================我是华丽分割线=================");
        /**
         * 双向适配搞笑登台(不知道意义在哪里)
         */
        TwoSideAdapter twoSideAdapterApple = new TwoSideAdapter(new AppleCharger());
        iphoneX = new IphoneX(twoSideAdapterApple);
        iphoneX.charge();

        TwoSideAdapter twoSideAdapterAndroid = new TwoSideAdapter(new AndriodCharger());
        p30Pro = new P30Pro(twoSideAdapterAndroid);
        p30Pro.charge();
    }
}
