import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int number = in.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Сумма нечетных чисел от 1 (включая единицу) до введенного числа: " + sum);
    }
}