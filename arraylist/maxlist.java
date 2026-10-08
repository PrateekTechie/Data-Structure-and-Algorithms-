import java.util.ArrayList;

public class maxlist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(3);

        int max = Integer.MIN_VALUE; // ye min value ko store karega
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum value in the list is: " + max);

    }
}