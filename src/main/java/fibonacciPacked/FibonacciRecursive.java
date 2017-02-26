package fibonacciPacked;
public class FibonacciRecursive implements Fibonacci {


    @Override
    public long getN(int n) {
        long result = 0;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = getN(n - 1) + getN(n - 2);
        }
        return result;
    }
}
