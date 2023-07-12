package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie8;

public class mian_xiang_dui_xiang_xing_jie8 {
    public static void main(String[] args) {
        OverseaStudent stu = new OverseaStudent();
        stu.lunch();
    }
}
//在继承成员方法中根据就近原则来输出
class Person{
    public void eat() {
        System.out.println("吃饭，吃菜");
    }
    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
    //应用场景:当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写。
    //注意: 子类中重写的方法上面需要加上@Override
    @Override
    public void eat(){
        System.out.println("吃面");
    }
    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}

class Student extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
}

