package API.Math;

public class MathDemo1 {
    public static void main(String[] args) {
        /*
        public static int abs(int a)                            获取参数绝对值
        public static double ceil(double a)                     向上取整
        public static double floor(double a)                    向下取整
        public static int round(float a)                        四舍五入
        public static int max(int a,int b)                      获取两个int值中的较大值
        public static double pow(double a, double b)            返回a的b次幂的值
        public static double random()                           返回值为double的随机值，范围[0.0,1.0)
        */

        //abs 获取参数绝对值
        System.out.println(Math.abs(-100));//100
        System.out.println(Math.abs(-250));//250
        System.out.println("----------------------------------");

        //bug:
        //以int类型为例，取值范围:  -2147483648 ~ 2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //-2147483648没有正数与之对应，所以abs结 果产生bug
        /*System.out.println(Math. abs(-2147483647)); //2147483647
        System.out.println(Math. absExact(-2147483648));*/

        //进一法，往数轴的正方向进一
        System.out.println(Math.ceil(15.4));//16
        System.out.println(Math.ceil(15.6));//16
        System.out.println(Math.ceil(-16.9));//16
        System.out.println(Math.ceil(-16.1));//16
        System.out.println("----------------------------------");

        //去尾法，往数轴的负方向退一
        System.out.println(Math.floor(16.4));//16
        System.out.println(Math.floor(16.6));//16
        System.out.println(Math.floor(-15.9));//16
        System.out.println(Math.floor(-15.1));//16
        System.out.println("----------------------------------");

        //四舍五入
        System.out.println(Math.round(15.4));//15
        System.out.println(Math.round(15.5));//16
        System.out.println(Math.round(-15.5));//15
        System.out.println(Math.round(-15.6));//16
        System.out.println("----------------------------------");

        //获取两个整数的较大值
        System.out.println(Math.max(7, 16));
        //获取两个整数的较小值
        System.out.println(Math.min(7, 16));
        System.out.println("----------------------------------");

        //获取a的b次幂
        System.out.println(Math.pow(2, 4));
        //细节
        //如果第二个参数0 ~ 1之间的小数
        System.out.println(Math.pow(16, 0.25));
        System.out.println(Math.pow(16, -0.25));
        //建议
        //第二个参数：一般传递大于等于1的正整数
        System.out.println(Math.sqrt(16));//开平方根
        System.out.println(Math.cbrt(8)); //开立方根
        System.out.println("----------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100) + 1);
            //Math.random() [0.0, 1.0)
            // * 100        [0.0, 100.0)
            //floor         去掉后面的小数
            //+1            [1.0, 100]
        }
    }
}
