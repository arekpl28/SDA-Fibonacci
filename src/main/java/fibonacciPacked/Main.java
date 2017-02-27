package fibonacciPacked;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacciRecursive = FibonacciFabric.produce(FibonacciEnum.RECURSIVE);
        System.out.println(fibonacciRecursive.getN(7));
        System.out.println();
        Fibonacci fibonacciIterational = FibonacciFabric.produce(FibonacciEnum.INTERATION);
        System.out.println(fibonacciIterational.getN(2));

    }
}
