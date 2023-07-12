package Generics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        /*MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("ddd");
        list.add("ccc");

        System.out.println(list);*/

        MyArrayList1<Integer> list2 = new MyArrayList1<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);

        int i = list2.get(0);
        System.out.println(i);
    }
}
