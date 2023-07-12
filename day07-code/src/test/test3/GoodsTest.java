package test.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001","华为mate30",5999.0,100);
        Goods g2 = new Goods("002","红米至尊k50",3300.0,100);
        Goods g3 = new Goods("003", "手机壳",20.0,200);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }
    }
}
