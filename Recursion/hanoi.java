package Recursion;
public class hanoi {
     public static void towerofhanoi(int n,String src,String dist,String helpers) {
    if(n == 1) {
        System.out.println("Tranfer the disk" +n+ "from"+src+ "to" +dist );
        return;
    }

    //traner the n-1 dist src to helper using the dist as a helper
    towerofhanoi(n-1,src,dist,helpers);
    System.out.println("Transfer disk"+n+"from"+src+"to"+dist);
    towerofhanoi(n-1,helpers,src,dist);


}

public static void main(String args[]) {
    int n = 3;
    towerofhanoi(n,"S","H","P");
}

}
