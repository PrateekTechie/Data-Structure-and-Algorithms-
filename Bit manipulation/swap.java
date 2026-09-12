import java.util.*;

public class swap {// this sum is swaping two number without any third varible
    public static void swaping(int a, int b) {
        System.out.println("before Swapping : a =" + a + ",b =" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping : a =" + a + ",b=" + b);

    }

    public static int addone(int x) {
        return -(~x);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(addone(x));

    }
}