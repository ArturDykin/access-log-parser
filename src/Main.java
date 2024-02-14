import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        double x = (double) (firstNumber / secondNumber);
        System.out.print("сумма: " + (firstNumber + secondNumber) +"\n" + "разность:  " + (firstNumber - secondNumber)+"\n" + "произведение:  " + (firstNumber - secondNumber)+"\n" + "часное:  " + x);
    }
}
