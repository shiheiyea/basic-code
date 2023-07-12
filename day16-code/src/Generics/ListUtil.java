package Generics;

import java.util.ArrayList;

public class ListUtil {

    //类中定义一个静态方法addAll，用来添加多个集合的元素。

    /*
     *  参数一:集合
     *  参数二~最后:要添加的元素
     *
     * */
    public static <E> void addAll(ArrayList<E> list, E...e) {
        for (E element : e) {
            list.add(element);
        }
    }

    public void show() {
        System.out.println("玉树临风，英俊潇洒，温和儒雅的黑夜");
    }
}
