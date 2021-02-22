import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Archimedes {
    private static int radius = 1;
    private static double length = 1.0;
    private static int sides = 6;

    public static double  nextSide(){
        double b = length / 2;
        double c = (Math.pow(radius, 2)) - (Math.pow(b, 2));
        double d = Math.sqrt(c);
        double e = 1 - d;
        double f = (Math.pow(b, 2)) + (Math.pow(e, 2));
        double g = Math.sqrt(f);
        length = g;
        sides *= 2;
        return length;
    }

    public static double semiperimeters(double a) {
        double semiperimeter = (a * sides)/2;
        return semiperimeter;
    }

    public static void test() {
        double epsilon = StdIn.readDouble();
        double sides1 = semiperimeters(length);
        StdOut.print(sides + " ");
        StdOut.printf("%.12f\n",sides1 );
        double nside = semiperimeters(nextSide());
        StdOut.print(sides +" ");
        StdOut.printf("%.12f\n",nside );
        while (nside - sides1 >= epsilon) {
            sides1 = nside;
            nside = semiperimeters(nextSide());
            StdOut.print(sides +" ");
            StdOut.printf("%.12f\n", nside);
        }
    }

    public static void main(String[] args){
        test();
    }
}