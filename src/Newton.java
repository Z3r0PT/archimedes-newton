import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Newton {
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

    public static double mySqrt(double z){
        double x;
        if(z >= 1){
            x = z;
        }
        else{
            x = 1 / z;
        }
        return x;
    }

    public static double newton(double x, double z){
        double y0 = Math.pow(x,2) - z;
        double m = 2 * x;
        double b = y0 - (m * x);
        double x1 = (-b) / (m);
        return x1;
    }

    public static double nextGuess(double x){
        double a = mySqrt(x);
        double z = mySqrt(x);
        double xn = a;
        int i = 0;
        while(i < 7){
            xn = newton(xn, z);
            i++;
        }
        if(x < 1){
            return 1 / (xn);
        }
        else{
            return xn;
        }
    }

    public static void test() {
        while(!StdIn.isEmpty()){
            double x = StdIn.readDouble();
            //double y = mySqrt(x);
            //StdOut.println(y);
            double z = nextGuess(x);
            StdOut.printf("%.8f ", x);
            StdOut.printf("%.8f\n", z);
        }
    }

    public static void main(String[] args){
        test();
    }
}