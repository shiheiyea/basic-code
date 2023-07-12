package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie11;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("在炒菜");
    }
}
