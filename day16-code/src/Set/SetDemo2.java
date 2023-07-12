package Set;

public class SetDemo2 {
    public static void main(String[] args) {
        /*
            哈希值:
                对象的整数表现形式
                1.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
                2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
                3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)
        */

        //1.创建对象
        Student1 s1 = new Student1("zhangsan", 23);
        Student1 s2 = new Student1("zhangsan", 23);

        //2.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
        //如果已经 重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        System.out.println(s1.hashCode());//-1461067292
        System.out.println(s2.hashCode());//-1461067292

        //在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样
        //哈希碰撞
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354

    }
}
