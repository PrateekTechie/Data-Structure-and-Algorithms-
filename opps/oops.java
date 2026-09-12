package opps;

public class oops {
    public static void main(String args[]) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
    }
}

class bank {
    String bankname;
    int password;
    int string
}

class pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}
