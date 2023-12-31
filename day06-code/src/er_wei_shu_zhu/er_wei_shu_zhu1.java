package er_wei_shu_zhu;

public class er_wei_shu_zhu1 {
    public static void main(String[] args) {
        /*
        二维数组静态初始化格式:
                    数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1，元素2}};
        简化格式:
                    数据类型[][] 数组名 = {{元素1,元素2}，{元素1，元素2}};
        元素访问:
                    数组名[索引][索引];
        二维数组遍历:
                    先得到一维数组，再遍历一维数组获取元素
        */
        //1.二维数组静态初始化格式
        //数据类型[][] 数组名 = new 数据类型[][] [[元素1,元素2],元素1，元素2}};
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //以后建议这样定义，把每一个一维数组，单独写成一行
        //注意:每一个一维数组其实是二维数组中的元素，所以每一个一维数组之间需要用逗号隔开。最后一个一维数组后面不需要加逗号
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6,7,8}
        };
        //2.获取元素
        //System.out.printIn(arr3[0]);
        //表示获取二维数组中的第一个一维数组
        //arr3[0]:二维数组中的第一个一维数组
        //arr3[0][0]: 获取第一个一维数组中0索引的元素
        System.out.println(arr3[0][0]);//1
        //System.out.printIn(arr3[1][4]);//打印数字8
        //System.out.printIn(arr3[2][0]);//ArrayIndexOutofBoundsException
        //3、二维数组遍历
        for (int i = 0; i < arr3.length; i++) {
            //i: 表示二维数组中的每一个索引
            //arr3[i]: 表示二维数组中的每一个元素 (一维数组)
            for (int j = 0; j < arr3[i].length; j++) {
                //j:表示一维数组中的每一个元素
                System.out.print(arr3[i][j] + " ");
            }
        }
    }
}
