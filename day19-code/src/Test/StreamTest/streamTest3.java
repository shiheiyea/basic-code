package Test.StreamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamTest3 {
    /*现在有两个ArrayList集合,
    第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
    姓名和年龄中间用逗号隔开。比如:张三,23
    要求完成如下的操作:
    1,男演员只要名字为3个字的前两人
    2，女演员只要姓杨的，并且不要第一个
    3，把过滤后的男演员姓名和女演员姓名合并到一起
    4，将上一步的演员信息封装成Actor对象。
    5，将所有的演员对象都保存到List集合中。
    备注:演员类Actor,属性只有一个: name, age*/

    public static void main(String[] args) {
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "张无忌,15", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37");
        Collections.addAll(girlList, "周芷若,14", "赵敏,13", "白鸽,18", "小白,19", "小白喵了个咪,20", "杨过,16");

        List<String> newBoyList = boyList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2)
                .collect(Collectors.toList());

        List<String> newGirlList = girlList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .collect(Collectors.toList());

        ArrayList<String> list = new ArrayList<>();
        list.addAll(newBoyList);
        list.addAll(newGirlList);

        List<Actor> newList = list.stream()
                .map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s) {
                        String[] arr = s.split(",");
                        Actor actor = new Actor(arr[0], Integer.parseInt(arr[1]));
                        return actor;
                    }
                })
                .collect(Collectors.toList());

        for (Actor actor : newList) {
            System.out.println(actor);
        }
    }

}
