import java.util.*;

public class lonlyarraylist {
    public static int lonlyarray(ArrayList<Integer> List) {
        Collections.sort(List);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i - 1) + 1 < List.get(i) && List.get(i) + 1 < List.get(i + 1)) {
                List.add(List.get(i));
            }
        }

        if (List.size() == 1) {
            List.add(List.get(0));

        }
        if (List.size() > 1) {
            if (List.get(0) + 1 < List.get(1)) {
                List.add(List.get(0));

            }
            if (List.get(List.size() - 2) + 1 < List.get(List.size() - 1)) {
                List.add(List.get(List.size() - 1));
            }
        }

        return List.size();
    }

    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(3);
        List.add(5);
        List.add(3);
        System.out.println(lonlyarray(List));
    }
}