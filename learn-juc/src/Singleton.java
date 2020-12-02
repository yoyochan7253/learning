/**
 * TODO
 *
 * @ClassName: Singleton
 * @author: yoyochen
 * @since: 2020/11/27 0:49
 */
public class Singleton {

    private static volatile Singleton singleton = null;

    private Singleton(){
        System.out.println("begin create singleton");
    }

    public static Singleton getSingleton() {
        if(null == singleton){
            synchronized (Singleton.class){
                if(null == singleton){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()->{
                Singleton.getSingleton();
            }, String.valueOf(i)).start();
        }
    }
}
