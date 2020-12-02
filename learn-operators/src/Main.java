import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

/**
 * 运算符学习
 *
 * @author yoyochen
 * @date 2018/6/13
 */
public class Main {

    public static void main(String[] args) {
        testMathOperators();
        testWeiOperators();
        int n = 500;
        int r = 0;      // Becomes 1 if any 1 bits are shifted off
        while (n >= 32) {
            r |= (n & 1);
            n >>= 1;
        }

        System.out.println(n + r);

        // (2+8) >>> 1
        //   10
        // 1000
        // 1010
        // 0101

        //(7+8) >>> 1
        //  111
        // 1000
        // 1111
        //  111
        int a = (7+8) >>> 1;
        System.out.println("右移后的结果:" + a);

    }

    /**
     * 算术运算符测试
     */
    private static void testMathOperators(){
        int a = 1;
        int b = 1;

        System.out.println("a++=" + (a++));
        System.out.println("++b=" + (++b));
    }

    /**
     * 测试位运算符
     */
    private static void testWeiOperators(){
        /**
         * 数字测试
         */
        // 1000
        // 1010
        // 1111
        int tmp = 8;
        int a = 10;
        int b = 15;

        // 10011100010000
        int c = 10000;
        // 1000 1010
        int d = -10;

        // 1000
        System.out.println("tmp&a is " + (tmp & a));
        // 1010 = 10
        System.out.println("a&b is " + (a & b));
        // 1111 = 15
        System.out.println("a|b is " + (a | b));
        // 0101 = 5
        System.out.println("a^b is " + (a ^ b));
        // 0000 1010
        // 1111 0101
        System.out.println("~a is " + (~a));

        // 0010 0111 0001 0000
        // 1101 1000 1110 1111
        System.out.println("~c is " + (~c));

        // 0000 1000
        // 1111 0111
        System.out.println("~tmp is " + (~tmp));
        // 1000 1010
        // 1111 0101
        // 1111 0110
        // 0000 1001 = 9
        System.out.println("~d is " + (~d));

        // 1010
        // 101000 = 40
        System.out.println("a << 2 is " + (a << 2));

        // 1010
        // 10 = 2
        System.out.println("a >> 2 is " + (a >> 2));

        // 1000 0000 0000 0000 0000 0000 0000 1010 原码
        // 1111 1111 1111 1111 1111 1111 1111 0101 反码
        // 1111 1111 1111 1111 1111 1111 1111 0110 补码
        // 1111 1111 1111 1111 1111 1111 1111 1101 右移
        // 1000 0000 0000 0000 0000 0000 0000 0010 反码
        // 1000 0000 0000 0000 0000 0000 0000 0011 补码
        System.out.println("d >> 2 is " + (d >> 2));

        // 1010
        // 101 = 5
        System.out.println("a >>> 1 is " + (a >>> 1));

        // 1000 0000 0000 0000 0000 0000 0000 1010 原码 32bit
        // 1111 1111 1111 1111 1111 1111 1111 0101 反码
        // 1111 1111 1111 1111 1111 1111 1111 0110 补码
        //  1111 1111 1111 1111 1111 1111 1111 011 右移
        System.out.println("d >>> 1 is " + (d >>> 1));

        /**
         * 字符测试
         */
        char chA = 'a';
        char chB = 'c';
        // 1100001
        // 1100011
        // 1100001 = 97
        System.out.println("chA & chB is " + (chA & chB));
    }
}
