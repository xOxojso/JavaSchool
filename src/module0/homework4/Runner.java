package module0.homework4;

public class Runner {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
