import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("number:  ");
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var fb = new FizzBuzz();
        System.out.println(fb.checkFizzBuzz(number));
    }

}

