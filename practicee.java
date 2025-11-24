import java.util.ArrayList;

public class practicee {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(1,1);

        System.out.println(list);
        System.out.println(list.get(3));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
