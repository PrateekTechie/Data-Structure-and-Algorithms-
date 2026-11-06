import java.util.*;

public class monolist {
    public static boolean monolist(ArrayList<Integer> List) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < List.size() - 1; i++) {
            if (List.get(i) > List.get(i + 1)) {
                inc = false;
            }
            if (List.get(i) < List.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(3);
        List.add(2);
        System.out.println(monolist(List));
    }
}