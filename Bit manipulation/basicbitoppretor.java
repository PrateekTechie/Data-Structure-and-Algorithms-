import java.util.*;

public class basicbitoppretor {

    public static int clearIntbit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int fastExpo(int a,int n ) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
            }
        }
    }

    
    }


