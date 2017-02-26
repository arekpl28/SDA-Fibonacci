package fibonacciPacked;

public class FibonacciFabric {
    public static Fibonacci produce(FibonacciEnum type){
        if (FibonacciEnum.INTERATION.equals(type)){
            return new FibonacciIterational();
        }
        if (FibonacciEnum.RECURSIVE.equals(type)){
            return new FibonacciRecursive();
        }return null;
    }
}
