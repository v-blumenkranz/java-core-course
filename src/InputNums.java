import java.util.Scanner;

public class InputNums {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите y: ");
        int y = in.nextInt();
        System.out.print("Введите z: ");
        int z = in.nextInt();
        int a = (x + y + z)/3;
        System.out.print("Среднее арифметическое: " + a);
        int b = a/2;
        if (b>3) {
            System.out.print("Программа выполнена корректно");
        }
    }
}