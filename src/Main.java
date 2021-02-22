import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static int gcd(int x, int y)
    {
        while (y != 0)
        {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public static void test_gcd()
    {
        while (!StdIn.isEmpty())
        {
            int x = StdIn.readInt();
            int y = StdIn.readInt();
            int z2 = gcd(x, y);
            StdOut.println(z2);
        }
    }

    public static void main(String[] args)
    {
        test_gcd();
    }
}
