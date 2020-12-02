/**
 * 测试实现Runnable接口实现多线程
 *
 * @ClassName: TestParallelismRunnable
 * @author: yoyochen
 * @since: 2020/6/5 15:36
 */
public class TestParallelismRunnable implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used to create a thread,
     * starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may take any action
     * whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("我是实现接口线程");
    }


}
