/**
 * 学生成绩列表
 *
 * @ClassName: StuScoreList
 * @author: yoyochen copy from c语言中文网
 * @since: 2019/7/10 15:14
 */
public class StuScoreList implements ICountModule, IInputModule, IPrintModule{

    private StuScoreList(){}

    public static IInputModule getInputModule()
    {
        return (IInputModule)new StuScoreList();
    }
    public static ICountModule getCountModule()
    {
        return (ICountModule)new StuScoreList();
    }
    public static IPrintModule getPrintModule()
    {
        return (IPrintModule)new StuScoreList();
    }

    @Override
    public void insert()
    {
        System.out.println("输入模块的insert()方法被调用！");
    }

    @Override
    public void delete()
    {
        System.out.println("输入模块的delete()方法被调用！");
    }

    @Override
    public void modify()
    {
        System.out.println("输入模块的modify()方法被调用！");
    }

    @Override
    public void countTotalScore()
    {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }

    @Override
    public void countAverage()
    {
        System.out.println("统计模块的countAverage()方法被调用！");
    }

    @Override
    public void printStuInfo()
    {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }

    @Override
    public void queryStuInfo()
    {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
