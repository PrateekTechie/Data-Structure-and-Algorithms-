import java.util.ArrayList;

public class basiclist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(); // ye use hoga Integer ko store karene ke liye
        ArrayList<String> list2 = new ArrayList<>(); // ye use hoga String ko store karene ke liye
        list.add(1); // the time complexity for this is O(1) because it adds the element at the end
                     // of the list
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.add(2, 12); // the time complexity for this is O(n) because it adds the element at the
        // specified index and shifts the elements to the right

        System.out.println(list);

        // get element form the list O(1)
        // int element = list.get(1);
        // System.out.println(element);

        // remove element form the list O(n)
        // list.remove(1);
        // System.out.println(list);

        // set element form the listO(n) tum edit kar sakte ho uss index pe naya rkh
        // sakte ho
        // list.set(1, 8);
        // System.out.println(list);

        // contains method O(n) yr check karega kys list main element hai ya nahi
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}