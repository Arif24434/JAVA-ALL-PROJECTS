package AlgorithymTasks;

public class RecursiveFactorial {
    public static void main(String[] args) {

        System.out.println("AlgorithymTasks.Factorial of 1"+"  "+Factorial(1));
        System.out.println("AlgorithymTasks.Factorial of 2"+"  "+Factorial(2));
        System.out.println("AlgorithymTasks.Factorial of 3"+"  "+Factorial(3));
        System.out.println("AlgorithymTasks.Factorial of 4"+"  "+Factorial(4));
        System.out.println("AlgorithymTasks.Factorial of 5"+"  "+Factorial(5));
        System.out.println("AlgorithymTasks.Factorial of 6"+"  "+Factorial(6));
        System.out.println("AlgorithymTasks.Factorial of 7"+"  "+Factorial(7));
        System.out.println("AlgorithymTasks.Factorial of 8"+"  "+Factorial(8));
        System.out.println("AlgorithymTasks.Factorial of 9"+"  "+Factorial(9));
        System.out.println("AlgorithymTasks.Factorial of 10"+"  "+Factorial(10));

    }
    public static int Factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * Factorial (n-1));
        }

    }

}


