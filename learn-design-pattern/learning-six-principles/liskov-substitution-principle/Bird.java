/**
 * 鸟
 *
 * @ClassName: Bird
 * @author: yoyochen copy from c语言中文网
 * @since: 2019/7/10 15:59
 */
public class Bird {

    /**
     * 飞行速度
     */
    double flySpeed;

    /**
     * 设置飞行速度
     * @param speed 飞行速度
     */
    public void setSpeed(double speed)
    {
        flySpeed=speed;
    }

    /**
     * 获取飞行时间
     * @param distance 距离
     * @return
     */
    public double getFlyTime(double distance)
    {
        return(distance/flySpeed);
    }
}
