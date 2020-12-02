/**
 * 经纪人
 *
 * @ClassName: Agent
 * @author: yoyochen copy from c语言中文网
 * @since: 2019/7/10 17:25
 */
public class Agent {

    private Star myStar;
    private Fans myFans;
    private Media myMedia;

    public void setStar(Star myStar) {
        this.myStar = myStar;
    }

    public void setFans(Fans myFans) {
        this.myFans = myFans;
    }

    public void setMedia(Media myMedia) {
        this.myMedia = myMedia;
    }

    public void meeting() {
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面了。");
    }

    public void business() {
        System.out.println(myMedia.getName() + "与明星" + myStar.getName() + "洽淡业务。");
    }
}
