import java.util.*;

public class pairsum2 {
    // using by the two pointer approch
    public static boolean pairsum2(ArrayList<Integer> List, int target) {
        int bp = -1;
        int n = List.size();
        for (int i = 0; i < n; i++) {
            if (List.get(i) > List.get(i + 1)) { // breaking point
                bp = i;
                break;

            }
        }
        int lp = bp + 1; // small
        int rp = bp; // large

        while (lp != rp) {
            if (List.get(lp) + List.get(rp) == target) {
                return true;
            } else if (List.get(lp) + List.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);
        int target = 16;
        System.out.println(pairsum2(List, target));
    }
}