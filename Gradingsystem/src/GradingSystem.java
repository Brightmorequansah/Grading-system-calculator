import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner more = new Scanner(System.in);

        int testScore;

        System.out.println("Enter your testScore");
        testScore = more.nextInt();

        if (testScore<60) {
            System.out.println("Your grade is F");

        }else if (testScore<70) {
            System.out.println("Your grade is D");

        }else if (testScore<80) {
            System.out.println("Your grade is C");

        }else if (testScore<90) {
            System.out.println("Your grade is B");

        }else {
            System.out.println("Your grade is A");
        }
    }
}
