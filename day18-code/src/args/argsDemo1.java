package args;

public class argsDemo1 {
    public static void main(String[] args) {
        //JDK5
        //可变参数
        //方法形参的个数是可以发生变化的，0 1 2 3 ...
        //格式:属性类型...名字
        //int.. .args

        System.out.println(getSum(1, 2, 4, 3, 5, 6, 7));

    }
    //底层:
    //可变参数底层就是一一个数组
    //只不过不需要我们自己创建了，Java会帮我们创建好

    //可变参数的小细节:
    //1.在方法的形参中最多只能写一一个可变参 数
    //可变参数，理解为一一个大胖子，有多少吃多少
    //2.在方法的形参当中，如果出了可变参数以外，还有其他的形参，那么可变参数要写在最后

    //public static int getSum(int...args, int a) {
    public static int getSum(int a, int... args) {
        //System.out.println(args);
        int sum = 0;
        for (int i : args) {
            //System.out.println(i);
            sum += i;
        }
        return sum;
    }
}
