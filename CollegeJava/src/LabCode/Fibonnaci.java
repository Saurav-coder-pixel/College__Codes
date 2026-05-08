class Fibonacci{
    public int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        System.out.println("Recursive Fibonacci of "  + fib.fibonacciRecursive(6));
        System.out.println("Iterative Fibonacci of " + fib.fibonacciIterative(5));
    }
}