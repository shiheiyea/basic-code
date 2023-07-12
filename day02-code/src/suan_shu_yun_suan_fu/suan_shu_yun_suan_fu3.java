package suan_shu_yun_suan_fu;

public class suan_shu_yun_suan_fu3
{
    public static void main(String[] args)
    {
        byte b1 = 10;
        byte b2 = 20;
        //(byte)b1 + b2 强转的是b1，并不是最终的结果
        byte result = (byte)(b1 + b2);
        System.out.println(result);
    }
}
