package crackingCodingInterview.recursion;

public class Fibonanci {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }
    private static int fib(int n){
        if(n == 1) return 1;
        if(n==0) return 0;

        return fib(n-1) + fib(n-2);
    }
}
