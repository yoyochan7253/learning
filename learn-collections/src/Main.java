import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Boolean testA = null;
    System.out.println(testA);



    //testMap();

    testList();

    String strA = "01";
    String strB = "00";
    String strC = "02";

    final String REGEXP_REALNAME = "[\\u4e00-\\u9fa5]{1,5}|[a-zA-Z0-9]{1,10}";

    if (!Pattern.matches(REGEXP_REALNAME, "我来啦")) {
      System.out.println("real name wrong");
    }

    BigDecimal test = new BigDecimal(0);
    BigDecimal test1 = new BigDecimal(1);

    System.out.println("bigDecimalText:" + test1.multiply(test));

    System.out.println(String.valueOf(Integer.parseInt(strA)));
    System.out.println(String.valueOf(Integer.parseInt(strB)));
    System.out.println(String.valueOf(Integer.parseInt(strC)));

    // 获取6位验证码
    for (int j = 0; j < 1; j++) {
      System.out.println((int) ((Math.random() * 9 + 1) * 100000));
    }

    System.out.println("random number finish");

    AbstractCollection<String> vcodes = new ArrayList<>();

    // 获取6位验证码
    for (int i = 0; i <= 1; i++) {
      // 加上一些字母，就可以生成pc站的验证码了
      String sources = "123456789";
      Random rand = new Random();
      StringBuffer flag = new StringBuffer();
      for (int j = 0; j < 16; j++) {
        flag.append(sources.charAt(rand.nextInt(9)) + "");
      }

      if (vcodes.contains(flag.toString())) {
        System.out.println(flag.toString());
      } else {
        vcodes.add(flag.toString());
      }
    }

    System.out.println("random number2 finish");

    String testToArrayDiffLength[] = new String[4];
    String[] a = vcodes.toArray(testToArrayDiffLength);

    // testArrayCopy();

    // Iterable iterable;
    // Collection collection;
    // AbstractCollection abstractCollection;
    AbstractList abstractList;
    // Set set;
    // Map map;
    // Deque deque;
  }

  /** List functions test */
  public static void testList() {
    List<Object> list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add(null);
    list.add(1234L);
    list.add("1234");

    if (list.contains(1234)) {

    }

    // 0.RemoveAll test
    List<Object> testReomoveAll = new ArrayList<>();
    testReomoveAll.add("aaa");
    testReomoveAll.add(null);
    list.removeAll(testReomoveAll);

    // 1.Iterator test
    Iterator<Object> iter = list.iterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
      // iter.remove();
    }

    System.out.println(list.size());

    // 2.contains test
    Object obj = null;
    System.out.println(list.contains(obj));

    // 3.containsAll
    List<Object> list2 = new ArrayList();
    list2.add("aaa");
    list2.add("ccc");

    // 4.Iterator&&containsAll effciency matching
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");

    System.out.println(sdf.format(new Date()));
    System.out.println(list.containsAll(list2));
    System.out.println(sdf.format(new Date()));

    System.out.println(sdf.format(new Date()));
    Iterator<Object> iter2 = list.iterator();

    while (iter2.hasNext()) {
      System.out.println(list.contains(iter2.next()));
      // iter.remove();
    }
    System.out.println(sdf.format(new Date()));

    // 5.retainAll test 移除list中不存在在list2中的元素,将list的元素变成list2一样的
    list.retainAll(list2);

    System.out.println("after retain:" + list.size());

    // 6.removeIf test
    List<String> test6List = new ArrayList<>();
    test6List.add("effedf");
    test6List.add("aaa");
    test6List.add("aaa");
    test6List.add("bbb");
    test6List.add("ccc");
    test6List.add("ccdd");
    test6List.add("abaac");
    test6List.add("effeghh");
    test6List.add("effeuj");

    test6List.removeIf(str -> str.contains("aa"));

    // 7.replaceAll
    /*test6List.replaceAll(
        str -> {
          if (str.length() > 3) {
            return str;
          }
          return null;
        });*/

    test6List.replaceAll(str -> str.replace("b", "aCc"));

    int i = 0;
    String sources = "ABCDEFGHIJKabcdefghijklmnopq";
    int length = sources.length();

    while (i < 100) {

      Random rand = new Random();
      StringBuffer flag = new StringBuffer();
      for (int j = 0; j < 16; j++) {
        flag.append(sources.charAt(rand.nextInt(length)) + "");
      }

      test6List.add(flag.toString());
      i++;
    }

    // 8.sort
    test6List.sort((str1, str2) -> str1.length() - str2.length());

    Iterator<String> stringIterator = test6List.iterator();

    // 9.三种方式性能测试
    // iter
    long t1 = System.currentTimeMillis();
    while (stringIterator.hasNext()) {
      String iterEle = stringIterator.next();
      if (iterEle.contains("ff")) {
        // System.out.println(iterEle);
      }
    }
    long t2 = System.currentTimeMillis();

    // stream
    List testStream = test6List.stream().filter(l -> l.contains("ff")).collect(Collectors.toList());
    long t3 = System.currentTimeMillis();

    // parallel stream
    List testParallelStream =
        test6List.parallelStream().filter(l -> l.contains("ff")).collect(Collectors.toList());

    long t4 = System.currentTimeMillis();

    System.out.println("iter time:" + (t2 - t1));
    System.out.println("stream time:" + (t3 - t2));
    System.out.println("parallel stream time:" + (t4 - t3));
  }

  public static void testMap() {
    // 1.hash map键为null测试
    Map<String, String> map = new HashMap<String, String>(7);
    map.put("beforeTest1", "aaa0");
    map.put("test4", "bbb4");
    map.put("test1", "aaa1");
    map.put("test3", "ccc3");
    map.put("test2", "bbb2");
    //map.put(null, "ccc");

    StringBuilder concatParam = new StringBuilder();
    map.entrySet().stream().sorted(Comparator.comparing(Entry::getKey)).forEach(
        e->concatParam.append(e.getKey()).append("=").append(e.getValue()).append("&")
    );

    System.out.println("concat param str:" + concatParam.toString());
    System.out.println("size of map is: " + map.size());
    System.out.println("map isEmpty: " + map.isEmpty());

    // 2.获取所有map中值集合
    Collection collectionValus = map.values();

    // 3.获取所有map中键集合, 遍历集合
    Set<String> setKeys = map.keySet();
    Iterator<String> iterKeys = setKeys.iterator();
    while (iterKeys.hasNext()) {
      System.out.println("iterKeys name: " + iterKeys.next());
    }

    // 4.获取某key中包含的值,无返回默认值
    String test4Value = map.getOrDefault("test4", "unknown");
    System.out.println("the value of test4 is: " + test4Value);

    // 5.replace(key, value)
    String test5Repalce = map.replace("test5", "abc");
    System.out.println("result of null key relace is: " + test5Repalce);
  }

  public static void testArrayCopy() {
    /** 数组复制待移位测试 */
    System.out.println("arraycopy begin");

    int[] testArrayCopy = {1, 5, 8, 6, 4, 3, 7, 9, 2, 0};

    System.arraycopy(testArrayCopy, 0, testArrayCopy, 1, 3);

    for (int number : testArrayCopy) {
      System.out.println(number);
    }

    System.out.println("arraycopy end");

    testArrayCopy[15] = 77;
  }
}
