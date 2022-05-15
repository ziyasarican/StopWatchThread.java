import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*


        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int result = (combination(number1)/(combination(number2)*combination(number1-number2)));
        System.out.println(result);

         */
        StopWatchThread thread1 = new StopWatchThread("thread1");
        StopWatchThread thread2 = new StopWatchThread("thread2");
        StopWatchThread thread3 = new StopWatchThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
