package StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        /*
        sb.append(1);
        sb .append(2 .3) ;
        sb.append(true);
        */

        sb.reverse();

        int len = sb.length();
        System.out.println(len);

        //打印
        //普及:
        //因为stringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值。
        System.out.println(sb);
    }
}
