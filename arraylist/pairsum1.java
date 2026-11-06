import java.util.*;

public class pairsum1 {

    // using by the two pointer approch
    public static boolean pairsum1(ArrayList<Integer> List, int target) {
        int lp = 0;
        int rp = List.size() - 1;
        while (lp != rp) {
            if (List.get(lp) + List.get(rp) == target) {
                return true;

            } // case 2
            else if (List.get(lp) + List.get(rp) < target) {
                lp++;
            } else { // case 3
                rp--;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;
        System.out.println(pairsum1(list, target));
    }

}
