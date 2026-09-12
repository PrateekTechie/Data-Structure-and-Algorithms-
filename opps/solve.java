package opps;
import java.util.*;
public class solve {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of first complex number");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        complex c1 = new complex(real1,img1);

        System.out.println("Enter the real and imaginary part of second complex number");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();
        complex c2 = new complex(real2,img2);

        complex c3 = complex.add(c1,c2);
        System.out.print("Sum of two complex numbers is ");
        c3.printcomplex();

        complex c4 = complex.diff(c1,c2);
        System.out.print("Difference of two complex numbers is ");
        c4.printcomplex();

        complex c5 = complex.product(c1,c2);
        System.out.print("Product of two complex numbers is ");
        c5.printcomplex();
    }
}
class complex {
    int real;
    int img;
    public complex(int real,int img) {
        this.real = real;
        this.img = img;
    }

    public static complex add(complex a,complex b) {
        return new complex((a.real+b.real),(a.img+b.img));
    }

    public static complex diff(complex a,complex b) {
        return new complex((a.real-b.real),(a.img-b.img));
    }
    public static complex product(complex a,complex b) {
        return new complex((a.real*a.real) -(a.img*b.img) ,(a.real*b.img) -(a.img*b.real));

    }

    public void printcomplex() {
        if(real == 0 && img != 0) {
            System.out.println(img+"i");
        } else if (img == 0 && img != 0) {
            System.out.println(real);
        }
           else {
            System.out.println(real+"+"+img+"i");
           }
        }
    }
