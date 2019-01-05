import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("For how many numbers you wanna play:");
        FizzBuzz(scanner.nextInt());
    }

    public static void FizzBuzz(int amount)
    {
        for(int i = 1; i <= amount; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
        System.out.println("Thanks for playing!");

    }
}
