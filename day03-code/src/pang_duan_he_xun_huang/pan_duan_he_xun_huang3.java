package pang_duan_he_xun_huang;

public class pan_duan_he_xun_huang3 {
    public static void main(String[] args) {
        //兰州拉面、武汉热干面、北京炸酱面、陕西油泼面
        //1.定义变量记录我心里想吃的面
        String noodles = "兰州拉面";

        //2.拿着这个面利用switch跟四种面条匹配
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
        }
    }
}
