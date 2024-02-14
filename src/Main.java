import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();
        double x = (double) (firstNumber / secondNumber);
        System.out.print("сумма: " + (firstNumber + secondNumber) +"\n" + "разность:  " + (firstNumber - secondNumber)+"\n" + "произведение:  " + (firstNumber - secondNumber)+"\n" + "часное:  " + x);
    }
}
