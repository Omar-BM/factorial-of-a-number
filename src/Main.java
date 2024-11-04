import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);
        int number;
        int factorial;
        int counter;

        System.out.println("Enter a integer number to calculate the factorial of it");
        number = lecture.nextInt();

        counter = number -1;
        while (counter > 0){
            number = number * counter;
            counter--;
        }
        factorial = number;
        System.out.println(factorial);
    }
}
