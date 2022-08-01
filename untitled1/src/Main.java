import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.addLast(10);
        list.addLast(11);
        list.addFirst(1);
        list.addLast(12);

        for (Integer integer : list){
            System.out.println(integer);
        }
    }
}
